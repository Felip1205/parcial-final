import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EquipoService {
  private apiUrl = 'http://localhost:8080/api/equipos'; 

  constructor(private http: HttpClient) { }

  getAllEquipos(): Observable<any> {
    return this.http.get(this.apiUrl);
  }

  saveEquipo(equipo: any): Observable<any> {
    return this.http.post(this.apiUrl, equipo);
  }
}

