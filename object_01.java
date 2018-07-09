class BaseballPlayer1
{
	int age, height, weight;
	
	/*BaseballPlayer(){
		우리 눈에는 보이지 않는 생성자
	}*/
	
	public void eat() {
		System.out.println("먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
	public void run() {
		System.out.println("달린다.");
	}
}
public class object_01 {

	public static void main(String[] args) {
		BaseballPlayer1 kim=new BaseballPlayer1();
		kim.age=30;
		System.out.println("생성한 야구선수 kim의 나이는:"+kim.age);
		kim.run();
	}
}
/*생성자는 반드시 클래스 내에 있어야 한다고 했는데 전혀 보이질 않습니다.
이것은 없는 것이 아니라 우리 눈에 보이지 않을 뿐입니다. 실제로 자바에서는
생성자를 만들어주지 않으면 아무 내용없는 생성자를 기본적으로 하나 만들어 둡니다.
그렇기 때문에 별 문제가 없었던 것이고 실제 이 생성자는 우리 눈에는 보이지 않지만
자바는 이러한 생성자를 만들어서 생성해 놓게 되는 것입니다.*/