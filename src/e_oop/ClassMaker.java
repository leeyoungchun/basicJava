package e_oop;

public class ClassMaker {		

	//전역변수 하나를 선언 및 초기화 해주세요.
	String s = "안녕하세요 저는 ClassMaker의 전역변수예요.";
	//리턴타입과 파라미터가 없는 메소드 하나를 만들어주세요.
	//메소드 안에서 전역변수를 출력해주세요
	void method1(){
		System.out.println(s);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메소드 하나를 만들어주세요.
	//메소드 안에서 전역변수를 리턴해주세요
	String method2(){
		return s;
	}
	
	//리턴타입은 없고 파라미터가 있는 메소드 하나를 만들어주세요.
	//메소드 안에서 파라미터를 출력해주세요.
	void method3(String a){
		System.out.println(a);
	}
	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메소드 하나를 만들어주세요.
	//메소드 안에서 두 파라미터를 곱한 결과를 리턴해주세요
	int method4(int a, int b){
		return a*b;
	}
	
	
}
