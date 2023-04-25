import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ExecCalcComponent } from './components/exec-calc/exec-calc.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'exec-calc' },
  {path: 'exec-calc', component: ExecCalcComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
