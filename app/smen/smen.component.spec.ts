import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SmenComponent } from './smen.component';

describe('SmenComponent', () => {
  let component: SmenComponent;
  let fixture: ComponentFixture<SmenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SmenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SmenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
