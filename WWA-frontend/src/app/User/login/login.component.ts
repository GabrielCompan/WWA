import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {AuthService} from '../../Services/Auth/auth.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{

  loginForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private authService: AuthService, private router: Router) {}

  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  onSubmit() {
    if (this.loginForm.valid) {

      const {username, password} = this.loginForm.value;

      // Get the hashed password from the database
      const hashedPassword = this.getHashedPasswordFromDB(username);

      // Compare the entered password with the hashed password
      if (this.authService.comparePasswords(password, hashedPassword)) {
        // Log the user in
        this.authService.login();
        console.log('Logged in successfully');
        this.router.navigate(['/home'])
      } else {
        // Show an error message
        console.log('Incorrect username or password');
      }
    }
  }

  getHashedPasswordFromDB(username: string): string {
    // Replace this with a call to your backend service
    // to get the hashed password from the database
    return '$2a$10$2GiHOr2KcXUz0mnrFw0YfeXrwy.Fr1bGDbUKJydOlHZG14YMv5lsG';
  }
}
