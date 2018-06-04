import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Sunglasses1Component } from './sunglasses1.component';

describe('Sunglasses1Component', () => {
  let component: Sunglasses1Component;
  let fixture: ComponentFixture<Sunglasses1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Sunglasses1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Sunglasses1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
