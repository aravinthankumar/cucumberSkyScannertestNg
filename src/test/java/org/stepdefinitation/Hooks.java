package org.stepdefinitation;

import org.baseclass.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void beforeHooks() {
		System.out.println("======beforeHooks=======");
		
	}
	
	@After
	public void afterHooks(Scenario sc) {
		System.out.println("=======afterHooks=======");
		
//		if(sc.isFailed()) {
//			TakesScreenshot tk =(TakesScreenshot)driver;
//			byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
//			sc.embed(ss, "image/png");
//			System.out.println("====take ss========");
//		}
            quit();
	}

}
