import java.io.*;
import java.util.Scanner;

class Hw2_2_3
{
	public static void main(String[] args) throws Exception 
	{
		System.out.print("�п�J�@�Ӧ~��:");
		Scanner enter = new Scanner(System.in);
		int year = enter.nextInt();
		System.out.print("�A��J�~���H�U���|�~:");
		for(int i = 1;i <= year;i++)
		{
			if(i % 400 == 0)
			{
				System.out.print(i + "\t");
			}
			else if(i % 4 == 0 && i % 100 != 0)
			{
				System.out.print(i + "\t");
			}
			else
			{
				;
			}
			
		}
	}
}