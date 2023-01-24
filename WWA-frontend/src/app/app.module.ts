import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginComponent } from './User/login/login.component';
import { AppRoutingModule } from './app-routing.module';
import {RouterModule} from '@angular/router';
import {ReactiveFormsModule} from '@angular/forms';
import { RegisterComponent } from './User/register/register.component';
import { HomeComponent } from './home/home.component';
import { StoreComponent } from './store/store.component';
import { LogoutComponent } from './User/logout/logout.component';
import { HatchingComponent } from './hatching/hatching.component';
import { EggComponent } from './egg/egg.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { TeamComponent } from './team/team.component';
import { FightComponent } from './fight/fight.component';
import { TrainerComponent } from './trainer/trainer.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    StoreComponent,
    LogoutComponent,
    HatchingComponent,
    EggComponent,
    TeamComponent,
    FightComponent,
    TrainerComponent
  ],
  imports: [
    RouterModule,
    ReactiveFormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
