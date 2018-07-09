
public class while_03 {

	public static void main(String[] args) {
		int a=0;
		boolean check=true;
		
		while(check)
		{
			System.out.println("반복합니다.");
			if(a>5)
			{
				check=false;
			}
			else
			{
				a=a+1;
			}
		}
	}
}
