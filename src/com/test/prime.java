package com.test;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=67889890;
		boolean flag=true;
		for (i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime number");
				flag =false;
				break;
		
			}
		}
					if(flag)
					{
						System.out.println("prime number");
					}
				
					}
				}
			


	


