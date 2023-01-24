import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './User/login/login.component';
import {RegisterComponent} from './User/register/register.component';
import {HomeComponent} from './home/home.component';
import {StoreComponent} from './store/store.component';
import {EggComponent} from './egg/egg.component';
import {HatchingComponent} from './hatching/hatching.component';
import {TeamComponent} from './team/team.component';
import {FightComponent} from './fight/fight.component';
import {TrainerComponent} from './trainer/trainer.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'store', component: StoreComponent},
  {path: 'egg', component: EggComponent},
  {path: 'hatching', component: HatchingComponent},
  {path: 'team', component: TeamComponent},
  {path: 'fight', component: FightComponent},
  {path: 'trainer', component: TrainerComponent},
  {path: '**', redirectTo: 'home'}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
