package prob3;

public class Prob2 {
	public static void main(String[] args) {
		Bird bird01 = new Duck();
		bird01.setName( "꽥꽥이" );
		bird01.fly();
		bird01.sing();
		System.out.println( bird01 );
		
		Bird bird02 = new Sparrow();
		bird02.setName( "짹짹이" );
		bird02.fly();
		bird02.sing();
		System.out.println( bird02 );
	}
}
