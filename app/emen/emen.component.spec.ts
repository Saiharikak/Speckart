import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmenComponent } from './emen.component';

describe('EmenComponent', () => {
  let component: EmenComponent;
  let fixture: ComponentFixture<EmenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
