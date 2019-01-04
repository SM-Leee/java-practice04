package prob01;

public class Printer	 {
		
//	public void println(int num) {
//		System.out.println(num);
//	}
//	
//	public void println(String str) {
//		System.out.println(str);
//	}
//	
//	public void println(double dou) {
//		System.out.println(dou);
//	}
//	
//	public void println(boolean boo) {
//		System.out.println(boo);
//	}
	
	
	//제네릭 메소드
//	public <T> void println(T t) {
//		System.out.println(t);
//	}
	
	//제네릭 + 가변 변수
	@SuppressWarnings("unchecked")
	public <T> void println(T... ts) {
		
		for(T t:ts) {
			System.out.println(t);
		}
	}
	
	//가변 변수 : 매개변수가 몇개 들어가는지 모를때 사용함
	public Integer sum(Integer... nums) {
		Integer sum = 0;
		for(Integer i : nums) {
			sum += i;
		}
		return sum;
	}
	
}
