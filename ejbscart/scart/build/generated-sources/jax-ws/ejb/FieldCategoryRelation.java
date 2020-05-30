
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldCategoryRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldCategoryRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childCategoryId" type="{http://ejb/}childCategory" minOccurs="0"/>
 *         &lt;element name="fieldCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldId" type="{http://ejb/}fieldsDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldCategoryRelation", propOrder = {
    "childCategoryId",
    "fieldCategoryId",
    "fieldId"
})
public class FieldCategoryRelation {

    protected ChildCategory childCategoryId;
    protected Integer fieldCategoryId;
    protected FieldsDetails fieldId;

    /**
     * Gets the value of the childCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link ChildCategory }
     *     
     */
    public ChildCategory getChildCategoryId() {
        return childCategoryId;
    }

    /**
     * Sets the value of the childCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildCategory }
     *     
     */
    public void setChildCategoryId(ChildCategory value) {
        this.childCategoryId = value;
    }

    /**
     * Gets the value of the fieldCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldCategoryId() {
        return fieldCategoryId;
    }

    /**
     * Sets the value of the fieldCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldCategoryId(Integer value) {
        this.fieldCategoryId = value;
    }

    /**
     * Gets the value of the fieldId property.
     * 
     * @return
     *     possible object is
     *     {@link FieldsDetails }
     *     
     */
    public FieldsDetails getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsDetails }
     *     
     */
    public void setFieldId(FieldsDetails value) {
        this.fieldId = value;
    }

}
