import java.io.*;
class Hw2_2_1
{
	public static void main(String[] args) throws Exception 
	{
		System.out.print("�п�J�m�W�G");
		InputStreamReader is1 = new InputStreamReader(System.in);
		BufferedReader in1 = new BufferedReader(is1);
		String name = in1.readLine();
		System.out.print("�п�J�X�ͦ褸�~�G");
		InputStreamReader is2 = new InputStreamReader(System.in);
		BufferedReader in2 = new BufferedReader(is2);
		String year = in2.readLine();
		System.out.print("�п�J�X�ͤ���G");
		InputStreamReader is3 = new InputStreamReader(System.in);
		BufferedReader in3 = new BufferedReader(is3);
		String month = in3.readLine();
		System.out.print("�п�J�X�ͤ���G");
		InputStreamReader is4 = new InputStreamReader(System.in);
		BufferedReader in4 = new BufferedReader(is4);
		String day = in4.readLine();
		int cyear = Integer.valueOf(year) - 1911;
		System.out.println(name+"�z�n�A�z�����إ���ͤ���������" + cyear + "�~" + month + "��" + day + "��");
	}
}