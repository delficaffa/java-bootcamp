
public class Demo {

	public static void main(String[] args) {

		House_Builder House_Builder = new Some_House_Builder();
		Principal_Builder Principal_Builder = new Principal_Builder(House_Builder);
		Principal_Builder.construct_House();
		_House _House = Principal_Builder.get_House();
		System.out.println("The House have:\n" + _House);

	}

}