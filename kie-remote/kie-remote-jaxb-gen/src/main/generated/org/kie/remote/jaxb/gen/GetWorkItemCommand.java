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
 * <p>Java class for getWorkItemCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWorkItemCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="workItemId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWorkItemCommand")
@XmlRootElement(name = "getWorkItemCommand")
public class GetWorkItemCommand
    implements Command
{

    @XmlAttribute(name = "workItemId", required = true)
    protected long workItemId;

    /**
     * Gets the value of the workItemId property.
     * 
     */
    public long getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     * 
     */
    public void setWorkItemId(long value) {
        this.workItemId = value;
    }

}
