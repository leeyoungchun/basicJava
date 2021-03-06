package e_oop;

public class JVM_Memory {
	/*
	 * JVM(Java Virtual machine)>>
	 * 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
	 * 운영체제  > JVM> 자바 프로그매
	 * 장점 : 운영체제에 상관없이 실행할 수 있다.
	 * 단점 : 속도가 느리다
	 * 
	 * JVM메모리 구조
	 * method Area : 클래스가 저장된다.
	 * Call stack : 현재 호출되어있는 메소드가 저장된다.
	 * heap : 객체가 저장된다.
	 
	   <<Method Area>>
	   -ClassMember : classVar, classMethod()
	    System : out
	   	PrintStream : println()
	   
	   <<Call Stack>>
	    println(cm1.instanceVar) : 삭제 
	    instanceMethod() : 삭제 
	    println(cm1.classVar) : 삭제 
	    classMethod() : 삭제
	  
	   <<Heap>>
	   cm1 = new ClassMember() : instanceVar, instanceMethod 
	   cm2 = new ClassMember() : instanceVar, instanceMethod
	   
	 *
	 */
}
