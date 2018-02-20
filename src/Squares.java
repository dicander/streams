import java.util.*;
import java.util.stream.*;

public class Squares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.parseInt(line);
		IntStream.range(1,n+1).
			map(a->a*a).
			forEach(w->System.out.print(w + " "));		
		System.out.println();
	}
}
