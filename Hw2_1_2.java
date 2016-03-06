class Hw2_1_2
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};	
		double sum = 0;
		double average = 0.0;
		for (double x : a) 
		{
			sum = sum + x;
		}
		average = sum / a.length;	
		System.out.println("sum = " + sum);
		System.out.println("average = " + average);
	}
}
