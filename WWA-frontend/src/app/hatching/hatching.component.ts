import {Component, OnInit} from '@angular/core';
import {HatchingService} from '../Services/Hatching/hatching.service';
import {Incubator} from '../model/incubator';

@Component({
  selector: 'app-hatching',
  templateUrl: './hatching.component.html',
  styleUrls: ['./hatching.component.scss']
})
export class HatchingComponent implements OnInit {

  incubators!: Incubator[];

  constructor(private hatchingService: HatchingService) { }

  ngOnInit(): void {
    this.hatchingService.getHatching().subscribe(value => this.incubators = value);
  }

}
