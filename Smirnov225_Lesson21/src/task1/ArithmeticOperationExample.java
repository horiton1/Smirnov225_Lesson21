package task1;

import java.util.function.BiFunction;

public class ArithmeticOperationExample {

    static void main() {
        BiFunction<Integer, Integer, Integer> plusOperation = getOperation("+");
        BiFunction<Integer, Integer, Integer> divideOperation = getOperation("/");
        BiFunction<Integer, Integer, Integer> minOperation = getOperation("min");
        BiFunction<Integer, Integer, Integer> maxOperation = getOperation("max");

        System.out.println(plusOperation.apply(5, 11));
        System.out.println(divideOperation.apply(12, 3));
        System.out.println(minOperation.apply(15, 7));
        System.out.println(maxOperation.apply(15, 7));
    }

    private static BiFunction<Integer, Integer, Integer> getOperation(String sign) {
        return switch (sign) {
            case "+" -> Integer::sum;
            case "-" -> (value1, value2) -> value1 - value2;
            case "*" -> (value1, value2) -> value1 * value2;
            case "/" -> (value1, value2) -> value1 / value2;
            case "min" -> Integer::min;
            case "max" -> Integer::max;

            default -> throw new IllegalArgumentException("Неизвестная операция");
        };

    }
}