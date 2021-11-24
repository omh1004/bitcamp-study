package interfaceEx4;

public class PerfactCalculator extends Calculator {

	@Override
	public double devide(int num1, int num2) {
		if(num2==0) {
			return ERROR;
		}
		return num1/num2;
	}

	@Override
	public int complex(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int squre(int num) {
		return num*num;
	}

}
