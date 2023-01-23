import { Injectable } from '@angular/core';
import {StoreApiService} from '../../Api/store-api.service';
import {Egg} from '../../model/egg';

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  constructor(private storeApiService: StoreApiService) { }

  getEggs(): Egg[] {
    let eggs: Egg[] = [];
    this.storeApiService.getEggs().subscribe(value => {
       eggs = value;
    });
    return eggs;
  }
}
