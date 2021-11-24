package interfaceEx3;

public class PerfectCaculator extends Calculator{

	@Override
	public double devide(int num1, int num2) {
		if(num2==0) {
			return ERROR;
		}else {
			return num1/num2;
		}
	}

	@Override
	public int complex(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int squre(int num) {		
		return num*num;
	}

	@Override
	public void decreipt() {
		System.out.println("디폴트 메서드의 재정의가 가능하다.");
	}
	
	

}
