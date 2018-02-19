import java.util.*;
import java.util.stream.*;

public class Primes {

	public static void main(String[] args) {
		IntStream.range(2,10000)
			.filter(n -> { // (int n) also works, parenthesis necessary
			if (n%2==0) {
				return n == 2;
			}
			for(int divisor = 3; divisor*divisor <= n; divisor += 2) {
				if(n%divisor==0) {
					return false;
				}
			}
			return true;
			}).forEach(result -> System.out.print(result + " "));
		System.out.println();
	}
}
