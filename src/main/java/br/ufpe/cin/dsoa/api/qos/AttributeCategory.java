package br.ufpe.cin.dsoa.api.qos;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface AttributeCategory extends EObject {

	/**
	 * @model
	 */
	String getId();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * @model
	 */
	AttributeCategory getSupercategory();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getSupercategory <em>Supercategory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supercategory</em>' container reference.
	 * @see #getSupercategory()
	 * @generated
	 */
	void setSupercategory(AttributeCategory value);

	/**
	 * @model
	 */
	EList<AttributeCategory> getSubcategoryList();

	/**
	 * @model
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 */
	EList<Attribute> getAttributes();
}