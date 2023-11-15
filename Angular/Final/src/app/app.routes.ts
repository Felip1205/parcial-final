import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EquipoListComponent } from './equipo-list/equipo-list.component';
import { EquipoFormComponent } from './equipo-form/equipo-form.component';

const routes: Routes = [
  { path: 'equipos', component: EquipoListComponent },
  { path: 'agregar-equipo', component: EquipoFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }