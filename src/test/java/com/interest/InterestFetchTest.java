package com.interest;

import org.junit.Test;

public class InterestFetchTest {
	@Test
	public void testGetDataForMonth(){
		InterestRatesImpl intImpl = new InterestRatesImpl();
		System.out.println("result "+intImpl.getDataForMonth("2017-12"));
	}
}
