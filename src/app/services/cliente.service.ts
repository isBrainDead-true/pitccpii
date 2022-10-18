import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Cliente } from '../model/Cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private apiURL: string = environment.url;

  constructor(private http: HttpClient) { }

  getClientes(): Observable<Cliente[]>{
    return this.http.get<Cliente[]>(`${this.apiURL}/cliente/all`)
  }

  AddCliente(cliente: Cliente): Observable<Cliente>{
    return this.http.post<Cliente>(`${this.apiURL}/cliente/new`, cliente)
  }

  updateCliente(cliente: Cliente): Observable<Cliente>{
    return this.http.put<Cliente>(`${this.apiURL}/cliente/update`, cliente)
  }

  deleteCliente(clienteId: number): Observable<void>{
    return this.http.delete<void>(`${this.apiURL}/cliente/delete/${clienteId}`)
  }


}
