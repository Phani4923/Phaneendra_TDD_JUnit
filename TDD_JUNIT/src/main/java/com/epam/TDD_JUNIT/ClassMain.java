package com.epam.TDD_JUNIT;

public class ClassMain {
	
	public static String Clear(String s,int position)
	{
		return s.substring(0,position)+s.substring(position+1, s.length());
	}
	
	public String BringIt(String s)
	{
		if(s=="")
			return "";
		String result=null;
		if(s.charAt(0)=='A' && s.charAt(1)=='A')
		{
			result=s.substring(2,s.length());
		}
		else if(s.charAt(0)=='A')
		{
			result=Clear(s,0);
		}
		else if(s.charAt(1)=='A')
		{
			result=Clear(s,1);
		}
		else
		{
			result=s;
		}
		return(result);
	}
}
