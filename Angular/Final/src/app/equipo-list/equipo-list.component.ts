import { Component, OnInit } from '@angular/core';
import { EquipoService } from '../equipo.service';

@Component({
  selector: 'app-equipo-list',
  templateUrl: './equipo-list.component.html',
  styleUrls: ['./equipo-list.component.css']
})
export class EquipoListComponent implements OnInit {
  equipos: any[] = [];

  constructor(private equipoService: EquipoService) { }

  ngOnInit(): void {
    this.loadEquipos();
  }

  loadEquipos() {
    this.equipoService.getAllEquipos().subscribe(data => {
      this.equipos = data;
    });
  }
}


