import { Component, OnInit } from '@angular/core';
import {Observable}  from 'rxjs/Observable';
import {LoginService} from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loggedIn: boolean;
  invalidCred:boolean;
  username: string;
  password: string;

	constructor (private loginService: LoginService) {
    this.invalidCred=false;
    if(localStorage.getItem('PortalAdminHasLoggedIn') == '' || localStorage.getItem('PortalAdminHasLoggedIn') == null) {
      this.loggedIn = false;
    } else {
      this.loggedIn = true;
    }
  }
  
  onSubmit() {
  	this.loginService.sendCredential(this.username, this.password).subscribe(
      res => {
        console.log("Success");
        this.loggedIn=true;
        localStorage.setItem('PortalAdminHasLoggedIn', 'true');
        location.reload();
      },
      err =>{ console.log(err);
        this.invalidCred=true;
      }
    );
  }

  ngOnInit() {
    
  }

}
