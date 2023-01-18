package eidiko;

import java.io.*;

class Dog implements Serializable
{
	int i=10;
	transient int j=20;
}
public class Serial {
public static void main(String[] args)throws Exception {
	Dog d=new Dog();
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d);
	System.out.println(d.i + " "+d.j);
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Dog d2=(Dog)ois.readObject();
	System.out.println(d2.i+" "+d2.j);
}
}
