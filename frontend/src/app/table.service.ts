import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TableService {

  GET_URL = "http://0.0.0.0:8080/ip-ranges.amazonaws?region="

  constructor(private httpClient: HttpClient){}
  
  sendGetRequest(region: string){
    return this.httpClient.get(this.GET_URL+region);
  }
}
