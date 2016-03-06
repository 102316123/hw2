import java.io.*;
class Hw2_2_2
{
	public static void main(String[] args) throws Exception 
	{
		System.out.print("請輸入第一個數字:");
		InputStreamReader is1 = new InputStreamReader(System.in);
		BufferedReader in1 = new BufferedReader(is1);
		String cnum1 = in1.readLine();
		System.out.print("請輸入第二個數字:");
		InputStreamReader is2 = new InputStreamReader(System.in);
		BufferedReader in2 = new BufferedReader(is2);
		String cnum2 = in2.readLine();
		
		double num1 = Double.valueOf(cnum1);
		double num2 = Double.valueOf(cnum2);
		
		System.out.print("請選擇符號1)+ 2)- 3)* 4) /:");
		InputStreamReader is3 = new InputStreamReader(System.in);
		BufferedReader in3 = new BufferedReader(is3);
		String cop = in3.readLine();
		int op = Integer.valueOf(cop);
		double count = 0.0;
		
		switch(op) 
		{ 
            case 1: 
				count = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + count); 
                break; 
            case 2: 
                count = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + count); 
                break; 
            case 3: 
                count = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + count);  
                break; 
            case 4: 
				if(num2 == 0)
				{
					System.out.println("分母不能為0");  
				}
				else
				{
					count = num1 / num2;
					System.out.println(num1 + "/" + num2 + "=" + count); 
				}               
                break; 
            default: 
                System.out.println("輸入錯誤!!!"); 
        }
	}
}