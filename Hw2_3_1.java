import java.io.*;
import java.util.Scanner;

class Hw2_3_1
{
	public static void main(String[] args)
	{
		Circle []c1 = new Circle[100];
		//Circle c2 = new Circle();
		
        Scanner enter = new Scanner(System.in);
        double scale = 0,r = 0;
        int count = 0,op;
        int index = 0;
		
		while(true)
		{
			System.out.print("1)��J�� 2)�j�M�� -1)end:");
			op = enter.nextInt();
			if(op == 1)
			{
				while(true)
				{
					System.out.printf("��%d����п�J�b�|:-1)end:",count + 1);
					r = enter.nextDouble();
					if(r == -1)
					{
						break;
					}
					else if(r <= 0)
					{
						System.out.println("�L�Ŀ�J!!!");
					}
					else
					{
						c1[count] = new Circle(r);
						count++;
					}
				}
			}
			else if(op == 2)
			{
				System.out.printf("�п�J�s��:");
				index = enter.nextInt();
				if(index > count || index < 0)
				{
					System.out.println("��J���~!!!");
				}
				else
				{
					System.out.printf("�п�J����:");
					scale = enter.nextDouble();
					if(scale > 360 || scale < 0)
					{
						System.out.println("��J���~!!!");
					}
					else
					{
						System.out.println("���n:" + c1[index - 1].area(scale));
						System.out.println("���:" + c1[index - 1].length(scale));
					}
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
class Circle 
{
    double r;
	double pi = 3.14;
    Circle(double enterr)
    {
        r = enterr;
    }
    double area(double scale) 
	{
		return pi * r * r *(scale/360);
	}
    double length(double scale)
    {
        return 2 * pi * r *(scale/360);
    }
}