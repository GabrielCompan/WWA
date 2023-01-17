import { Component } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {AuthService} from '../../Services/Auth/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {

  registerForm!: FormGroup;

  constructor(private formBuilder: FormBuilder, private authService: AuthService) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
      confirmPassword: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.registerForm.valid) {

      const {username, password} = this.registerForm.value;
      // encrypt the password
      const hashedPassword = this.authService.encryptPassword(password);

      // Save the user to the database
      this.saveUserToDB(username, hashedPassword);
    }
  }

  saveUserToDB(username: string, hashedPassword: string) {
    // Replace this with a call to your backend service
    // to save the user to the database
    console.log(`Saving user ${username} with hashed password ${hashedPassword} to the database`);
  }
}
