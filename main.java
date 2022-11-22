import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		
	}

}
