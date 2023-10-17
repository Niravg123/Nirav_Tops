package assignment_corejava;

import java.util.ArrayList;

public class A21_remove_the_third_element_from_a_array_list {
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
	
	co.remove(3);
		
	System.out.println("****************");	
	
	for(String i :co)
	{
		System.out.println(i);
	}
	
	
}
}
