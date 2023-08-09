package prob05;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account( "078-3762-293" );
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );
		
		account.save( 100 );
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );

		account.deposit( 30 );
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getBalance() + "만원입니다." );

	}

}
