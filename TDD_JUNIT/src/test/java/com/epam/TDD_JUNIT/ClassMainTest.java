package com.epam.TDD_JUNIT;

import junit.framework.TestCase;

public class ClassMainTest extends TestCase {

	ClassMain object=new ClassMain();
	
		public void testBringIt() 
		{
			assertEquals("BB",object.BringIt("AABB"));
		}
		
		
		public void test1() 
		{
			assertEquals("BAA",object.BringIt("AABAA"));	
		}
		
		
		public void test2() 
		{
			assertEquals("CD",object.BringIt("AACD"));	
		}
		    
		
		public void test3()
		{
			assertEquals("",object.BringIt("AA"));	
		}
		
		
		public void test4()
		{
			assertEquals("BBAA",object.BringIt("BBAA"));	
		}	

		
		public void test5() 
		{
			assertEquals("BCD",object.BringIt("BACD"));	
		}
		
		public void test6()
		{
			assertEquals("",object.BringIt(""));	
		}	
}
