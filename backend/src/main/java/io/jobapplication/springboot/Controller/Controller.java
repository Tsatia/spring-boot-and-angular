package io.jobapplication.springboot.Controller;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.jobapplication.springboot.model.*;

@RestController
public class Controller {
	
	final String URI = "https://ip-ranges.amazonaws.com/ip-ranges.json";
	final String[] validArguments = {"eu","us", "ap","cn", "sa","af", "ca",};
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/ip-ranges.amazonaws")
	public IPAddress getIPs(@RequestParam(required=true) String region) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<IPAddress> response = restTemplate.getForEntity(URI, IPAddress.class);
		List<Prefixe> prefixes = response.getBody().getPrefixes();
	
		if(region.toLowerCase().equals("all")) {
			return response.getBody();
		}
		
		response.getBody().setPrefixes(filterPrefixes(prefixes, region.toLowerCase()));
		return response.getBody();
	}
	
	
	public List<Prefixe> filterPrefixes(List<Prefixe> prefixes, String filter) {
		if(!Arrays.stream(validArguments).anyMatch(filter.toLowerCase()::equals))
				throw new IllegalArgumentException("Valid arguments are: eu, us, ap,cn, sa,af,ca, and all.");
		return prefixes.stream().filter(p -> p.getRegion().startsWith(filter)).collect(Collectors.toList());
		
	}

}
