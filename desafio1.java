public class Desafio1 {
	
	public static void main(String[] args) {
		Integer n = 6;
		String i, j;
		for(var i = 1; i <= n; i++) {
			for(var j = n - 1; j >= 1; j--)
				System.out.println(" ");
			for(j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}
}
