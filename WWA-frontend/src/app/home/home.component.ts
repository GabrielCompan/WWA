import {ChangeDetectorRef, Component, OnInit} from '@angular/core';
import {AuthService} from '../Services/Auth/auth.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit{

  isLogged!: boolean;

  constructor(private authService: AuthService, private changeDetector: ChangeDetectorRef) {}

  ngOnInit() {
    this.authService.loggedIn.subscribe(value => {
      this.isLogged = value;
      console.log(this.isLogged);
      this.changeDetector.detectChanges();
    });
  }

}
