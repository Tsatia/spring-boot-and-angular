import { TableService } from './../table.service';
import { Component } from '@angular/core';


@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent {
  public Data: Array<any>  = [];
  public synctoken: string = "";
  public createDate: string = "";
  public ComponentName: string = "table component"

  constructor(private service: TableService) {}

  getRegion(){
    let region = (<HTMLSelectElement>document.getElementById("mySelect")).value;
    this.service.sendGetRequest(region).subscribe((data: any)=>{
      this.Data = data["prefixes"];
      this.synctoken = data["syncToken"];
      this.createDate = data["createDate"];
    });  
   }

}
