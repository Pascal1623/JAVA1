class BaseballPlayer1
{
	int age, height, weight;
	
	/*BaseballPlayer(){
		�츮 ������ ������ �ʴ� ������
	}*/
	
	public void eat() {
		System.out.println("�Դ´�.");
	}
	public void sleep() {
		System.out.println("�ܴ�.");
	}
	public void run() {
		System.out.println("�޸���.");
	}
}
public class object_01 {

	public static void main(String[] args) {
		BaseballPlayer1 kim=new BaseballPlayer1();
		kim.age=30;
		System.out.println("������ �߱����� kim�� ���̴�:"+kim.age);
		kim.run();
	}
}
/*�����ڴ� �ݵ�� Ŭ���� ���� �־�� �Ѵٰ� �ߴµ� ���� ������ �ʽ��ϴ�.
�̰��� ���� ���� �ƴ϶� �츮 ���� ������ ���� ���Դϴ�. ������ �ڹٿ�����
�����ڸ� ��������� ������ �ƹ� ������� �����ڸ� �⺻������ �ϳ� ����� �Ӵϴ�.
�׷��� ������ �� ������ ������ ���̰� ���� �� �����ڴ� �츮 ������ ������ ������
�ڹٴ� �̷��� �����ڸ� ���� ������ ���� �Ǵ� ���Դϴ�.*/