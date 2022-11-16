import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrderItemsComponent } from './components/order-items/order-items.component';
import { CategoryItemsComponent } from './components/category-items/category-items.component';
import { RouterModule, Routes } from '@angular/router';
import { DropdownMenuComponent } from './components/dropdown-menu/dropdown-menu.component';

// http://localhost:4200/
const routes: Routes = [
    // http://localhost:4200/category/id
    {path: 'category/:id', component:OrderItemsComponent},

    // http://localhost:4200/category
    {path: 'category', component:OrderItemsComponent},
    // http://localhost:4200/category
    {path: 'orders', component:OrderItemsComponent},

    // http://localhost:4200/
    {path: '', redirectTo: '/orders',pathMatch: 'full'},

    // if user enter any thing without all routes
    {path: '**', redirectTo: '/orders',pathMatch: 'full'}

]

@NgModule({
  declarations: [
    AppComponent,
    OrderItemsComponent,
    CategoryItemsComponent,
    DropdownMenuComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
