import { Injectable } from '@angular/core';
import * as bcrypt from 'bcryptjs';
import {Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  loggedIn: Subject<boolean> = new Subject<boolean>();

  constructor() { }

  encryptPassword(password: string): string {
    const salt = bcrypt.genSaltSync(10);
    return bcrypt.hashSync(password, salt);
  }

  comparePasswords(password: string, hash: string): boolean {
    return bcrypt.compareSync(password, hash);
  }

  logout() {
    localStorage.removeItem('token');
    this.loggedIn.next(false);
  }

  login() {
    this.loggedIn.next(true);
  }

}
