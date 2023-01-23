import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Fight} from '../model/fight';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FightApiService {
  baseUrl = 'https://localhost:8085';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of fights
  getFights(): Observable<Fight[]> {
    return this.http.get<Fight[]>(`${this.baseUrl}/fights`);
  }

  // Send a GET request to the API to get a fight by id
  getFight(id: number): Observable<Fight> {
    return this.http.get<Fight>(`${this.baseUrl}/fights/${id}`);
  }

  // Send a POST request to the API to add a new fight
  addFight(fight: Fight): Observable<Fight> {
    return this.http.post<Fight>(`${this.baseUrl}/fights`, fight);
  }

  // Send a PUT request to the API to update a fight
  updateFight(fight: Fight): Observable<Fight> {
    return this.http.put<Fight>(`${this.baseUrl}/fights/${fight.id}`, fight);
  }

  // Send a DELETE request to the API to delete a fight
  deleteFight(id: number): Observable<Fight> {
    return this.http.delete<Fight>(`${this.baseUrl}/fights/${id}`);
  }
}
