/*숫자나 문자를 비교할 때는 '==' 기호를 사용하여 비교했지만
문자열을 비교할 때는 다른 방법을 사용해서 비교해야 합니다.
True인 경우 if문을 수행하고 False인 경우 else문 이하를
수행하게 됩니다.*/
public class if_05 {

	public static void main(String[] args) {
		String name="홍길동";
		
		if(name.equals("홍길동"))
		{
			System.out.println("당신은 홍길동이 맞습니다.");
		}
		else
		{
			System.out.println("당신은 홍길동이 아닙니다.");
		}
	}

}
