import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { UserAccountComponent } from './user-account/user-account.component';
import { ChequeBookRequestComponent } from './chequeBookRequest/chequeBookRequest.component';
import { AuthGuard } from './auth.services';

const appRoutes: Routes = [
  {
    path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  },
  {
  	path: 'login',
  	component: LoginComponent
  },
  {
  	path: 'userAccount',
  	component: UserAccountComponent,canActivate: [AuthGuard] 
  },
  {
    path: 'chequeBookRequest',
    component: ChequeBookRequestComponent,canActivate: [AuthGuard] 
  }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);