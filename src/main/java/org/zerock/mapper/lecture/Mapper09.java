package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.JavaBean16;
import org.zerock.domain.lecture.JavaBean17;

public interface Mapper09 {

	String getCustomerNameId(int id);
	String getEmployeeFirstNameId(int id);
	List<String> getCustomerNameByCityAndCountry(String country, String city);
	String getSupplierNameByCityAndCountry(String country, String city);
	String getContactName(JavaBean04 p);
	String getSupplierContactName(JavaBean04 p);
	List<String> getProductName(JavaBean16 arg1, JavaBean17 arg2);
	
}
