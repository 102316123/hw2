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
			System.out.print("1)輸入圓 2)搜尋圓 -1)end:");
			op = enter.nextInt();
			if(op == 1)
			{
				while(true)
				{
					System.out.printf("第%d的圓請輸入半徑:-1)end:",count + 1);
					r = enter.nextDouble();
					if(r == -1)
					{
						break;
					}
					else if(r <= 0)
					{
						System.out.println("無效輸入!!!");
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
				System.out.printf("請輸入編號:");
				index = enter.nextInt();
				if(index > count || index < 0)
				{
					System.out.println("輸入錯誤!!!");
				}
				else
				{
					System.out.printf("請輸入角度:");
					scale = enter.nextDouble();
					if(scale > 360 || scale < 0)
					{
						System.out.println("輸入錯誤!!!");
					}
					else
					{
						System.out.println("面積:" + c1[index - 1].area(scale));
						System.out.println("邊長:" + c1[index - 1].length(scale));
					}
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