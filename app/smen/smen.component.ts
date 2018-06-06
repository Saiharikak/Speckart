import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-smen',
  templateUrl: './smen.component.html',
  styleUrls: ['./smen.component.css']
})
export class SmenComponent implements OnInit {

   sunglass;
   constructor(private http : HttpClient,private router :Router) { }

  ngOnInit() {
    this.http.get('test/rest/myresource/sunglassdetails').subscribe(res =>{console.log (res), this.sunglass = res,console.log(this.sunglass)});
    

  }
  buynow(price) {
   // alert("Yout total price is" + price);
    alert("successfully purchased")
    
  }
}
