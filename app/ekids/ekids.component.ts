import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ekids',
  templateUrl: './ekids.component.html',
  styleUrls: ['./ekids.component.css']
})
export class EkidsComponent implements OnInit {

  constructor() { }

  
  addtocart(event){
    alert("added to cart")
  }
  ngOnInit() {
  }

}
