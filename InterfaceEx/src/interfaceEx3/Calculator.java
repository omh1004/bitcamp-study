package interfaceEx3;

public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
	    return num1+num2;
	}

	@Override
	public int manus(int num1, int num2) {
		if(num1>=num2) {
			return num1-num2;
		}else {
				return num2-num1;
			}
		}
	}
