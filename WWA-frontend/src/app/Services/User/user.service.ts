import { Injectable } from '@angular/core';
import {Trainer} from '../../model/trainer';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  currentUser!: Trainer;

  constructor() { }

  getCurrentUser(): Trainer {
    return this.currentUser;
  }

  setCurrentUser(user: Trainer): void {
    this.currentUser = user;
  }
}
