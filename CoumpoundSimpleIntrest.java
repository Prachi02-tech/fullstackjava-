// calculate compound interest and simple interest
	import java.util.Scanner;
public class CoumpoundSimpleIntrest {
       public static void main(String[] args) {
			// TODO Auto-generated method stub
                    float p,r,t,si, amount,n,ci;
					Scanner sc=new Scanner(System.in);
					//System.out.println("enter the amount");
					//amount=sc.nextFloat();
					System.out.println("enter principle amount :");
					p=sc.nextFloat();
					System.out.println("enter rate of intrest :");
					r=sc.nextFloat();
					System.out.println("enter the time :");
					t=sc.nextFloat();
					System.out.println("enter number of years:");
					n=sc.nextFloat();
					si=p*r*n/100;
					System.out.println("Simple intrest is :"+si);
					ci=p*(1+r/n)*t;
					System.out.println("Compound interest is:"+ci);
		}
	}
