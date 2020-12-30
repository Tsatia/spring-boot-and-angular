package io.jobapplication.springboot.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@WebMvcTest(Controller.class)
class ControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	private RequestBuilder request;

	@Test
	void getIPsAF() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=af");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
	
	
	@Test
	void getIPsUS() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=us");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
	
	@Test
	void getIPsEU() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=eu");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
	
	@Test
	void getIPsAP() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=ap");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
	
	@Test
	void getIPsSA() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=sa");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
	
	
	@Test
	void getIPsCA() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=ca");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
	
	
	@Test
	void getIPsCN() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=cn");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(false, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
	
	
	@Test
	void getIPsALL() throws Exception {
		request = MockMvcRequestBuilders.get("/ip-ranges.amazonaws?region=all");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"us"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"af"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"eu"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"ap"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"sa"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"ca"));
		assertEquals(true, result.getResponse().getContentAsString().contains("\"region\":\"cn"));

	}
}
