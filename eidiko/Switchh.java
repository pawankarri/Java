package eidiko;

public class Switchh {
	public static void main(String[] args) {
		char grade ='A';
		switch (grade)
		{
		case 'A' :
			System.out.println("marks between 90-100");
			break;
		case 'B' :
			System.out.println("marks between 80-89");
			break;
		case 'C' :
			System.out.println("marks between 70-79");
			break;
		case 'D' :
			System.out.println("marks between 60-69");
			break;
		case 'F' :
			System.out.println("marks less than 35");
			break;
			default :
				System.out.println("marks are more than 100");
		}
	}

}
