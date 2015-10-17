package br.ufpe.cin.dsoa.test;

import java.util.List;

import br.ufpe.cin.dsoa.api.qos.Attribute;
import br.ufpe.cin.dsoa.api.qos.AttributeCategory;
import br.ufpe.cin.dsoa.api.qos.QosFactory;

public class TestDsoaModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QosFactory factory = QosFactory.eINSTANCE;
		AttributeCategory category = factory.createAttributeCategory();
		category.setName("Performance");
		Attribute responseTime = factory.createAttribute();
		responseTime.setCategory(null);
		category.getAttributes().add(responseTime);
		responseTime.setCategory(null);
		List<Attribute> attributes = category.getAttributes();
		System.out.println(attributes.isEmpty());
		System.out.println(responseTime.getCategory().getName());
	}

}
