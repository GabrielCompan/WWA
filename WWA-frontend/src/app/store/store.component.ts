import { Component } from '@angular/core';
import {Egg} from '../model/egg';
import {StoreService} from '../Services/Store/store.service';

@Component({
  selector: 'app-shop',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.scss']
})
export class StoreComponent {

  eggList!: Egg[];

  constructor(private storeService: StoreService) { }

  buyEgg(id: number){}
}
