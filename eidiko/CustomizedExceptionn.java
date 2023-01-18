package eidiko;
class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
class CustomizedExceptionn {
public static void main(String[] args) {
	int age=Integer.parseInt(args[0]);
	if(age<18)
	{
		throw new TooYoungException("too young");
	}
	else if(age>60)
	{
		throw new TooOldException("too old");
	}
	else
	{
		System.out.println("match will set soon");
	}
}
}
