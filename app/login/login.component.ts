import {HttpClient} from '@angular/common/http';
import {Component, OnInit} from '@angular/core';
import {FormGroup, FormControl, Validators} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
    formGroup: FormGroup;
  constructor(private http: HttpClient, private router: Router) {}
   
  onClick1(data) {
    this.http.post("test/rest/myresource/login", {
      email: data.email,
      password: data.password
    }
      , {responseType: 'text'}

    ).subscribe(
      (res: any) => {
        console.log(res);
        if (res != null) {
          alert("welcome" + data.email)
          this.router.navigateByUrl('/men');


        } else {
          alert("wrong username or password");
        }
      },
      err => {
        console.log(err);
        alert("byee");
      }
      );

  }

  

  ngOnInit() {
    this.formGroup = new FormGroup({
      Email: new FormControl('', [
        Validators.required,
        Validators.pattern(/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/)
      ]),
      Password: new FormControl('', [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(20)
      ])
    });
  }

  onSubmit() {
    console.log(this.formGroup);
  }

  onReset() {
    this.formGroup.reset();
  }




}



