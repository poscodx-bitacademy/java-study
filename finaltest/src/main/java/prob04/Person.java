package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;

	public Person(String name) {
		this.age = 12;
		this.name = name;
		numberOfPerson++;
	}

	public Person(int age, String name) {
		this(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void selfIntroduce() {
		System.out.printf("내이름은 %s이며, 나이는 %d살 입니다.\n", name, age);
	}

	static int getPopulation() {
		return numberOfPerson;
	}
}
