import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from 'rxjs';
import {Egg} from '../model/egg';

@Injectable({
  providedIn: 'root'
})
export class StoreApiService {
  baseUrl = 'https://localhost:8081';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of items
  getEggs(): Observable<Egg[]> {
    return this.http.get<Egg[]>(`${this.baseUrl}/eggs`);
  }

  // Send a GET request to the API to get an item by id
  getItem(id: number) {
    return this.http.get(`${this.baseUrl}/items/${id}`);
  }

  // Send a POST request to the API to create a new item
  createItem(item: any) {
    return this.http.post(`${this.baseUrl}/items`, item);
  }

  // Send a PUT request to the API to update an existing item
  updateItem(id: number, item: any) {
    return this.http.put(`${this.baseUrl}/items/${id}`, item);
  }

  // Send a DELETE request to the API to delete an item
  deleteItem(id: number) {
    return this.http.delete(`${this.baseUrl}/items/${id}`);
  }
}
