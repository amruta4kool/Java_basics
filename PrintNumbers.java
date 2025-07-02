package assignmentmdk;

public class PrintNumbers {

	public static void main(String[] args)
	{
		// for print 51-100 numbers
		for (int i = 51; i <= 100; i++)
		{
			System.out.println(+i);
		}
		System.out.println("0 to -10 numbers");
		//FOR 0 to -10 numbers
		for(int i=0;i>=-10;i--)
		{
			System.out.println(+i);
		}
		System.out.println("-10 to -20 numbers");
		//for -10 to-20 numbers
		for(int i=-10;i>=-20;i--)
		{
			System.out.println(+i);
		}
		System.out.println("-50 to 50 numbers");
		//-51 to 51 numbers
		for(int i=-50;i<=50;i++)
		{
			System.out.println(+i);
		}
	}
}
