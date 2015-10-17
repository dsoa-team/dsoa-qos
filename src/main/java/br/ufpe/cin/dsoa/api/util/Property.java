package br.ufpe.cin.dsoa.api.util;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 * @author fabions
 * 
 */
public interface Property extends EObject {

	/**
	 * @model
	 * @author fabions
	 * 
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.Property#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * @model
	 * @author fabions
	 * 
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 * @author fabions
	 * 
	 */
	String getFullname();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.Property#getFullname <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullname</em>' attribute.
	 * @see #getFullname()
	 * @generated
	 */
	void setFullname(String value);

	/**
	 * @model
	 * @author fabions
	 * 
	 */
	String getType();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * @model
	 * @author fabions
	 * 
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.Property#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * @model
	 * @author fabions
	 * 
	 */
	boolean isGenerated();

	/**
	 * Sets the value of the '{@link br.ufpe.cin.dsoa.api.util.Property#isGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated</em>' attribute.
	 * @see #isGenerated()
	 * @generated
	 */
	void setGenerated(boolean value);

}