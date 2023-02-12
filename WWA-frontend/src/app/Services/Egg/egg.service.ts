import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Egg} from '../../model/egg';
import {EggApiService} from '../../Api/egg-api.service';

@Injectable({
  providedIn: 'root'
})
export class EggService {

  constructor(private eggApiService: EggApiService) { }

  getEggs(): Observable<Egg[]> {
    console.log("service called");
    return this.eggApiService.getEggs();
  }

  addEgg(egg: Egg): Observable<Egg> {
    console.log("service called");
    return this.eggApiService.addEgg(egg);
  }
}
