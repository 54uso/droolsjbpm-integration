//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:40:13 PM CEST 
//


package org.kie.remote.jaxb.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.kie.api.command.Command;


/**
 * <p>Java class for insertObjectCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertObjectCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="out-identifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="return-object" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="entry-point" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="disconnected" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertObjectCommand", propOrder = {
    "object"
})
@XmlRootElement(name = "insert-object-command")
public class InsertObjectCommand
    implements Command
{

    protected Object object;
    @XmlAttribute(name = "out-identifier")
    protected String outIdentifier;
    @XmlAttribute(name = "return-object", required = true)
    protected boolean returnObject;
    @XmlAttribute(name = "entry-point")
    protected String entryPoint;
    @XmlAttribute(name = "disconnected", required = true)
    protected boolean disconnected;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObject(Object value) {
        this.object = value;
    }

    /**
     * Gets the value of the outIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIdentifier() {
        return outIdentifier;
    }

    /**
     * Sets the value of the outIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIdentifier(String value) {
        this.outIdentifier = value;
    }

    /**
     * Gets the value of the returnObject property.
     * 
     */
    public boolean isReturnObject() {
        return returnObject;
    }

    /**
     * Sets the value of the returnObject property.
     * 
     */
    public void setReturnObject(boolean value) {
        this.returnObject = value;
    }

    /**
     * Gets the value of the entryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * Sets the value of the entryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPoint(String value) {
        this.entryPoint = value;
    }

    /**
     * Gets the value of the disconnected property.
     * 
     */
    public boolean isDisconnected() {
        return disconnected;
    }

    /**
     * Sets the value of the disconnected property.
     * 
     */
    public void setDisconnected(boolean value) {
        this.disconnected = value;
    }

}
