//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:40:13 PM CEST 
//


package org.kie.remote.jaxb.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCommentCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCommentCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}taskCommand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commentId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCommentCommand", propOrder = {
    "commentId"
})
@XmlRootElement(name = "delete-comment-command")
public class DeleteCommentCommand
    extends TaskCommand
{

    protected long commentId;

    /**
     * Gets the value of the commentId property.
     * 
     */
    public long getCommentId() {
        return commentId;
    }

    /**
     * Sets the value of the commentId property.
     * 
     */
    public void setCommentId(long value) {
        this.commentId = value;
    }

}
