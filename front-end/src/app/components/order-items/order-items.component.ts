import { Component, OnInit } from '@angular/core';
import { Order } from 'src/app/model/order';
import { OrderServiceService } from 'src/app/service/order-service.service';

@Component({
  selector: 'app-order-items',
  templateUrl: './order-items.component.html',
  styleUrls: ['./order-items.component.css']
})
export class OrderItemsComponent implements OnInit {

  orders: Order[] = [];
  constructor(private order: OrderServiceService) { }

  ngOnInit(): void {
    this.getOrders();
  }

  getOrders(){
    this.order.getOrders().subscribe(
      data => {
        console.log(data);
        this.orders = data
      }
    )
  }

}
