package br.ufpe.cin.dsoa.api.util;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author fabions
 *
 */
public interface PropertyValue extends EObject {
	/**
	 * @model
	 * @author fabions
	 *
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.PropertyValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * @model
	 * @author fabions
	 *
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.PropertyValue#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

}