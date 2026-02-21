package task2;

@FunctionalInterface
interface Summator {
    int sum(int n1, int n2);
}

public class Practicum {

    static void main() {
         Summator summator = Integer::sum;
        System.out.println("Сумма 23 и 65 равна " + summator.sum(23, 65));
    }
}

