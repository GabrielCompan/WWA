import { Injectable } from '@angular/core';
import {TrainerApiService} from '../../Api/trainer-api.service';
import {Observable} from "rxjs";
import {Trainer} from "../../model/trainer";

@Injectable({
  providedIn: 'root'
})
export class TrainerService {

  constructor(private trainerApiService: TrainerApiService) { }

  getTrainerById(id: number) {
    return this.trainerApiService.getTrainerById(id);
  }

  addPokeDollars(id: number, amount: number) {
    return this.trainerApiService.addPokeDolloars(id, amount);
  }

  addTrainer(name: string): Observable<Trainer> {
    return this.trainerApiService.addTrainer(name);
  }
}
