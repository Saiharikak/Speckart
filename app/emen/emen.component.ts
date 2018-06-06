import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emen',
  templateUrl: './emen.component.html',
  styleUrls: ['./emen.component.css']
})
export class EmenComponent implements OnInit {

  constructor() { }
   
   addtocart(event){
    alert("added to cart")
  }
  ngOnInit() {
  }

}
