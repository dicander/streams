import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.concurrent.*;
import java.util.Collection;
public class Primes {

	public static void main(String[] args) {
		IntStream.range(2,1000000)
			.filter(n -> {
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
