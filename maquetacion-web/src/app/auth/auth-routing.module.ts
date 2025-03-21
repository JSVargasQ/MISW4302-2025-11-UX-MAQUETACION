import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {NgModule} from '@angular/core';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes), LoginComponent],
  exports: [RouterModule],
})
export class AuthRoutingModule{}
