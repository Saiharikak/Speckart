import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {RegistrationComponent} from './registration/registration.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {MenComponent} from './men/men.component';
import {WomenComponent} from './women/women.component';
import {HomeComponent} from './home/home.component';
import {KidsComponent} from './kids/kids.component';
import {CartComponent} from './cart/cart.component';
import {HttpClientModule} from '@angular/common/http';
import {HeaderComponent} from './header/header.component';
import {SunglassesComponent} from './kids/sunglasses/sunglasses.component';
import {Sunglasses1Component} from './sunglasses1/sunglasses1.component';
import {EkidsComponent} from './ekids/ekids.component';
import {EmenComponent} from './emen/emen.component';
import {SmenComponent} from './smen/smen.component';
import {RmenComponent} from './rmen/rmen.component';
import {NgBootstrapFormValidationModule} from 'ng-bootstrap-form-validation';
import { RwomenComponent } from './rwomen/rwomen.component';



export const appRoutes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'men', component: MenComponent},
  {path: 'women', component: WomenComponent},
  {path: 'sunglasses1', component: Sunglasses1Component},
  {path: 'registration', component: RegistrationComponent},
  {path: 'login', component: LoginComponent},
  {path: '', component: LoginComponent},
  {path: 'ekids', component: EkidsComponent},
  {path: 'kids', component: KidsComponent},
  {path: 'readingglassesmen', component: RmenComponent},
  {path: 'readingglasseswomen', component: RwomenComponent},
   {path: 'emen', component:EmenComponent},
    {path: 'cart', component:CartComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    MenComponent,
    WomenComponent,
    HomeComponent,
    KidsComponent,
    CartComponent,
    HeaderComponent,
    SunglassesComponent,
    Sunglasses1Component,
    EkidsComponent,
    EmenComponent,
    SmenComponent,
    RmenComponent,
    RwomenComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    NgBootstrapFormValidationModule.forRoot(),
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})




export class AppModule {}
