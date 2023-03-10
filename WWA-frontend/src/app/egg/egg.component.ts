import {Component, OnInit} from '@angular/core';
import {EggService} from '../Services/Egg/egg.service';

@Component({
  selector: 'app-egg',
  templateUrl: './egg.component.html',
  styleUrls: ['./egg.component.scss']
})
export class EggComponent implements OnInit {

    constructor(private eggService: EggService) { }

    ngOnInit(): void {
      this.getEggs();
    }

    getEggs(): void {
      console.log("component called");
      this.eggService.getEggs().subscribe(eggs => console.log(eggs));
    }

    addEgg(): void {
      console.log("component called");
      this.eggService.addEgg({id: 1, name: "test", price: 100, hatchingTime: 1000}).subscribe(egg => console.log(egg));
    }
}
