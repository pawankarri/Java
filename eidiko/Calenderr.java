package eidiko;

class Ccc {
private int monthNum;
public void findMonthNumber(int monthNum)
{
	if(monthNum>=1 && monthNum<=12)
	{
		this.monthNum=monthNum;
		System.out.println("given month number is vaild");
	}
	else
	{
		System.out.println("given month number is invaild");
	}
}
}
public class Calenderr
{
	public static void main(String[] args) {
		Ccc m=new Ccc();
		m.findMonthNumber(13);
	}
}
