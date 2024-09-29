import java.io.*;
public class SwapNumUsingCallByValue {
		static void swap(int a, int b)
		{
		int temp=a;
		a=b;
		b=temp;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
					int x = 66;
					int y = 99;
					System.out.println("before swapping x= "+x+ " and y= " +y);
					swap(x, y);
					System.out.println("after swapping x= " +y+ " and y= " +x);
				}
			}

