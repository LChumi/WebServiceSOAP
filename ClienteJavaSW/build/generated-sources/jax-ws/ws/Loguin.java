
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loguin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loguin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pasword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loguin", propOrder = {
    "usario",
    "pasword"
})
public class Loguin {

    protected String usario;
    protected String pasword;

    /**
     * Obtiene el valor de la propiedad usario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsario() {
        return usario;
    }

    /**
     * Define el valor de la propiedad usario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsario(String value) {
        this.usario = value;
    }

    /**
     * Obtiene el valor de la propiedad pasword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * Define el valor de la propiedad pasword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasword(String value) {
        this.pasword = value;
    }

}
