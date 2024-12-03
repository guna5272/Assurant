package task;

import baseclass.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksclass {
	
	base basee=base.getInstance();
@Before
public void browerLaunch() {
	basee.launch();
}
	

@After
public void browserClose() throws InterruptedException {
	Thread.sleep(9000);
//	basee.closingBrowser();
}

}
