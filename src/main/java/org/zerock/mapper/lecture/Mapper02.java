package org.zerock.mapper.lecture;

import java.time.LocalDate;
import java.util.List;

public interface Mapper02 {
	
	public List<String> getCustomerNames();
	
	public List<Integer> getCustomerIds();
	
	public List<Double> getProductPrices();
	
	public List<LocalDate> getOrderDates();
}
