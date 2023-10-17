package assignment_corejava;

public class A14_concatenate_a_given_string_to_the_end_of_another_string {
public static void main(String[] args) {
	
	String str1 = "Sun rises ";
    String str2 = "Moon rises";
    
    System.out.println("String 1: " + str1);
    System.out.println("String 2: " + str2); 
   
    String str3 = str1.concat(str2);

    System.out.println("The concatenated string: " + str3);
	
}
}
