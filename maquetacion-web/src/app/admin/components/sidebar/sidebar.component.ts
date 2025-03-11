import { Component } from '@angular/core';
import {MatSidenav, MatSidenavContainer} from '@angular/material/sidenav';
import {MatListItem, MatNavList} from '@angular/material/list';
import {MatIcon} from '@angular/material/icon';
import {RouterModule} from '@angular/router';

@Component({
  selector: 'app-sidebar',
  imports: [
    MatSidenav,
    MatNavList,
    MatSidenavContainer,
    MatIcon,
    MatListItem,
    RouterModule,
  ],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.scss'
})
export class SidebarComponent {

}
