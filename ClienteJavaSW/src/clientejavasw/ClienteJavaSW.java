/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientejavasw;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author TOSHIBA PC
 */
public class ClienteJavaSW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WSOperaciones_Service conexion=new WSOperaciones_Service();
        WSOperaciones consumo=conexion.getWSOperacionesPort();
        //System.out.println(consumo.loguin("LChumi", "chumi123"));
        if (consumo.loguin("LChumi", "chumi123")) {
            System.out.println("acceso Correcto");
        }else{
            System.out.println("acceso denegado");
        }
        System.out.println(consumo.procesarPago(50, 200));
    }
    
}
