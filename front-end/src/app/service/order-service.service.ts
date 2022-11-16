import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Order} from '../model/order';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  private baseUrl = 'http://localhost:8080/api/';
  //private url = 'http://localhost:8080/api/category?id=';

  constructor(private http: HttpClient) { }

  getOrders(): Observable<Order[]> {
    return this.http.get<Order[]>(`${this.baseUrl}allOrders`).pipe(
      map(
        response => {
          return response;
        }
      )
    )
  }

  getOrdersByCategoryId(id: number): Observable<Order[]> {
    return this.http.get<Order[]>(`${this.baseUrl}category?id=${id}`).pipe(
      map(
        response => response
      )
    )
  }
}
