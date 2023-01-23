import { Component } from '@angular/core';
import {Egg} from '../model/egg';

@Component({
  selector: 'app-shop',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.scss']
})
export class StoreComponent {

  eggList!: Egg[];

  buyEgg(id: number){}
}
