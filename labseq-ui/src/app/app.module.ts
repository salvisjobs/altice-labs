import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ExecCalcComponent } from './components/exec-calc/exec-calc.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { DataSequenceService } from './services/data-sequence.service';


@NgModule({
  declarations: [
    AppComponent,
    ExecCalcComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  providers: [
    DataSequenceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
