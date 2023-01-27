import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Trainer} from '../model/trainer';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TrainerApiService {
  baseUrl = 'http://localhost:8084';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of trainers
  getTrainers(): Observable<Trainer[]> {
    return this.http.get<Trainer[]>(`${this.baseUrl}/trainers`);
  }

  // Send a GET request to the API to get a trainer by id
  getTrainerById(id: number): Observable<Trainer> {
    return this.http.get<Trainer>(`${this.baseUrl}/trainers/${id}`);
  }

  addPokeDolloars(id: number, amount: number) {
    return this.http.post(`${this.baseUrl}/trainers/${id}/addPokeDollars/${amount}`, {});
  }

  // Send a POST request to the API to add a new trainer
  addTrainer(name: string): Observable<Trainer> {
    return this.http.post<Trainer>(`${this.baseUrl}/Trainer`, name);
  }

  // Send a PUT request to the API to update a trainer
  updateTrainer(trainer: Trainer): Observable<Trainer> {
    return this.http.put<Trainer>(`${this.baseUrl}/trainers/${trainer.id}`, trainer);
  }

  // Send a DELETE request to the API to delete a trainer
  deleteTrainer(id: number): Observable<Trainer> {
    return this.http.delete<Trainer>(`${this.baseUrl}/trainers/${id}`);
  }
}
