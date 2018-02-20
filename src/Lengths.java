import java.util.*;
import java.util.stream.*;

public class Lengths {

	public static void main(String[] args) {
		Stream.of
			("Wisdom", 	"Justice", "Temperance", "Courage")
			.forEach( w -> {System.out.print(w.length() + " ");});
		System.out.println();
	}
}
