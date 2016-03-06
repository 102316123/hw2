import java.io.*;
class Hw2_2_1
{
	public static void main(String[] args) throws Exception 
	{
		System.out.print("請輸入姓名：");
		InputStreamReader is1 = new InputStreamReader(System.in);
		BufferedReader in1 = new BufferedReader(is1);
		String name = in1.readLine();
		System.out.print("請輸入出生西元年：");
		InputStreamReader is2 = new InputStreamReader(System.in);
		BufferedReader in2 = new BufferedReader(is2);
		String year = in2.readLine();
		System.out.print("請輸入出生月份：");
		InputStreamReader is3 = new InputStreamReader(System.in);
		BufferedReader in3 = new BufferedReader(is3);
		String month = in3.readLine();
		System.out.print("請輸入出生日期：");
		InputStreamReader is4 = new InputStreamReader(System.in);
		BufferedReader in4 = new BufferedReader(is4);
		String day = in4.readLine();
		int cyear = Integer.valueOf(year) - 1911;
		System.out.println(name+"您好，您的中華民國生日日期為民國" + cyear + "年" + month + "月" + day + "日");
	}
}