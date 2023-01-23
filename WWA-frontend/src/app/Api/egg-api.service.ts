import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Egg } from '../model/egg';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EggApiService {
  baseUrl = 'https://localhost:8082';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of eggs
  getEggs(): Observable<Egg[]> {
    return this.http.get<Egg[]>(`${this.baseUrl}/eggs`);
  }

  // Send a GET request to the API to get an egg by id
  getEgg(id: number): Observable<Egg> {
    return this.http.get<Egg>(`${this.baseUrl}/eggs/${id}`);
  }

  // Send a POST request to the API to add a new egg
  addEgg(egg: Egg): Observable<Egg> {
    return this.http.post<Egg>(`${this.baseUrl}/eggs`, egg);
  }

  // Send a PUT request to the API to update an egg
  updateEgg(egg: Egg): Observable<Egg> {
    return this.http.put<Egg>(`${this.baseUrl}/eggs/${egg.id}`, egg);
  }

  // Send a DELETE request to the API to delete an egg
  deleteEgg(id: number): Observable<Egg> {
    return this.http.delete<Egg>(`${this.baseUrl}/eggs/${id}`);
  }
}
