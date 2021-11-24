package ifExample1;

public class ifExample1 {
	public static void main(String[] args) {
		
		int age = 19;
		int charge;
		
		if(age < 8 ) {
			System.out.println("미치학아동입니다.");
			
		}else if(age < 14) {
			System.out.println("초등학생입니다.");
			
		}else if(age <20){
			System.out.println("중고등학생입니다.");
		}else if(age >= 20) {
			System.out.println("성인입니다.");
		}
		
	}
}
