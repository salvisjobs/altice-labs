import { Component, NgZone, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { DataSequenceService } from 'src/app/services/data-sequence.service';

@Component({
  selector: 'app-exec-calc',
  templateUrl: './exec-calc.component.html',
  styleUrls: ['./exec-calc.component.css']
})
export class ExecCalcComponent {
  sequenceFrm: FormGroup;
  sequenceArr: any = [];
  
  constructor(
    public fb: FormBuilder,
    private ngZone: NgZone,
    private router: Router,
    public dataSequenceService: DataSequenceService
  ) {
      this.sequenceFrm = this.fb.group({
        algarism: [''],
        sequence: [''],
      });
  }

  submitForm() {
    this.dataSequenceService.GetSequence(this.sequenceFrm.value).subscribe((res) => {
      this.sequenceArr = res;
      //this.ngZone.run(() => this.router.navigateByUrl('/issues-list'));
    });
  }
}
