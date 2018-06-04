import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RmenComponent } from './rmen.component';

describe('RmenComponent', () => {
  let component: RmenComponent;
  let fixture: ComponentFixture<RmenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RmenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RmenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
