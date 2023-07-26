package com.nephroPlus.testCases;

import org.testng.annotations.Test;

public class TC_BulkDeleteTest_02 extends BaseClass {

	@Test
	public void bulkDelete() {
		driver.get(bulkDeleteURL);
		System.out.println(driver.getCurrentUrl());
		logger.info("Bulk Delete Success");
	}
	
}
