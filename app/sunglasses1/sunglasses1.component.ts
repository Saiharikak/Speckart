import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sunglasses1',
  templateUrl: './sunglasses1.component.html',
  styleUrls: ['./sunglasses1.component.css']
})
export class Sunglasses1Component implements OnInit {

  constructor() { }
  
   addtocart(event){
    alert("added to cart")
  }
  ngOnInit() {
  }

}
