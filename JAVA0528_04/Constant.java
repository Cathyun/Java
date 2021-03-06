package JAVA0528_04;

public class Constant {
	
    /*
     * final : 마지막이라는 의미, 더 이상 수정할 수 없다.
     * 
     * fianl 변수 : 상수를 의미  ex) PI = 3.14
     * final 메소드 : final 메소드는 하위 클래스에서 재정의 할 수 없다.
     * 
     * final 클래스 : final클래스는 상속할 수 없다.
     */
	int num = 10;
	final int NUM = 100;
	public static void main(String[] args) {
		
		  Constant cons = new Constant();
		  cons.num = 50;
	      //cons.NUM = 200; =>final로 지정해놓았기 때문에 값을 바꿀 수 없다.
		  
		  System.out.println("num : " + cons.num);
		  System.out.println("NUM : " + cons.NUM);
	}
	
}
