
import java.io.*;

public class input_01 {

	public static void main(String[] args) {
		String str=null;
		System.out.println("이름을 입력하세요!!");
		
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			str=br.readLine();
		} catch(IOException e) {}
		
		System.out.println(str+"이시군요...");
	}
}