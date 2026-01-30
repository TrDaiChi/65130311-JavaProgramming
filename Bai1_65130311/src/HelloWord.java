
public class HelloWord {

	public static void main(String[] args) {
		System.out.println("""
				TranDaiChi
				65130311
				NTUer 23-27
				Glory ManUnited
				""");
        String greeting = """
                ======================
                HELLO, MODERN JAVA!
                ======================
                by Trần Đại Chí NTU
                ======================
                """;
            System.out.println(greeting);
            var message = "Hello, World with var!";
            var number = 42;
            var list = java.util.List.of("Java","Modern","Features");
            System.out.println(message);
            System.out.println("number: "+ number);
            System.out.println("List: "+ list);
	}

}
