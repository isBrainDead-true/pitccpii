import { ClienteService } from './../../services/cliente.service';
import { NavbarService } from './../../services/navbar.service';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { NgForm } from '@angular/forms';
import { Cliente } from 'src/app/model/Cliente';
import { HttpErrorResponse } from '@angular/common/http';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public cliente: Cliente | any;

  constructor(private router: Router, private nav: NavbarService, private clienteService: ClienteService) {

  }

  ngOnInit(): void {

  }

  return(): void {
    this.nav.displayNavbar.emit(true);
    this.router.navigate(["/"]);
  }

  AddCliente(addForm: NgForm): void {
    document.getElementById("close")?.click();
   /*  let element = document.getElementById("liveToastBtn");
    let btn = document.getElementById("btn-toast");

    var myToast = new bootstrap.Toast(element);

    btn?.addEventListener("click", function () {
      myToast.show();
    })

    btn?.click();
 */
    this.clienteService.AddCliente(addForm.value).subscribe(
      (Response: Cliente) => { alert("Conta Criada com sucesso") },
      (error: HttpErrorResponse) => { }
    );
  }



}
