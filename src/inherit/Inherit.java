/**
 * 
 */
package inherit;

/**
 * @author Radhika
 *
 */
class GrandParent
{
	public void grandparent() {
		// TODO Auto-generated method stub
		System.out.println("Inside parent method");
	}
	public void display(int a)
	{
		System.out.println("display method in parent");
		System.out.println("add int"+a);
	}
  
}
final class Parent extends GrandParent
{
	public void parent() {
		// TODO Auto-generated method stub
		System.out.println("Inside parent method");
	}
	public void display(byte a)
	{
		System.out.println("display method in parent");
		System.out.println("add float"+a);
	}
  
}
class Child extends GrandParent
{
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside child method");
	}
	public void display(String b)
	{
		System.out.println("display method in child");
		System.out.println("add str"+b);
		
	}
	public void display(double b)
	{
		System.out.println("display method in child");
		System.out.println("add doble"+b);
		
	}
	
}
public class Inherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi inheritance");
		//Child c=new Child();
		Child p=new Child();
		
        p.display("rads");
        p.display(12);
        p.display(12.3);
        
        
	}

}
