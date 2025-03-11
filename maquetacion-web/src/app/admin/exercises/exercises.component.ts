import {Component, inject} from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {
  MatCellDef,
  MatHeaderCellDef,
  MatHeaderRowDef,
  MatRowDef,
  MatTableModule
} from '@angular/material/table';
import {MatDialog} from '@angular/material/dialog';
import {AddExerciseComponent} from './add-exercise/add-exercise.component';

export interface Exercises {
  name: string;
  category: string;
  hasGuide: boolean;
  status: string;
}

const ELEMENT_DATA: Exercises[] = [
  {name: 'Hydrogen', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Helium', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Lithium', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Beryllium', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Boron', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Carbon', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Nitrogen', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Oxygen', category: 'Category 1', hasGuide: true, status: 'Activo'},
  {name: 'Fluorine', category: 'Category 1', hasGuide: true, status: 'Activo'},
  { name: 'Neon', category: 'Category 1', hasGuide: true, status: 'Activo'},
];


@Component({
  selector: 'app-exercises',
  imports: [
    MatIconModule,
    MatButtonModule,
    MatTableModule,
    MatHeaderRowDef,
    MatRowDef,
    MatHeaderCellDef,
    MatCellDef
  ],
  templateUrl: './exercises.component.html',
  styleUrl: './exercises.component.scss'
})
export class ExercisesComponent {
  displayedColumns: string[] = ['name', 'category', 'hasGuide', 'status', 'actions'];
  dataSource = ELEMENT_DATA;

  readonly dialog = inject(MatDialog);

  openDialog() {
    const dialogRef = this.dialog.open(AddExerciseComponent);

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }
}
