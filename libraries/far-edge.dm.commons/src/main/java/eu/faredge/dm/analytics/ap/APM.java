//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.22 at 05:37:35 �� EET 
//


package eu.faredge.dm.analytics.ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{eu:faredge:ea:processor}DataSink"/>
 *         &lt;element ref="{eu:faredge:ea:processor}DataSource" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="AnalyticsProcessorDefinitionReferenceID" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataSink",
    "dataSource"
})
@XmlRootElement(name = "APM")
public class APM {

    @XmlElement(name = "DataSink", required = true)
    protected DataSink dataSink;
    @XmlElement(name = "DataSource", required = true)
    protected List<DataSource> dataSource;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "AnalyticsProcessorDefinitionReferenceID")
    @XmlSchemaType(name = "anyURI")
    protected String analyticsProcessorDefinitionReferenceID;

    /**
     * Gets the value of the dataSink property.
     * 
     * @return
     *     possible object is
     *     {@link DataSink }
     *     
     */
    public DataSink getDataSink() {
        return dataSink;
    }

    /**
     * Sets the value of the dataSink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSink }
     *     
     */
    public void setDataSink(DataSink value) {
        this.dataSink = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSource }
     * 
     * 
     */
    public List<DataSource> getDataSource() {
        if (dataSource == null) {
            dataSource = new ArrayList<DataSource>();
        }
        return this.dataSource;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the analyticsProcessorDefinitionReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalyticsProcessorDefinitionReferenceID() {
        return analyticsProcessorDefinitionReferenceID;
    }

    /**
     * Sets the value of the analyticsProcessorDefinitionReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalyticsProcessorDefinitionReferenceID(String value) {
        this.analyticsProcessorDefinitionReferenceID = value;
    }

}