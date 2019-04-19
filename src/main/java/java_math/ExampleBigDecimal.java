package Examples.java_math;

import java.math.BigDecimal;

public class ExampleBigDecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal00 = new BigDecimal(1.0);
        BigDecimal bigDecimal01 = new BigDecimal(1.00);

        System.out.println(bigDecimal00.equals(bigDecimal01));
        System.out.println(bigDecimal00.compareTo(bigDecimal01));

    }
}

/*
----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! В документации на интерфейс Com p a ra ble предполагается, что метод
compareToO должен быть совместим с методом equals(). Это означает, что результат сравне­
ния х .compareTo (у) должен быть равен нулю, если к такому же результату приводит сравнение
х.equals (у). Этому правилу следует большинство классов из прикладного программного интер­
фейса Java API, где реализуется интерфейс Comparable.

            -------------------------------Ce ne Pravda-----------------------------
А самым примечательным исключением
из этого правила служит класс BigDecimal. Так, если х = new BigDecimal ( " 1 .0 " ) и у =
new BigDecimal ( " 1 . 0 0 " ) , то в результате сравнения х.equals (у) возвращается логическое
значение false, поскольку сравниваемые числа имеют разную точность. Но в то же время в ре­
зультате сравнения х. compareTo (у) возвращается нулевое значение. В идеальном случае так не
должно быть, но, очевидно, нельзя было решить, какое из этих сравнений важнее.
----------------------------------------------------------------------------------------------------------------------
*/