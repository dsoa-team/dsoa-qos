/**
 */
package br.ufpe.cin.dsoa.api.qos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufpe.cin.dsoa.api.qos.QosFactory
 * @model kind="package"
 * @generated
 */
public interface QosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///br/ufpe/cin/dsoa/api/qos.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.ufpe.cin.dsoa.api.qos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QosPackage eINSTANCE = br.ufpe.cin.dsoa.api.qos.impl.QosPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufpe.cin.dsoa.api.qos.impl.AttributeImpl
	 * @see br.ufpe.cin.dsoa.api.qos.impl.QosPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__METADATA = 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA = 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl <em>Attribute Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl
	 * @see br.ufpe.cin.dsoa.api.qos.impl.QosPackageImpl#getAttributeCategory()
	 * @generated
	 */
	int ATTRIBUTE_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CATEGORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Supercategory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CATEGORY__SUPERCATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Subcategory List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CATEGORY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CATEGORY__ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Attribute Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CATEGORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribute Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see br.ufpe.cin.dsoa.api.qos.impl.QosPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 2;


	/**
	 * Returns the meta object for class '{@link br.ufpe.cin.dsoa.api.qos.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.Attribute#getId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Id();

	/**
	 * Returns the meta object for the container reference '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.Attribute#getCategory()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Category();

	/**
	 * Returns the meta object for the attribute '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the attribute '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.Attribute#getMetadata()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link br.ufpe.cin.dsoa.api.qos.Attribute#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.Attribute#getData()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Data();

	/**
	 * Returns the meta object for class '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory <em>Attribute Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Category</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.AttributeCategory
	 * @generated
	 */
	EClass getAttributeCategory();

	/**
	 * Returns the meta object for the attribute '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.AttributeCategory#getId()
	 * @see #getAttributeCategory()
	 * @generated
	 */
	EAttribute getAttributeCategory_Id();

	/**
	 * Returns the meta object for the container reference '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getSupercategory <em>Supercategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supercategory</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.AttributeCategory#getSupercategory()
	 * @see #getAttributeCategory()
	 * @generated
	 */
	EReference getAttributeCategory_Supercategory();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getSubcategoryList <em>Subcategory List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategory List</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.AttributeCategory#getSubcategoryList()
	 * @see #getAttributeCategory()
	 * @generated
	 */
	EReference getAttributeCategory_SubcategoryList();

	/**
	 * Returns the meta object for the attribute '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.AttributeCategory#getName()
	 * @see #getAttributeCategory()
	 * @generated
	 */
	EAttribute getAttributeCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufpe.cin.dsoa.api.qos.AttributeCategory#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see br.ufpe.cin.dsoa.api.qos.AttributeCategory#getAttributes()
	 * @see #getAttributeCategory()
	 * @generated
	 */
	EReference getAttributeCategory_Attributes();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="T T1"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QosFactory getQosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufpe.cin.dsoa.api.qos.impl.AttributeImpl
		 * @see br.ufpe.cin.dsoa.api.qos.impl.QosPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ID = eINSTANCE.getAttribute_Id();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CATEGORY = eINSTANCE.getAttribute_Category();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__METADATA = eINSTANCE.getAttribute_Metadata();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA = eINSTANCE.getAttribute_Data();

		/**
		 * The meta object literal for the '{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl <em>Attribute Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl
		 * @see br.ufpe.cin.dsoa.api.qos.impl.QosPackageImpl#getAttributeCategory()
		 * @generated
		 */
		EClass ATTRIBUTE_CATEGORY = eINSTANCE.getAttributeCategory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CATEGORY__ID = eINSTANCE.getAttributeCategory_Id();

		/**
		 * The meta object literal for the '<em><b>Supercategory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CATEGORY__SUPERCATEGORY = eINSTANCE.getAttributeCategory_Supercategory();

		/**
		 * The meta object literal for the '<em><b>Subcategory List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST = eINSTANCE.getAttributeCategory_SubcategoryList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CATEGORY__NAME = eINSTANCE.getAttributeCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CATEGORY__ATTRIBUTES = eINSTANCE.getAttributeCategory_Attributes();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see br.ufpe.cin.dsoa.api.qos.impl.QosPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //QosPackage
