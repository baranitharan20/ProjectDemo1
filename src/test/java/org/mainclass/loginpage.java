package org.mainclass;

import org.openqa.selenium.WebDriver;
import org.testbase.BaseClass;
import org.testpojo.pojoclass;

public class loginpage {
	
	public static void main(String[] args) {
		
		BaseClass Base=new BaseClass();
		WebDriver d= Base.browserlaunch("chrome");
		Base.launchurl("https://www.facebook.com/");
		
		pojoclass pojo=new pojoclass();
		Base.login(pojo.getTxtusername(), "sbarani46@gmail.com");
		Base.login(pojo.getTxtpassword(), "40710105006");
		
		
	}

}
