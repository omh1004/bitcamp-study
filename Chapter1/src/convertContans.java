
public class convertContans {
	public static void main(String[] args) {
		//형변환
		//묵시적 형변환
		int iNum = 10;
		long lNum = iNum;
		double dNum = iNum;
		float fNum = 0.9f;
		double pi = 3.14;
		
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(dNum);
		// int형을 데이터가 큰 long 이나 실수인 double에 넣었을 경우에는 따로 형변환을 하지 않아도 된다.
		
		
		//강제적 형변환
		iNum = (int)lNum;
		System.out.println(iNum);
		iNum = (int)dNum;
		System.out.println(iNum);
		//int보다 큰 long형이나 실수인 double형에의 데이터를 int에 넣을 때에는 형변환 캐스팅이 필요하다.
		
		
		//형변환 연산
		int sum1 = (int)(fNum + pi);
		int sum2 = (int)fNum +(int)pi;
		
		System.out.println(sum1);//4
		System.out.println(sum2);//3
		//sum1 에 경우는 먼저 형변환 하기전 0.9와 3.14를 더한다음에 형변환을 해서 4가 나온것이고,
		//sum2 는 더하기전 형변환을 통해 int형인 정수로 바뀌면서 소수점 뒤가 트런크 되서 0+3을 연산했기때문에 3이나온다.
	}
}
