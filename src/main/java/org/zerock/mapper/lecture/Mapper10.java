package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;

public interface Mapper10 {
	public int removeCustomer();
	public int removeEmployee();
	public int removeCustomerById(int id);
	public int removeEmployeeById(int id);
	public int addCustomer();
	public int addSupplier();
	public int insertCustomer(JavaBean18 customer);
	public int insertSupplier(JavaBean19 supplier);
	public int insertCustomerAndKey(JavaBean18 customer);
	public int insertSupplierAndKey(JavaBean19 supplier);
}
