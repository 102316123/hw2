import java.io.*;
import java.util.Scanner;

class Hw2_4_1
{
	public static void main(String[] args)
	{
		
		Oval []oval = new Oval[100];
		//Circle c2 = new Circle();
		
        Scanner enter = new Scanner(System.in);
        double scale = 0,a = 0,b = 0;
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
					System.out.printf("��%d����п�J���ba:-1)end:",count + 1);
					a = enter.nextDouble();
					System.out.printf("��%d����п�J�u�bb:-1)end:",count + 1);
					b = enter.nextDouble();
					if(a == -1 || b == -1)
					{
						break;
					}
					else if(a <= 0 || b <= 0)
					{
						System.out.println("�L�Ŀ�J!!!");
					}
					else
					{
						oval[count] = new Oval(a,b);
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
					System.out.println("���n:" + oval[index - 1].area());
					System.out.println("���:" + oval[index - 1].length());
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
		return pi * r * r * (scale / 360);
	}
    double length(double scale)
    {
        return 2 * pi * r * (scale / 360);
    }
}
class Oval extends Circle
{
    double b;
    public Oval(double enterr,double enterb) 
	{
        super(enterr);
        b = enterb;
    }
    double area() 
	{
		return pi * r * b;
    }
    double length()
    {
		if(r > b)
		{
			return pi * 2 * b + 4 * (r - b);
		}
		else if(b > r)
		{
			return pi * 2 * r + 4 * (b - r);
		}
		else
		{
				return 2 * pi * r;
		}
        
    }
}