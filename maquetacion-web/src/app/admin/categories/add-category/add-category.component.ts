import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';

@Component({
  selector: 'app-add-category',
  imports: [
    CommonModule,
    MatDialogModule,
    MatButtonModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    FormsModule
  ],
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.scss']
})
export class AddCategoryComponent implements OnInit {
  name: string = '';
  description: string = '';
  status: string = 'Activo';

  constructor(public dialogRef: MatDialogRef<AddCategoryComponent>) { }

  ngOnInit() {
  }

  save() {
    const newCategory = {
      name: this.name,
      description: this.description,
      status: this.status
    };
    this.dialogRef.close(newCategory);
  }

  cancel() {
    this.dialogRef.close();
  }

}
