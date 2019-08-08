package com.Xyphias.QA.RahulCompletePOM;

import org.testng.annotations.DataProvider;

import TestUtil.Util;

public class Random {
	
	
	public static String sheetName = "HelloSheet";
	
	public static Util testutil;
	
	@DataProvider
	
	public Object [][] TestDatatesting() {
		
		Object data[][] = testutil.getTestData1(sheetName);
		
		return data;
	}

}
