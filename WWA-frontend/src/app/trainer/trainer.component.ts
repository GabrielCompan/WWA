import {Component, OnInit} from '@angular/core';
import {TrainerService} from '../Services/Trainer/trainer.service';
import {Trainer} from '../model/trainer';

@Component({
  selector: 'app-trainer',
  templateUrl: './trainer.component.html',
  styleUrls: ['./trainer.component.scss']
})
export class TrainerComponent implements OnInit {

  trainer!: Trainer;

  constructor(private trainerService: TrainerService) { }

  ngOnInit() {
    //this.getTrainerById(1)
   // if (this.trainer == null) {
      this.addTrainer("Ash");
   // }
  }

  getTrainerById(id: number) {
    this.trainerService.getTrainerById(id).subscribe((data: Trainer) => {this.trainer = data});
  }

  addPokeDollars(idTrainer: number, amount: number) {
    this.trainerService.addPokeDollars(idTrainer, amount).subscribe((data: Trainer) => {this.trainer = data});
  }

  addTrainer(name: string) {
    this.trainerService.addTrainer(name).subscribe((data: Trainer) => {this.trainer = data});

  }

}
