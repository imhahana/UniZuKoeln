
public class h_IfElse {

	public static void main(String[] args) {
		
		int age = 16;
		
		if (age >= 18) {
			System.out.println("You're an adult!");
			
		} else {
			System.out.println("Ha sike! Go home and suck your mommy's milk");
		}
		
		System.out.println();
		
		int score = 87;
		
		if (score >= 87 && score <= 100) {
			System.out.println("1.0");
			
		} else if (score < 87  &&  score >= 73) {
			System.out.println("2.0");
			
		} else if (score < 73  &&  score >= 59) {
			System.out.println("3.0");
			
		} else if (score < 59  &&  score >= 45) {
			System.out.println("4.0");
			
		} else if (score < 45) {
			System.out.println("Durschfallen!");
			
		} 

	}

}

//Improvement 1: some informations are redundant (dư thừa)
//Ex. else if (score < 87  &&  score >= 73) 
//=> In this case, just need to write else if (score >= 73)
//Bcause Java đọc code theo thứ tự. Nên nếu score >= 87 thì nó đã print r. Còn nếu nó k thỏa đk trên, nó sẽ xét đến đk tiếp theo: score >= 73. Tương tự với các code tiếp theo

//Improvement 2: else if (score < 45)  =>  else { System.out.println("Durchfallen") }
//Sau khi xét các đk trên mà ko thỏa thì máy sẽ xét tới ĐIỀU KIỆN CÒN LẠI, which is method "else"
