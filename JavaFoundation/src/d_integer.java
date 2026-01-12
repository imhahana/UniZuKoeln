
public class d_integer {

	public static void main(String[] args) {
		
		int i = 6;
		System.out.println(i);
		
		i = 7;
		System.out.println(i);
		
		//Variablen können geändert werden
		
		
		final int j;
		j = 5;
		System.out.println(j+5);
		
		//Es sei denn, "final" steht vor "int" => j dann bleibt ewig
		//If u dont know what that is auf Java: Google "declaring constant in Java"
		
		
		int x=2, y=3;
		x = x + y;			//từ sau dòng này là x=5, anstatt x=2
		
		System.out.println(x);

	}

}
