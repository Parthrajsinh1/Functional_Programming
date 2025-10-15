package functional.lambda;

import java.util.function.BinaryOperator;

public class NonCapturingLambda {

	public static void doWork(BinaryOperator<Integer> op) {
		// does not know what to do.
		// the caller will tell what arithmetic operation to perform

		System.out.println("Result : " + op.apply(11, 22));
	}

	public static void main(String[] args) {

		doWork((a, b) -> a + b);
		doWork((p, q) -> p - q);
		doWork((l, m) -> l * m);
		doWork((o, p) -> o / p);
	}

}
