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
			System.out.print("1)��J�ǥ͸�� 2)�j�M�ǥ͸�� -1)end:");
			op = enter.nextInt();
			if(op == 1)
			{
				while(true)
				{
					System.out.print("1)�гs���J�ǥͦ��Z -1)end:");
					op2 = enter.nextInt();
					if(op2 == 1)
					{
						try
						{
							  System.out.printf("��%d��ǥͩm�W:",count);
							  name[count] = enter.next();
							  System.out.printf("��%d��ǥͦ��Z:",count);
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
						System.out.println("��J���O�L��!�Э��s��J");
					}
				}
			}
			else if(op == 2)
			{
				System.out.print("�п�J�ǥͪ��s��:");
				num = enter.nextInt();
				if(num >= 1 && num < count)
				{
					System.out.println("��" + num + "��ǥͩm�W" + name[num] + "���Z" + grade[num]);
				}
				else
				{
					System.out.println("��J���ǥͽs���L��!!!");
				}
			}
			else if(op == -1)
			{
				break;
			}
			else
			{
				System.out.println("��J���O�L��!�Э��s��J");
			}		
		}		
	}
}