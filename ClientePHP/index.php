<?php

/* 
 * @TOSHIBA PC
 */

//Crear cllient
$cliente = new SoapClient('http://localhost:8080/U1ServicioWebSoapAUT2/WSOperaciones?WSDL');

//usar operacion|||
$resultado_pago = $cliente->ProcesarPago([
    "total"=>1000,
    "pago"=>100
])->return;

if($resultado_pago>=0){
    echo 'Pago realizado';
} else {
    echo 'Dinero insuficiente';
}