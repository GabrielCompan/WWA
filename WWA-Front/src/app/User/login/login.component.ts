import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validator, Validators} from '@angular/forms';
import {AuthService} from '../../Services/Auth/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{

  loginForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private authService: AuthService) {}

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
        console.log('Logged in successfully');
        // navigate to the desired page
      } else {
        // Show an error message
        console.log('Incorrect username or password');
      }
    }
  }

  getHashedPasswordFromDB(username: string): string {
    // Replace this with a call to your backend service
    // to get the hashed password from the database
    return '$2a$10$p6nJLF5r5J5ux5.5Y5Z5G5u5F5x5b5';
  }
}
