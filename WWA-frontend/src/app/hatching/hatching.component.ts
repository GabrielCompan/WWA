import {Component, OnInit} from '@angular/core';
import {HatchingService} from '../Services/Hatching/hatching.service';
import {Incubator} from '../model/incubator';
import {Egg} from '../model/egg';

@Component({
  selector: 'app-hatching',
  templateUrl: './hatching.component.html',
  styleUrls: ['./hatching.component.scss']
})
export class HatchingComponent implements OnInit {

  incubators!: Incubator[];

  testEgg: Egg = {id: 1, name: "test", price: 100, hatchingTime: 1000}

  constructor(private hatchingService: HatchingService) { }

  ngOnInit(): void {
    this.hatchingService.getHatching().subscribe(value => this.incubators = value);
  }

  getHatching(){
    return this.hatchingService.getHatching().subscribe(value => this.incubators = value);
  }

  addEgg(idIncubator: number, egg: Egg) {
    return this.hatchingService.addEgg(idIncubator, egg).subscribe();
  }

  createIncubators(){
    return this.hatchingService.createIncubators().subscribe();
  }

  withdrawEgg(idIncubator: number){
    return this.hatchingService.withdrawEgg(idIncubator).subscribe();
  }
}
