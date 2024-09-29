//swapping two numbers using call by reference without using third variable
	class Num{
	    int a;
	    int b;
	   public Num(int a, int b) {
	        this.a = a;
	        this.b = b;
	    	}
		}
	public class SwapNumUsingCallByRefrence {
		    public static void swap(Num num) {
		        num.a = num.a + num.b; 
		        num.b = num.a - num.b; 
		        num.a = num.a - num.b; 
		    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Num no = new Num(10, 20);
			        System.out.println("Before swap:a= "+no.a+", b = "+no.b);
			        swap(no);
			        System.out.println("After swap: a= "+no.a+ ", b = "+no.b);
			    }
				}

