package util;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;

public class ScreenshotManager {

	public void getScreenshot() throws HeadlessException, AWTException {

		try {

			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");
			Calendar now = Calendar.getInstance();
			BufferedImage screencapture = new Robot()
					.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(screencapture, "jpg",
					new File("target/screenshot/" + formatter.format(now.getTime()) + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

}
