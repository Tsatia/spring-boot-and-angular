import {waitForAsync, ComponentFixture, TestBed} from '@angular/core/testing';
import { TableComponent } from './table.component';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { TableService } from '../table.service';

describe('TableComponent', () => {
  let component: TableComponent;
  let fixture: ComponentFixture<TableComponent>;


  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [TableComponent],
      imports: [HttpClientTestingModule],
      providers: [TableService, TableComponent],
    })
  }));


  beforeEach(() => {
    fixture = TestBed.createComponent(TableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });


  it('should create the table component', () => {
    expect(component).toBeTruthy();
  });

  
  it('should have title table component', () => {
    expect(component.ComponentName).toBe("table component");
  });
  
});
