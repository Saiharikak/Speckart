import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RwomenComponent } from './rwomen.component';

describe('RwomenComponent', () => {
  let component: RwomenComponent;
  let fixture: ComponentFixture<RwomenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RwomenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RwomenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
