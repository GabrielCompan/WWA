import { Injectable } from '@angular/core';
import {HatchingApiService} from '../../Api/hacthing-api.service';
import {Egg} from '../../model/egg';

@Injectable({
  providedIn: 'root'
})
export class HatchingService {

  constructor(private hatchingApiService: HatchingApiService) { }

  getHatching(){
    return this.hatchingApiService.getHatching();
  }

  addEgg(idIncubator: number, egg: Egg) {
    return this.hatchingApiService.addEgg(idIncubator, egg);
  }

  createIncubators(){
    return this.hatchingApiService.createIncubators();
  }

  withdrawEgg(idIncubator: number){
    return this.hatchingApiService.withdrawEgg(idIncubator);
  }
}
