
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="childCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryId" type="{http://ejb/}categoryMaster" minOccurs="0"/>
 *         &lt;element name="childCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="childCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childCategory", propOrder = {
    "categoryId",
    "childCategoryId",
    "childCategoryName",
    "childImage"
})
public class ChildCategory {

    protected CategoryMaster categoryId;
    protected Integer childCategoryId;
    protected String childCategoryName;
    protected String childImage;

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryMaster }
     *     
     */
    public CategoryMaster getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryMaster }
     *     
     */
    public void setCategoryId(CategoryMaster value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the childCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildCategoryId() {
        return childCategoryId;
    }

    /**
     * Sets the value of the childCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildCategoryId(Integer value) {
        this.childCategoryId = value;
    }

    /**
     * Gets the value of the childCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildCategoryName() {
        return childCategoryName;
    }

    /**
     * Sets the value of the childCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildCategoryName(String value) {
        this.childCategoryName = value;
    }

    /**
     * Gets the value of the childImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildImage() {
        return childImage;
    }

    /**
     * Sets the value of the childImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildImage(String value) {
        this.childImage = value;
    }

}
