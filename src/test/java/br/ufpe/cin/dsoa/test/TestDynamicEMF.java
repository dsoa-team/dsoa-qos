package br.ufpe.cin.dsoa.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;


public class TestDynamicEMF {

	public static void main(String[] args) {
		EPackage dsoaPackage = EcoreFactory.eINSTANCE.createEPackage();
		dsoaPackage.setName("br.ufpe.cin.dsoa");
		
		EClass qosCategoryClass = EcoreFactory.eINSTANCE.createEClass();
		qosCategoryClass.setName("QoSCategory");
		
		EAttribute nameAtt = EcoreFactory.eINSTANCE.createEAttribute();
		nameAtt.setName("name");
		nameAtt.setEType(EcorePackage.eINSTANCE.getEString());
		nameAtt.setDefaultValue("Performance");
		qosCategoryClass.getEStructuralFeatures().add(nameAtt);
		
		dsoaPackage.getEClassifiers().add(qosCategoryClass);

		EFactory dsoaFactory = dsoaPackage.getEFactoryInstance();
		EObject performanceCat = dsoaFactory.create(qosCategoryClass);
		System.out.println("Categoria: " + performanceCat.eGet(nameAtt));
		
		EAttribute namespaceAtt = EcoreFactory.eINSTANCE.createEAttribute();
		namespaceAtt.setName("namespace");
		namespaceAtt.setEType(EcorePackage.eINSTANCE.getEString());
		namespaceAtt.setDefaultValue("DSOA");
		qosCategoryClass.getEStructuralFeatures().add(namespaceAtt);
		
		dsoaFactory = dsoaPackage.getEFactoryInstance();
		EObject securityCat = dsoaFactory.create(qosCategoryClass);
		System.out.println("Categoria: " + securityCat.eGet(nameAtt));
		System.out.println("Namespace: " + securityCat.eGet(namespaceAtt));
		
		System.out.println(securityCat.eClass().equals(performanceCat.eClass()));
	}
}