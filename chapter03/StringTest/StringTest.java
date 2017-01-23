public class StringTest {

public static void main (String[] args) {

// number of tests

int tests = 1000;

String units = "ns";

// start the stopwatch

long now = System.nanoTime();

// use concatenation operator

String s = "";

for(int i = 0; i < tests; i++) {

s += "*";

}

// Stop the stop watch and print time elapsed

System.out.println("String concatenation: " + (System.nanoTime() - now) + units);

// reset timer to current time

now = System.nanoTime();

// use the mutable StringBuilder class

StringBuilder sb = new StringBuilder();

for(int i = 0; i < tests; i++) {

sb.append("*");

}

// Stop the stop watch and print time elapsed

System.out.println("StringBuilder: " + (System.nanoTime() - now) + units);

}

}