import { Component } from '@angular/core';
import { EquipoService } from '../equipo.service';

@Component({
  selector: 'app-equipo-form',
  templateUrl: './equipo-form.component.html',
  styleUrls: ['./equipo-form.component.css']
})
export class EquipoFormComponent {
  equipo: any = {};

  constructor(private equipoService: EquipoService) { }

  saveEquipo() {
    this.equipoService.saveEquipo(this.equipo).subscribe(() => {
      console.log('Equipo guardado exitosamente'); 
      this.equipo = {}; 
    });
  }
}