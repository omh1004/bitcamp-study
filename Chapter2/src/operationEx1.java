
public class operationEx1 {

	public static void main(String[] args) {
		//논리곱 && 은 두항의 모두 true 일때만 결과가 true
		//논리합 || 은 두항중 하나만 true 여도 결과가 true
		
		//단락회로 평가
		
		int num = 10;
		int i = 1;
		
		//논리곱에서 앞의 항의 false이면 뒤에 항을 평가하지 않으므로 결과는 false이고 뒤에 항의 대입연산자 i의 값은 바뀌지 않는다.
		
		boolean value =  ((num+10 < 10) && ((i = i+2) < 10));
		
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);

		//논리합에서 앞의 항이 true이면 뒤에 항을 평가하지 않으므로 결과는 true이고 , 뒤에 항은 평가하지 않으므로 i의 값은 바뀌지 않는다.
		
		boolean value2 = (num+10 > 10) || ((i = i+2) <10);
		
		System.out.println(value2);
		System.out.println(num);
		System.out.println(i);
		
	}

}
