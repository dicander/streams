import java.util.*;
import java.util.stream.*;

public class Factorial {

	public static int factorial(int n) {
		return IntStream.range(1,n+1).reduce(1, (a,b)->a*b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(factorial(Integer.parseInt(line)));
	}
}
