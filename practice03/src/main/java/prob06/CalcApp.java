package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt( tokens[ 0 ] );
			int rValue = Integer.parseInt( tokens[ 2 ] );
			
			Arith arith = null;
			switch( tokens[ 1 ] ) {
				case "+" : {
					arith = new Add();
					break;
				}
				case "-" : {
					arith = new Sub();
					break;
				}
				case "*" : {
					arith = new Mul();
					break;					
				}
				case "/" : {
					arith = new Div();
					break;
				}
			}
			
			if(arith == null) {
				System.out.println( ">> 알 수 없는 연산입니다.");
				continue;
			}
			
			arith.setValue( lValue, rValue );
			int result = arith.calculate();
			System.out.println( ">> " + result );
		}
		
		scanner.close();
	}

}
