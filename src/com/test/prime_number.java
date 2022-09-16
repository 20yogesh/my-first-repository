package com.test;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=4,count=0;
		for (i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
					if(count==2)
					{
						System.out.println("prime number");
					}
					else
					{
						System.out.println("not prime number");
					}
				}
			

}
