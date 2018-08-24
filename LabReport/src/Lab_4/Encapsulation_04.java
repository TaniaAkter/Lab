package Lab_4;

class EncapsulationDemo{
    private int id;
    private String name;
    private int age;

    
    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newValue){
    	age = newValue;
    }

    public void setName(String newValue){
    	name = newValue;
    }

    public void setID(int newValue){
    	id = newValue;
    }
}
public class Encapsulation_04{
	
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setName("Tania Akter");
         obj.setAge(20);
         obj.setID(17200015);
         System.out.println("Name: " + obj.getName());
         System.out.println("ID : " + obj.getID());
         System.out.println("Age " + obj.getAge());
    } 
}