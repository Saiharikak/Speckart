import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EkidsComponent } from './ekids.component';

describe('EkidsComponent', () => {
  let component: EkidsComponent;
  let fixture: ComponentFixture<EkidsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EkidsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EkidsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
