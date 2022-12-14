
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Loguin_QNAME = new QName("http://ws/", "loguin");
    private final static QName _LoguinResponse_QNAME = new QName("http://ws/", "loguinResponse");
    private final static QName _ProcesarPago_QNAME = new QName("http://ws/", "procesarPago");
    private final static QName _ProcesarPagoResponse_QNAME = new QName("http://ws/", "procesarPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Loguin }
     * 
     */
    public Loguin createLoguin() {
        return new Loguin();
    }

    /**
     * Create an instance of {@link LoguinResponse }
     * 
     */
    public LoguinResponse createLoguinResponse() {
        return new LoguinResponse();
    }

    /**
     * Create an instance of {@link ProcesarPago }
     * 
     */
    public ProcesarPago createProcesarPago() {
        return new ProcesarPago();
    }

    /**
     * Create an instance of {@link ProcesarPagoResponse }
     * 
     */
    public ProcesarPagoResponse createProcesarPagoResponse() {
        return new ProcesarPagoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loguin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Loguin }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loguin")
    public JAXBElement<Loguin> createLoguin(Loguin value) {
        return new JAXBElement<Loguin>(_Loguin_QNAME, Loguin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoguinResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoguinResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loguinResponse")
    public JAXBElement<LoguinResponse> createLoguinResponse(LoguinResponse value) {
        return new JAXBElement<LoguinResponse>(_LoguinResponse_QNAME, LoguinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "procesarPago")
    public JAXBElement<ProcesarPago> createProcesarPago(ProcesarPago value) {
        return new JAXBElement<ProcesarPago>(_ProcesarPago_QNAME, ProcesarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "procesarPagoResponse")
    public JAXBElement<ProcesarPagoResponse> createProcesarPagoResponse(ProcesarPagoResponse value) {
        return new JAXBElement<ProcesarPagoResponse>(_ProcesarPagoResponse_QNAME, ProcesarPagoResponse.class, null, value);
    }

}
