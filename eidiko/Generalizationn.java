package eidiko;
class Food
{
	
	public void cook()
	{
		System.out.println("cook the food");
	}
}
class Snaks extends Food
{
	
}
class Drinks extends Food
{
	
}
class Pan extends Food
{
	
}
public class Generalizationn {
	public static void start(Food r)
	{
		r.cook();
	}
	public static void main(String[] args) {
		start(new Snaks());
		start(new Drinks());
		start(new Pan());
	}

}
