package eidiko;
class Book
{
	public String booktitle;
	public Book(String booktitle)
	{
		this.booktitle=booktitle;
	}
	public void write()
	{
		System.out.println("write story");
	}
	public void read()
	{
		System.out.println("read the story");
	}
	public void edit()
	{
		System.out.println("edit the story");
	}
}
public class Specializationn {
	public static void library(Book rv)
	{
		rv.write();
		rv.read();
		rv.edit();
	}
	public static void main(String[] args) {
		library(new Book("biography"));
		library(new Book("romance"));
		library(new Book("thiller"));
		
}
}
