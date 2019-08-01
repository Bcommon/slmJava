package bdd.slm.java.Utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {

	VariableUtils vutils = new VariableUtils();

	public void takeSnapShot() throws IOException, InterruptedException {
		VariableUtils.screenShotCounter++;
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmsss");
		Date date = new Date();
		//TimeUnit.SECONDS.sleep(1);

		vutils.screenShotName = VariableUtils.screenShotCounter + "_" + VariableUtils.driverType + "_"
				+ dateFormat.format(date).toString()+".jpg";
		//vutils.screenShotPath = "d://" + vutils.screenShotName;
		vutils.screenShotPath = ApplicationConstants.SCREEN_SHOT_PATH + vutils.screenShotName;
		System.out.println(vutils.screenShotPath);
		 File destFile=new File(vutils.screenShotPath);
		 TakesScreenshot scrShot =((TakesScreenshot)VariableUtils.driver);
		 File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile, destFile);

	
	}

}
