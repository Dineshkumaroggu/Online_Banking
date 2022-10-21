import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {UserService} from '../user.service';

@Component({
  selector: 'app-user-account',
  templateUrl: './user-account.component.html',
  styleUrls: ['./user-account.component.css']
})
export class UserAccountComponent implements OnInit {

  	userList: Object[];
	
	constructor(private userService: UserService, private router: Router) {
		this.getUsers();
	}

	getUsers() {
		this.userService.getUsers().subscribe(
			res => {
			console.log(res);
            this.userList = JSON.parse(JSON.stringify(res));
      		},
      		error => console.log(error)
		)
	}

	

  	disableUser(username: number) {
  		this.userService.disableUser(username).subscribe(
			  response => {
				  console.log(response)
			  },
			  error => {
				  console.log(error)
			  }
		  );
  		location.reload();
  	}


  ngOnInit() {
  }

}
