package assignment_corejava;

abstract class Parent
{
	void message()
	{
		
	}
}
class Subclass1 extends Parent
{
	void message()
	{
		System.out.println("This is first Subclass");
	}
}
class Subclass2 extends Parent
{
	void message()
	{
		System.out.println("This is second Subclass");
	}
}

public class A25_Create_an_abstract_class_Parent_with_a_method_message_It_has_two_subclasses_each_having_a_method_with_the_same_name {
public static void main(String[] args) {
	
	Subclass1 sb1 = new Subclass1();
	Subclass2 sb2 = new Subclass2();
	
	sb1.message();
	sb2.message();
	
	
	
}
}

