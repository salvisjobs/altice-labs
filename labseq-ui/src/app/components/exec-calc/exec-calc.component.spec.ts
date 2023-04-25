import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExecCalcComponent } from './exec-calc.component';

describe('ExecCalcComponent', () => {
  let component: ExecCalcComponent;
  let fixture: ComponentFixture<ExecCalcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExecCalcComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExecCalcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
