import { Injectable } from '@angular/core';
import {HatchingApiService} from '../../Api/hacthing-api.service';

@Injectable({
  providedIn: 'root'
})
export class HatchingService {

  constructor(private hatchingApiService: HatchingApiService) { }

  getHatching(){
    return this.hatchingApiService.getHatching();
  }
}
