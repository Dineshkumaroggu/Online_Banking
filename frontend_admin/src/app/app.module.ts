import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { routing }  from './app.routing';


import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { LoginService } from './login.service';
import { UserAccountComponent } from './user-account/user-account.component';
import { UserService } from './user.service';
import { ChequeBookRequestComponent } from './chequeBookRequest/chequeBookRequest.component';
import { ChequeBookRequestService } from './chequeBookRequest.service';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { AuthGuard } from './auth.services';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    UserAccountComponent,
    ChequeBookRequestComponent,
    FooterComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    routing
  ],
  providers: [
    LoginService,
    UserService,
    ChequeBookRequestService,
    AuthGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
