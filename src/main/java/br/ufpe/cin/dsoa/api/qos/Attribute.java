package br.ufpe.cin.dsoa.api.qos;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import br.ufpe.cin.dsoa.api.util.Property;

/**
 * @model
 */
public interface Attribute extends EObject {

	/**
	 * @model changeable="false"
	 */
	String getId();

	/**
	 * @model
	 */
	AttributeCategory getCategory();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(AttributeCategory value);

	/**
	 * @model changeable="false"
	 */
	String getName();

	/**
	 * @model
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * @model
	 */
	Map<String, Property> getMetadata();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Map<String, Property> value);

	/**
	 * @model
	 */
	Map<String, Property> getData();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(Map<String, Property> value);

	List<Property> getMetadataList();

	void addMetadata(Property propertyType);

	List<Property> getDataList();

	void addData(Property propertyType);

}