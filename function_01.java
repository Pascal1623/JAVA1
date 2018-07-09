
public class function_01 {

	public static void main(String[] args) {
		addOne(4);
		System.out.println("함수 실행 결과 "+addOne(4)+"가 출력되었습니다.");
	}
	
	public static int addOne(int a)
	{
		int b=a+1;
		return b;
	}
}
