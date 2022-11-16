import { identifierName } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Order } from 'src/app/model/order';
import { OrderServiceService } from 'src/app/service/order-service.service';

@Component({
  selector: 'app-order-items',
  templateUrl: './order-items.component.html',
  styleUrls: ['./order-items.component.css']
})
export class OrderItemsComponent implements OnInit {

  orders: Order[] = [];
  constructor(private order: OrderServiceService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(
      ()=>{
        this.finishOrders();
      }
    )
  }

  finishOrders(){
    let result = this.route.snapshot.paramMap.has('id')
    if (result){
      this.getOrderByCategoryId();
    }else{
      this.getOrders();
    }
  }
  getOrders(){
    this.order.getOrders().subscribe(
      data => {
        console.log(data);
        this.orders = data
      }
    )
  }
  getOrderByCategoryId(){
    let idCategory: string|null = this.route.snapshot.paramMap.get('id');
    if(idCategory){

      this.order.getOrdersByCategoryId(+idCategory).subscribe(
        data => {
          this.orders = data
        }
      )
    }

  }

}
