package Practice2;

public class TestMember {
	private String name;
	private String id;
	private int age; // 같은 클래스가 아니면 접근 불가

	public TestMember(String name, String id, int age) { // 생성자
		super(); // source - generated해서 자동으로 생성이 유리
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() { // 외부 어디서든 접근 가능한 접근자
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

