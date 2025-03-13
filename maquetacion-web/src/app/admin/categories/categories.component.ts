import { Component, inject } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatDialog } from '@angular/material/dialog';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule, MatHeaderRowDef, MatRowDef, MatHeaderCellDef, MatCellDef } from '@angular/material/table';
import { AddCategoryComponent } from './add-category/add-category.component';
import { EditCategoryComponent } from './edit-category/edit-category.component';

export interface Category {
  name: string;
  description: string;
  status: string;
}

const mock_data: Category[] = [
  { name: 'Estiramientos de cuello', description: 'Ejercicios para relajar y estirar los músculos del cuello.', status: 'Activo' },
  { name: 'Estiramientos de espalda', description: 'Ejercicios para aliviar la tensión en la espalda.', status: 'Activo' },
  { name: 'Estiramientos de piernas', description: 'Ejercicios para mejorar la flexibilidad de las piernas.', status: 'Activo' },
  { name: 'Ejercicios de respiración', description: 'Técnicas de respiración para reducir el estrés y mejorar la concentración.', status: 'Activo' },
  { name: 'Ejercicios de manos y muñecas', description: 'Movimientos para prevenir el síndrome del túnel carpiano.', status: 'Activo' },
  { name: 'Ejercicios de ojos', description: 'Técnicas para reducir la fatiga ocular.', status: 'Activo' },
  { name: 'Ejercicios de hombros', description: 'Movimientos para aliviar la tensión en los hombros.', status: 'Activo' },
  { name: 'Ejercicios de tobillos', description: 'Ejercicios para mejorar la movilidad de los tobillos.', status: 'Activo' },
  { name: 'Ejercicios de cadera', description: 'Movimientos para fortalecer y estirar la cadera.', status: 'Activo' },
  { name: 'Ejercicios de relajación', description: 'Técnicas para relajar el cuerpo y la mente.', status: 'Activo' }
];

@Component({
  selector: 'app-categories',
  imports: [
    MatIconModule,
    MatButtonModule,
    MatTableModule,
    MatHeaderRowDef,
    MatRowDef,
    MatHeaderCellDef,
    MatCellDef
  ],
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.scss']
})
export class CategoriesComponent {
  displayedColumns: string[] = ['name', 'description', 'status', 'actions'];
  dataSource = mock_data;

  readonly dialog = inject(MatDialog);

  openAddDialog() {
    const dialogRef = this.dialog.open(AddCategoryComponent);

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.dataSource = [...this.dataSource, result];
      }
    });
  }

  openEditDialog(element: Category) {
    const dialogRef = this.dialog.open(EditCategoryComponent, {
      data: { ...element }
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        const index = this.dataSource.findIndex(item => item.name === element.name);
        if (index !== -1) {
          this.dataSource[index] = result;
          this.dataSource = [...this.dataSource];
        }
      }
    });
  }

}