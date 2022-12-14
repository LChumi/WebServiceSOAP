
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSOperaciones", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSOperaciones {


    /**
     * 
     * @param pasword
     * @param usario
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loguin", targetNamespace = "http://ws/", className = "ws.Loguin")
    @ResponseWrapper(localName = "loguinResponse", targetNamespace = "http://ws/", className = "ws.LoguinResponse")
    @Action(input = "http://ws/WSOperaciones/loguinRequest", output = "http://ws/WSOperaciones/loguinResponse")
    public Boolean loguin(
        @WebParam(name = "usario", targetNamespace = "")
        String usario,
        @WebParam(name = "pasword", targetNamespace = "")
        String pasword);

    /**
     * 
     * @param deuda
     * @param pago
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "procesarPago", targetNamespace = "http://ws/", className = "ws.ProcesarPago")
    @ResponseWrapper(localName = "procesarPagoResponse", targetNamespace = "http://ws/", className = "ws.ProcesarPagoResponse")
    @Action(input = "http://ws/WSOperaciones/procesarPagoRequest", output = "http://ws/WSOperaciones/procesarPagoResponse")
    public int procesarPago(
        @WebParam(name = "deuda", targetNamespace = "")
        int deuda,
        @WebParam(name = "pago", targetNamespace = "")
        int pago);

}
