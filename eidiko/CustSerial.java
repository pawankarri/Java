package eidiko;
import java.io.*;
class Insta implements Serializable
{
	String userName="pawan";
	transient String password="pawan@123";
private void writeObject(ObjectOutputStream os)throws Exception
{
	os.defaultWriteObject();
	String epassword="123"+password;
	os.writeObject(epassword);
}
private void readObject(ObjectInputStream is)throws Exception
{
	is.defaultReadObject();
	String epassword=(String)is.readObject();
	password=epassword.substring(3);
}
}
public class CustSerial {
public static void main(String[] args) throws Exception {
	Insta a=new Insta();
	System.out.println("before serialization:"+a.userName+" "+a.password);
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(a);
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Insta a1=(Insta)ois.readObject();
	System.out.println("after deserialization:"+a1.userName+" "+a1.password);
}
}
