import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-rwomen',
  templateUrl: './rwomen.component.html',
  styleUrls: ['./rwomen.component.css']
})
export class RwomenComponent implements OnInit {

  constructor() { }

  addtocart(event){
    alert("added to cart")
  }
  
  ngOnInit() {
  }

}
