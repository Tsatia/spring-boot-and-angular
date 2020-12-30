import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { TableService } from './table.service';

describe('TableService', () => {
  let service: TableService;
  let httpMock: HttpTestingController;
  let region : string;
  
  beforeEach(() => {
    TestBed.configureTestingModule({
    imports: [HttpClientTestingModule],
    providers: [TableService],
  });
  service = TestBed.inject(TableService);
  httpMock = TestBed.inject(HttpTestingController);
  region = "af";
});

  afterEach(() =>{
    httpMock.verify();
  });

  it('should return an dummy obersvable', () => {
    const dummyResponse: any[] = [
      {
        "syncToken":1,
        "createDate": 2,
        "prefixes": [
          {"ip_prefix":"150.222.208.82/31",
          "region":"af-south-1",
          "service":"AMAZON",
          "network_border_group":"af-south-1"}
        ]
      }
    ]

    service.sendGetRequest(region).subscribe(ips =>{
      expect(ips).toEqual(dummyResponse);
    })

    const request = httpMock.expectOne(service.GET_URL+region);
    expect(request.request.method).toBe('GET');
    request.flush(dummyResponse);
  });
});
