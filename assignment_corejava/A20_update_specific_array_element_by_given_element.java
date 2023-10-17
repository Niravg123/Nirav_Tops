package assignment_corejava;

import java.util.ArrayList;

public class A20_update_specific_array_element_by_given_element {
public static void main(String[] args) {

	ArrayList<String> co = new ArrayList<String>();
	co.add("Black");
	co.add("Red");
	co.add("Green");
	co.add("purple");
	co.add("pink");
	
	
	for(String i :co)
	{
		System.out.println(i);
	}
	
	co.set(2,"Blue");
		
	System.out.println("****************");	
	for(String i :co)
	{
		System.out.println(i);
	}
	
}
}
