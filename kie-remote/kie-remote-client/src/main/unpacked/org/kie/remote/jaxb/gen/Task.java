//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:40:13 PM CEST 
//


package org.kie.remote.jaxb.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.kie.api.command.Command;
import org.kie.internal.task.api.model.SubTasksStrategy;


/**
 * <p>Java class for jaxbTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jaxbTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="task-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="names" type="{}jaxbI18NText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjects" type="{}jaxbI18NText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="descriptions" type="{}jaxbI18NText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="people-assignments" type="{}people-assignments" minOccurs="0"/&gt;
 *         &lt;element name="subTasksStrategy" type="{}subTasksStrategy" minOccurs="0"/&gt;
 *         &lt;element name="taskData" type="{}task-data" minOccurs="0"/&gt;
 *         &lt;element name="deadlines" type="{}deadlines" minOccurs="0"/&gt;
 *         &lt;element name="form-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jaxbTask", propOrder = {
    "id",
    "priority",
    "version",
    "archived",
    "taskType",
    "name",
    "subject",
    "description",
    "names",
    "subjects",
    "descriptions",
    "peopleAssignments",
    "subTasksStrategy",
    "taskData",
    "deadlines",
    "formName"
})
@XmlRootElement(name = "task")
public class Task
    extends Object
{

    protected Long id;
    protected Integer priority;
    protected Integer version;
    protected Boolean archived;
    @XmlElement(name = "task-type")
    protected String taskType;
    protected String name;
    protected String subject;
    protected String description;
    protected List<I18NText> names;
    protected List<I18NText> subjects;
    protected List<I18NText> descriptions;
    @XmlElement(name = "people-assignments")
    protected PeopleAssignments peopleAssignments;
    protected SubTasksStrategy subTasksStrategy;
    protected TaskData taskData;
    protected Deadlines deadlines;
    @XmlElement(name = "form-name")
    protected String formName;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchived(Boolean value) {
        this.archived = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskType(String value) {
        this.taskType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I18NText }
     * 
     * 
     */
    public List<I18NText> getNames() {
        if (names == null) {
            names = new ArrayList<I18NText>();
        }
        return this.names;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I18NText }
     * 
     * 
     */
    public List<I18NText> getSubjects() {
        if (subjects == null) {
            subjects = new ArrayList<I18NText>();
        }
        return this.subjects;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I18NText }
     * 
     * 
     */
    public List<I18NText> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<I18NText>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the peopleAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link PeopleAssignments }
     *     
     */
    public PeopleAssignments getPeopleAssignments() {
        return peopleAssignments;
    }

    /**
     * Sets the value of the peopleAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleAssignments }
     *     
     */
    public void setPeopleAssignments(PeopleAssignments value) {
        this.peopleAssignments = value;
    }

    /**
     * Gets the value of the subTasksStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link SubTasksStrategy }
     *     
     */
    public SubTasksStrategy getSubTasksStrategy() {
        return subTasksStrategy;
    }

    /**
     * Sets the value of the subTasksStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubTasksStrategy }
     *     
     */
    public void setSubTasksStrategy(SubTasksStrategy value) {
        this.subTasksStrategy = value;
    }

    /**
     * Gets the value of the taskData property.
     * 
     * @return
     *     possible object is
     *     {@link TaskData }
     *     
     */
    public TaskData getTaskData() {
        return taskData;
    }

    /**
     * Sets the value of the taskData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskData }
     *     
     */
    public void setTaskData(TaskData value) {
        this.taskData = value;
    }

    /**
     * Gets the value of the deadlines property.
     * 
     * @return
     *     possible object is
     *     {@link Deadlines }
     *     
     */
    public Deadlines getDeadlines() {
        return deadlines;
    }

    /**
     * Sets the value of the deadlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deadlines }
     *     
     */
    public void setDeadlines(Deadlines value) {
        this.deadlines = value;
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

}
