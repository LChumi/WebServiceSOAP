/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author TOSHIBA PC
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "loguin")
    public Boolean loguin(@WebParam(name = "usario") String usuario, @WebParam(name = "pasword") String pasword) {
        if (usuario.equals("LChumi")&& pasword.equals("chumi123")) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "procesarPago")
    public int procesarPago(@WebParam(name = "deuda") int deuda, @WebParam(name = "pago") int pago) {
        if (pago>=deuda) {
            return pago-deuda;
        }else{
            return -1;
        }
    }

   
}
