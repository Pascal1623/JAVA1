
public class overloading {

	public static void main(String[] args) {
		System.out.println(max(5, 9, 2));
		System.out.println(max(3.1, 10.33, -32.1));
	}
	
	/*정수형 max() 함수*/
	public static int max(int a, int b, int c)
	{
		int max=0;
		
		if(a>b) {
			max=a;
		}
		else {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		
		return max;
	}
	
	/*실수형 max() 함수*/
	public static double max(double a, double b, double c) {
		double max=0;
		
		if(a>b) {
			max=a;
		}
		else {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		
		return max;
	}
}
