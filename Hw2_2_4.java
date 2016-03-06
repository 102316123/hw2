import java.io.*;
import java.util.Scanner;

class Hw2_2_4
{
	public static void main(String[] args)
	{
		Scanner enter = new Scanner(System.in);
		String []name = new String[100];
		int []grade = new int[100];
		int op,op2,count,num;
		count = 1;
	
		while(true)
		{
			System.out.print("1)輸入學生資料 2)搜尋學生資料 -1)end:");
			op = enter.nextInt();
			if(op == 1)
			{
				while(true)
				{
					System.out.print("1)請連續輸入學生成績 -1)end:");
					op2 = enter.nextInt();
					if(op2 == 1)
					{
						try
						{
							  System.out.printf("第%d位學生姓名:",count);
							  name[count] = enter.next();
							  System.out.printf("第%d位學生成績:",count);
							  grade[count] = enter.nextInt();
							  count++;
						}
						catch(Exception e)
						{
							System.out.println("Error:NumberFormatException("+e+")");
							enter.next();
							if(count-1 >= 0)
							{
								count--;
							}
						}
					}
					else if(op2 == -1)
					{
						break;
					}
					else
					{	
						System.out.println("輸入指令無效!請重新輸入");
					}
				}
			}
			else if(op == 2)
			{
				System.out.print("請輸入學生的編號:");
				num = enter.nextInt();
				if(num >= 1 && num < count)
				{
					System.out.println("第" + num + "位學生姓名" + name[num] + "成績" + grade[num]);
				}
				else
				{
					System.out.println("輸入的學生編號無效!!!");
				}
			}
			else if(op == -1)
			{
				break;
			}
			else
			{
				System.out.println("輸入指令無效!請重新輸入");
			}		
		}		
	}
}