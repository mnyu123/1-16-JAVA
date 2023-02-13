package Test3;

public class ComplexerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complexer com = new Complexer();
		System.out.println(Complexer.ink);
		System.out.println(Complexer.Fax_number);
		com.print();
		com.scan();
		com.send("02-9876-5432");
		com.receive("031-1234-5678");
	}

}
