import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Egg} from '../model/egg';
import {Pokemon} from '../model/pokemon';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HatchingApiService {
  baseUrl = 'https://your-api-base-url.com';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of items
  getEggs():Observable<Egg[]>{
    return this.http.get<Egg[]>(`${this.baseUrl}/eggs`);
  }

  // Send a GET request to the API to get an item by id
  getEgg(id: number) {
    return this.http.get<Egg>(`${this.baseUrl}/eggs/${id}`);
  }

  // Send a POST request to the API to hatch an egg
  hatchEgg(egg: Egg) {
    return this.http.post<Pokemon>(`${this.baseUrl}/eggs/hatch`, egg);
  }
}
