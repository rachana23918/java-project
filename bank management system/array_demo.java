class array_demo
{
	public static void main(String args[])
	{
		int x[]={1,2,3,4,5,6,7,8,9,10};
		int i;
		int sum=0;
		double avg;
		double len=x.length;
		for(i=0;i<len;i++)
		{
			System.out.println(x[i]);
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		avg=sum/len;
		System.out.println("avg="+avg);
	}
}