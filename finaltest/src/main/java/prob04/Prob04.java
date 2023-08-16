package prob04;

public class Prob04 {

	public static void main(String[] args) {
		Person person1 = new Person( "김자바" );
		System.out.println( "현재 인구수는 " +  Person.getPopulation() + "명 입니다." );
		
		Person person2 = new Person( 27, "박자바" );
		System.out.println( "현재 인구수는 " +  Person.getPopulation() + "명 입니다." );

		Person person3 = new Person( 28, "이자바" );
		System.out.println( "현재 인구수는 " +  Person.getPopulation() + "명 입니다." );

		person1.selfIntroduce();
		person2.selfIntroduce();
		person3.selfIntroduce();
	}

}

