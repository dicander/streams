import java.util.*;
import java.util.stream.*;

public class Virtues {

	public static void main(String[] args) {
		Stream.of
			("Wisdom", 	"Justice", "Temperance", "Courage")
			.sorted()
			.forEach(System.out::println);
		//System.out.println();
	}
}
