package com.p.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class select_options {
	public static void sele_option(WebElement ele,Object data) {
		Select sele=utility_object.select_object(ele);
		if(data instance of integer)
		{
		sele.selectByIndex((intger)data);	
		}
		else if(data instance of string) {
			try {
				sele.selectByValue((string)data);
			}
			catch(Exception e) {
				sele.deselectByVisibleText((string)data);
			}
		
		}
	}
public static void dese_all_opt(WebElement ele)
{
	Select sel=utility_object.select_object(ele);
	sel.deselectAll();
}
public static lis<webelement>get_options(WebElement ele)
{
	Select sel=utility_objects.select_object(ele);
	return sel.getOptions(); j8
}

