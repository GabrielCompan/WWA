import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Egg} from '../model/egg';
import {Pokemon} from '../model/pokemon';
import {Observable} from 'rxjs';
import {Incubator} from '../model/incubator';

@Injectable({
  providedIn: 'root'
})
export class HatchingApiService {
  baseUrl = 'http://localhost:8083';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of items-
  getHatching():Observable<Incubator[]>{
    console.log("api called");
    return this.http.get<Egg[]>(`${this.baseUrl}/hatching/all`);
  }

  // Send a GET request to the API to get an item by id
  getEgg(id: number) {
    return this.http.get<Egg>(`${this.baseUrl}/eggs/${id}`);
  }

  // Send a POST request to the API to hatch an egg
  hatchEgg(egg: Egg) {
    return this.http.post<Pokemon>(`${this.baseUrl}/eggs/hatch`, egg);
  }

  addEgg(idIncubator: number, egg: Egg) {
    return this.http.post<Egg>(`${this.baseUrl}/hatching/add/${idIncubator}`, egg);
  }

  createIncubators(){
    return this.http.get<Incubator>(`${this.baseUrl}/hatching`);
  }

  withdrawEgg(idIncubator: number){
    return this.http.post<Egg>(`${this.baseUrl}/hatching/withdraw/${idIncubator}`, null);
  }
}
