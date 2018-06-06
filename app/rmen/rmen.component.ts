import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-rmen',
  templateUrl: './rmen.component.html',
  styleUrls: ['./rmen.component.css']
})
export class RmenComponent implements OnInit {

  constructor() { }

  
  addtocart(event){
    alert("added to cart")
  }
  ngOnInit() {
  }

}
