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
    this.getTrainerById(1)
    if (this.trainer == null) {
      this.trainer = {
        id: 1,
        name: 'Ash',
        money: 0,
      }
    }
  }

  getTrainerById(id: number) {
    this.trainerService.getTrainerById(id).subscribe((data: Trainer) => {this.trainer = data});
  }

  addPokeDollars(amount: number) {

  }

}
