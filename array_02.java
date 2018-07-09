
public class array_02 {

	public static void main(String[] args) {
		String[] name=new String[5];
		name[0]="홍길동";
		name[1]="이순신";
		name[2]="김유신";
		name[3]="강감찬";
		name[4]="을지문덕";
		
		System.out.println("***학생명부***");
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}

}
