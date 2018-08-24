package Lab_4;

interface MyInterface
{
	   
	   public void method1();
	   public void method2();
	}
	

public class Interface_02 implements MyInterface {

	   
	   public void method1()
	   {
		System.out.println("My name is Tania");
	   }
	   public void method2()
	   {
		System.out.println("My course teacher name is MIK");
	   }
	   
	   public static void main(String arg[])
	   {
		   Interface_02 obj = new Interface_02();
		obj.method1();
		obj.method2();
		
	   }
	}
