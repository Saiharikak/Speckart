import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  
  constructor(private http : HttpClient) { }

  onClick(data){
    this.http.post("test/rest/myresource/registrationform",{
      name : data.name,
      email : data.email,
      password : data.password,
      phoneno : data.phoneno
      }
      , {responseType: 'text'}
      
      ).subscribe(
        (res : any)=>{
          console.log(res);
          //alert("hii");
        },
        err =>{
          console.log(err);
          //alert("byee");
        }
      );
    
    }

  ngOnInit() {
  }

}
