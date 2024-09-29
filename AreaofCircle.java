import java.util.Scanner;
public class AreaofCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
           double area,circum,r, pi= 3.14;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the value of radius");
           r=sc.nextInt();
           area=pi*r*r;//calculating area of circle
           System.out.println("area of circle"+ area);
           circum=2*pi*r;//calculating circumference of circle
           System.out.println("Circumference of circle is : " + circum);
          }
	
	        
}
