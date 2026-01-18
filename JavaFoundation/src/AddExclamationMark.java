
public class AddExclamationMark {
	
	public static void main (String [] args) {
		AddExclamationMark("hot dogs");
		int y = square(2);
		System.out.println(y);
	}
	
	public static void AddExclamationMark (String s) {
		System.out.println(s + "!");
	}
	
	public static int square(int x) {
		return x*x;
	}
}

//This is a method add an exclamation mark (!) at the end of whatever String you want
//Explanation for this method
//1. you add keyword "public static void"
//2. Add a name for this method "AddExclamationMark"
//3. Print it like usual 
//4. Inside () type s (which is the name of the String) 
//5. "+" is a symbol to put 2 Strings together
//Explanation: in the 2. "public static void", the "s" after "String" is like the input & the "s!" is the output. Giống như bỏ x vào f(x) thì ta nhận đc y. Thì x là input, còn y là output
//Trong TH này, "hot dogs" là f(x), "s" là x & "hot dogs!" là y