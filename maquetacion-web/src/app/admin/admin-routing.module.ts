import {RouterModule, Routes} from '@angular/router';

import {NgModule} from '@angular/core';
import {DashboardComponent} from './dashboard/dashboard.component';
import {AdminComponent} from './admin.component';
import {ExercisesComponent} from './exercises/exercises.component';

const routes: Routes = [
  {
    path: '',
    component: AdminComponent,
    children: [
      {
        path: 'dashboard',
        component: DashboardComponent,
      },
      {
        path: 'exercises',
        component: ExercisesComponent,
      },
      {
        path: '**',
        redirectTo: 'dashboard'
      }
    ]
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AdminRoutingModule {}
