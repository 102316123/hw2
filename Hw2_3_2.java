import java.io.*;
import java.util.Scanner;

class Hw2_3_2 
{
    public static void main(String[] args) 
	{
		Scanner enter = new Scanner(System.in);
        int cyear,cmonth,cday,op;
        
		System.out.println("�п�J�~���:");
        System.out.printf("�~��:");
        cyear = enter.nextInt();
        System.out.printf("���:");
        cmonth = enter.nextInt();
        System.out.printf("���:");
        cday = enter.nextInt();
		
        date date = new date(cyear,cmonth,cday);
        while(true)
        {
            System.out.printf("1)��l�� 2)��� 3)�ˬd -1)end:");
            op = enter.nextInt();
            if(op == 1)
			{
                date.change();
			}
            else if(op == 2)
			{
                date.show();
			}
            else if(op == 3)
			{
                if(date.check() == 1)
				{
                    System.out.println("�~����J�����T!!!");
				}
                else if(date.check() == 0)
                {
					System.out.print("�A��J���~��鬰:");
                    date.show();                 
                }
			}
            else if(op == -1)
			{
                break;
			}
			else
			{
				System.out.println("�L�Ŀ�J!!!");
			} 
        }
    }
}
class date
{
    int year,month,day;
    Scanner enter = new Scanner(System.in);
    date(int cyear,int cmonth,int cday)
    {
        year = cyear;
        month = cmonth;
        day = cday;
    }
    public void change()
    {
        try{
            System.out.printf("�~��:");
            year = enter.nextInt();
            System.out.printf("���:");
            month = enter.nextInt();
            System.out.printf("���:");
            day = enter.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    public int check()
    {
		if(year > 0)
		{
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))  //�|�~
			{
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				{
					if(day > 31 || day <= 0)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
				else if(month == 2)
				{
					if(day > 29 || day <= 0)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
				else if(month == 4 || month == 6 || month == 9 || month == 11)
				{
					if(day > 30 || day <= 0)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
				else
				{
					return 1;
				}		
			}
			else
			{
				if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				{
					if(day > 31 || day <= 0)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
				else if(month == 2)
				{
					if(day > 28 || day <= 0)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
				else if(month == 4 || month == 6 || month == 9 || month == 11)
				{
					if(day > 30 || day <= 0)
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
				else
				{
					return 1;
				}		
			}
		}
		else
		{
			return 1;
		}
    }
	public void show()
    {
        System.out.printf("�褸%d/%d/%d\n",year,month,day);
    }
    
}
