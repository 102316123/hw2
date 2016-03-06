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
			System.out.printf("�п�J��%d���ϧ� 1)���� 2)��� 3)�x�� 4)�T���� 5)�d�� -1)end:",count + 1);
			op = enter.nextInt();
			if(op == 1)
			{
				System.out.printf("�п�J�ꪺ�b�|:");
				a = enter.nextInt();
				c[count] = new Circle(a);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 2)
			{
				System.out.printf("�п�J��ꪺa(���b):");
				a = enter.nextDouble();
				System.out.printf("�п�J��ꪺb(�u�b):");
				b = enter.nextDouble();
				o[count] = new Oval(a,b);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 3)
			{
				System.out.printf("�п�J�x������:");
				a = enter.nextDouble();
				System.out.printf("�п�J�x�����e:");
				b = enter.nextDouble();
				r[count] = new Rectangle(a,b);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 4)
			{
				System.out.printf("�п�J�T��������:");
				a = enter.nextDouble();
				System.out.printf("�п�J�T��������:");
				b = enter.nextDouble();
				t[count] = new Triangle(a,b);
				count++;
				shapecount[scount++] = op;
			}
			else if(op == 5)
			{
				System.out.printf("�п�J�n�d�߹ϫ����s��:");
				op1 = enter.nextInt();
				if(op1 > scount || op1 <= 0)
				{
					System.out.println("���~��J!!!");
				}
				else
				{
						if(shapecount[op1 - 1] == 1)
						{
							System.out.printf("��%d�s�����ϫ�:���		���n��:%f\n",op1,c[op1 - 1].area());
						}
						else if(shapecount[op1 - 1] == 2)
						{
							System.out.printf("��%d�s�����ϫ�:���		���n��:%f\n",op1,o[op1 - 1].area());
						}
						else if(shapecount[op1 - 1] == 3)
						{
							System.out.printf("��%d�s�����ϫ�:�x��		���n��:%f\n",op1,r[op1 - 1].area());
						}
						else if(shapecount[op1 - 1] == 4)
						{
							System.out.printf("��%d�s�����ϫ�:�T�p��	���n��:%f\n",op1,t[op1 - 1].area());
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
