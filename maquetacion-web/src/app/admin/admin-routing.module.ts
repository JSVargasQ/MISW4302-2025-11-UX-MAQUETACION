import {RouterModule, Routes} from '@angular/router';

import {NgModule} from '@angular/core';
import {DashboardComponent} from './dashboard/dashboard.component';
import {AdminComponent} from './admin.component';
import {ExercisesComponent} from './exercises/exercises.component';
import { CategoriesComponent } from './categories/categories.component';

const routes: Routes = [
  {
    path: '',
    component: AdminComponent,
    children: [
      // {
      //   path: 'dashboard',
      //   component: DashboardComponent,
      // },
      {
        path: 'categories',
        component: CategoriesComponent,
      },
      {
        path: 'exercises',
        component: ExercisesComponent,
      },
      {
        path: '**',
        redirectTo: 'categories',
      }
    ]
  }
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AdminRoutingModule {}
