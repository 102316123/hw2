import java.io.*;
import java.util.Scanner;

class Hw2_4_2
{
	public static void main(String[] args)
	{
		int []shapecount = new int[100];
		Circle []c = new Circle[100];
		Oval []o = new Oval[100];
		Rectangle []r = new Rectangle[100];
		Triangle []t = new Triangle[100];
		
        Scanner enter = new Scanner(System.in);
        double scale = 0,a = 0,b = 0;
		double area = 0;
        int count = 0,scount = 0,op,op1;
        int index = 0;
		
		while(true)
		{
			System.out.printf("請輸入第%d的圖形 1)正圓 2)橢圓 3)矩形 4)三角型 5)查詢 -1)end:",count + 1);
			op = enter.nextInt();
			if(op == 1)
			{
				System.out.printf("請輸入圓的半徑:");
				a = enter.nextInt();
				c[count] = new Circle(a);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 2)
			{
				System.out.printf("請輸入橢圓的a(長軸):");
				a = enter.nextDouble();
				System.out.printf("請輸入橢圓的b(短軸):");
				b = enter.nextDouble();
				o[count] = new Oval(a,b);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 3)
			{
				System.out.printf("請輸入矩型的長:");
				a = enter.nextDouble();
				System.out.printf("請輸入矩型的寬:");
				b = enter.nextDouble();
				r[count] = new Rectangle(a,b);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 4)
			{
				System.out.printf("請輸入三角型的底:");
				a = enter.nextDouble();
				System.out.printf("請輸入三角型的高:");
				b = enter.nextDouble();
				t[count] = new Triangle(a,b);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 5)
			{
				System.out.printf("請輸入要查詢圖型的編號:");
				op1 = enter.nextInt();
				if(op1 > scount || op1 <= 0)
				{
					System.out.println("錯誤輸入!!!");
				}
				else
				{
						if(shapecount[op1 - 1] == 1)
						{
							System.out.printf("第%d編號的圖型:圓形		面積為:%f\n",op1,c[op1 - 1].area());
						}
						else if(shapecount[op1 - 1] == 2)
						{
							System.out.printf("第%d編號的圖型:橢圓		面積為:%f\n",op1,o[op1 - 1].area());
						}
						else if(shapecount[op1 - 1] == 3)
						{
							System.out.printf("第%d編號的圖型:矩形		面積為:%f\n",op1,r[op1 - 1].area());
						}
						else if(shapecount[op1 - 1] == 4)
						{
							System.out.printf("第%d編號的圖型:三小型	面積為:%f\n",op1,t[op1 - 1].area());
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
abstract class Shape 
{
	abstract double area();
}
class Circle extends Shape 
{
	double r;
	public Circle(double a) 
	{
		this.r = a;
	}
	public double area() 
	{
		return 3.14 * r * r;
	}
}
class Oval extends Shape 
{
	double a,b;
	public Oval(double a, double b) 
	{
		this.a = a;
		this.b = b;
	}
	public double area() 
	{
		if(a > b)
		{
			return 3.14 * 2 * b + 4 * (a - b);
		}
		else if(b > a)
		{
			return 3.14 * 2 * a + 4 * (b - a);
		}
		else
		{
				return 2 * 3.14 * a;
		}
	}
}
class Rectangle extends Shape 
{
	double a,b;
	public Rectangle(double a, double b) 
	{
		this.a = a;
		this.b = b;
	}
	public double area() 
	{
		return a * b;
	}
}
class Triangle extends Shape 
{
	double a,b;
	public Triangle(double a, double b) 
	{
		this.a = a;
		this.b = b;
	}
	public double area() 
	{
		return (a * b) / 2;
	}
}
