package br.ufpe.cin.dsoa.api.qos;

import java.util.Map;

import br.ufpe.cin.dsoa.api.util.PropertyValue;

public interface AttributeValue {

	
	Attribute getAttribute();

	Map<String, PropertyValue> getMetadata();

	Map<String, PropertyValue> getData();

	Object getValue();

}