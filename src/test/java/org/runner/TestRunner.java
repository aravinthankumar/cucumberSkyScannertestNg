package org.runner;

import org.report.JVMReport;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\resources\\features\\skyScannerFlight.feature",
glue="org.stepdefinitation",dryRun=false,

		monochrome=true,
		plugin= {"pretty",
				"json:src\\test\\resources\\report\\JVMReport.json",
				"rerun:src\\test\\resources\\report\\faild.txt"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	@AfterClass
	public static void Report() {
		JVMReport.generationJVMReport("src\\\\test\\\\resources\\\\report\\\\JVMReport.json");
		System.out.println("========report done===========");

	}
	
	

}
