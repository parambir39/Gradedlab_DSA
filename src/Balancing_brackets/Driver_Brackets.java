package Balancing_brackets;
import java.util.Scanner;

public class Driver_Brackets {
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter no. of brackets");
	int size=sc.nextInt();
	char arr[];
	for (int i=0;i<size;i++) {
	
		System.out.println("Enter the brackets:");
	}
	
	balancingBrackets obj= new balancingBrackets(arr[], size); 
	
	 obj.balancingBrackets(result); 
		if{
			result==true;
			System.out.println("Brackets are balanced");
		}
		else {
			System.out.println("Brackets aren't balanced");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
