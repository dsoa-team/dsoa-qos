/**
 */
package br.ufpe.cin.dsoa.api.qos.impl;

import br.ufpe.cin.dsoa.api.qos.Attribute;
import br.ufpe.cin.dsoa.api.qos.AttributeCategory;
import br.ufpe.cin.dsoa.api.qos.QosPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl#getSupercategory <em>Supercategory</em>}</li>
 *   <li>{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl#getSubcategoryList <em>Subcategory List</em>}</li>
 *   <li>{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufpe.cin.dsoa.api.qos.impl.AttributeCategoryImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeCategoryImpl extends MinimalEObjectImpl.Container implements AttributeCategory {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubcategoryList() <em>Subcategory List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategoryList()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeCategory> subcategoryList;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QosPackage.Literals.ATTRIBUTE_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.ATTRIBUTE_CATEGORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCategory getSupercategory() {
		if (eContainerFeatureID() != QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY) return null;
		return (AttributeCategory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupercategory(AttributeCategory newSupercategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSupercategory, QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupercategory(AttributeCategory newSupercategory) {
		if (newSupercategory != eInternalContainer() || (eContainerFeatureID() != QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY && newSupercategory != null)) {
			if (EcoreUtil.isAncestor(this, newSupercategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupercategory != null)
				msgs = ((InternalEObject)newSupercategory).eInverseAdd(this, QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST, AttributeCategory.class, msgs);
			msgs = basicSetSupercategory(newSupercategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY, newSupercategory, newSupercategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeCategory> getSubcategoryList() {
		if (subcategoryList == null) {
			subcategoryList = new EObjectContainmentWithInverseEList<AttributeCategory>(AttributeCategory.class, this, QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST, QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY);
		}
		return subcategoryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.ATTRIBUTE_CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, QosPackage.ATTRIBUTE_CATEGORY__ATTRIBUTES, QosPackage.ATTRIBUTE__CATEGORY);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupercategory((AttributeCategory)otherEnd, msgs);
			case QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubcategoryList()).basicAdd(otherEnd, msgs);
			case QosPackage.ATTRIBUTE_CATEGORY__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY:
				return basicSetSupercategory(null, msgs);
			case QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST:
				return ((InternalEList<?>)getSubcategoryList()).basicRemove(otherEnd, msgs);
			case QosPackage.ATTRIBUTE_CATEGORY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY:
				return eInternalContainer().eInverseRemove(this, QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST, AttributeCategory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QosPackage.ATTRIBUTE_CATEGORY__ID:
				return getId();
			case QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY:
				return getSupercategory();
			case QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST:
				return getSubcategoryList();
			case QosPackage.ATTRIBUTE_CATEGORY__NAME:
				return getName();
			case QosPackage.ATTRIBUTE_CATEGORY__ATTRIBUTES:
				return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QosPackage.ATTRIBUTE_CATEGORY__ID:
				setId((String)newValue);
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY:
				setSupercategory((AttributeCategory)newValue);
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST:
				getSubcategoryList().clear();
				getSubcategoryList().addAll((Collection<? extends AttributeCategory>)newValue);
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__NAME:
				setName((String)newValue);
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QosPackage.ATTRIBUTE_CATEGORY__ID:
				setId(ID_EDEFAULT);
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY:
				setSupercategory((AttributeCategory)null);
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST:
				getSubcategoryList().clear();
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QosPackage.ATTRIBUTE_CATEGORY__ATTRIBUTES:
				getAttributes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QosPackage.ATTRIBUTE_CATEGORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case QosPackage.ATTRIBUTE_CATEGORY__SUPERCATEGORY:
				return getSupercategory() != null;
			case QosPackage.ATTRIBUTE_CATEGORY__SUBCATEGORY_LIST:
				return subcategoryList != null && !subcategoryList.isEmpty();
			case QosPackage.ATTRIBUTE_CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QosPackage.ATTRIBUTE_CATEGORY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AttributeCategoryImpl
