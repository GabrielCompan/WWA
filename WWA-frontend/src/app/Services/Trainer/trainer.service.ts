import { Injectable } from '@angular/core';
import {TrainerApiService} from '../../Api/trainer-api.service';

@Injectable({
  providedIn: 'root'
})
export class TrainerService {

  constructor(private trainerApiService: TrainerApiService) { }

  getTrainerById(id: number) {
    return this.trainerApiService.getTrainerById(id);
  }

  addPokeDollars(id: number, amount: number) {
    this.trainerApiService.addPokeDolloars(id, amount);
  }

  addTrainer(name: string) {
    this.trainerApiService.addTrainer(name);
  }
}
