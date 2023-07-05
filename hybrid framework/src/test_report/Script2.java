package test_report;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Script2 {
	@Test
	public void test1()
	{
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(this.getClass().getName());
		log.error("error");
		log.fatal("fatal");
		log.info("info");
		
	}
	

}
