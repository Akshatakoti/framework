package test_report;


import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.logging.log4j.core.Appender;
import org.testng.annotations.Test;

public class script_generatewith_report {
	@Test
	public void test1() throws IOException
	{
		Layout lay = new PatternLayout("%d %c %m %n");
		  Appender app= new FileAppender(lay,"./report/l1.log");
		  Logger log = Logger.getLogger(this.getClass().getName());
		  log.error("error");
			log.fatal("fatal");
			log.info("info");
	

}
}
          