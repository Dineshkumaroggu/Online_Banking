import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


@Injectable()
export class UserService {

  constructor (private http:HttpClient){}

  getUsers() {
    let url = "http://localhost:8090/admin/getallusers";
    return this.http.get(url);
  }

   disableUser (username:number) {
     let url = "http://localhost:8090/admin/admin/deleteuser/"+username;
     return this.http.delete(url);
   }

}
