package Examples.Multithreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ExampleAtomicUpdate {
    public static void main(String[] args) {
        /*В первоначальной версии класса ConcurrentHashMap имелось лиш ь несколько
        методов для атомарного обновления хеш-отображений, что затрудняло в какой-то
        степени программирование. Допустим, требуется подсчитать, насколько часто на­
        блюдаются определенные свойства. В качестве простого примера допустим, что в не­
        скольких потоках исполнения встречаются слова, частоту появления которых требу­
        ется подсчитать.
        Можно ли в таком случае воспользоваться хеш-отображением типа Concurrent
		HashMap<String, Long>? Рассмотрим пример инкрементирования счета. Очевидно, что
		приведенный ниже фрагмент кода не является потокобезопасным, поскольку в следую­
	    щем потоке исполнения может быть одновременно обновлен тот же самый счет.*/
        Map<String, Long> mapStringLong = new ConcurrentHashMap<>();
        String word = "Hello";
        Long oldValue = mapStringLong.get(word);
        Long newValue = oldValue == null ? 1 : oldValue + 1;
        mapStringLong.put(word, newValue); // ОШИБКА - заменить значение
        // переменной oldValue, возможно, не удастся*/
        /*В качестве классического приема можно воспользоваться операцией, выполняе­
        мой методом replace(), где прежнее значение атомарно заменяется новым значени­
        ем, при условии, что прежнее значение не было раньше заменено на нечто иное ни
        в одном другом потоке исполнения. Эту операцию придется продолжать до тех пор,
        пока метод replace() не завершится успешно, как показано ниже.*/
        do {
            oldValue = mapStringLong.get(word);
            newValue = oldValue == null ? 1 : oldValue + 1;
        } while (!mapStringLong.replace(word, oldValue, newValue));
        /*С другой стороны, можно воспользоваться хеш -отображением типа Concurrent
        HashMap<String, AtomicLong> или же хеш -отображен ием типа ConcurrentHash
        Map<String, LongAdder>, начиная с версии Java SE 8. И тогда код обновления запи­
        сей в хеш-отображении будет выглядеть следующим образом:*/
        Map<String, LongAdder> mapStringLongAdder = new ConcurrentHashMap<>();
        mapStringLongAdder.putIfAbsent(word, new LongAdder());
        mapStringLongAdder.get(word).increment();

        /*В первой строке приведенного выше кода гарантируется наличие объекта типа
        LongAdder, чтобы выполнять операцию инкрементирования атомарно. А поскольку
        метод putlfAbsent () возвращает отображаемое (существующее или вновь разме­
        щенное в отображении) значение, то обе строки этого кода можно объединить сле­дующим образом:*/
        mapStringLongAdder.putIfAbsent(word, new LongAdder()).increment();
        /*В версии Java SE 8 предоставляются методы, делающие атомарные обновления
        более удобными. В частности, метод compute () вызывается с ключом и функцией
        для вычисления нового значения. Эта функция получает ключ и связанное с ним зна­
        чение, а если таковое отсутствует, то пустое значение null, а затем она вычисляет
        новое значение. В качестве примера ниже показано, как обновить отображение цело­ численных счетчиков.*/
        mapStringLong.compute(word, (k, v) -> v == null ? 1 : v + 1);
        /*Имеются также варианты методов computelfPresent () и computelfAbsent (),
        в которых новое значение вычисляется только в том случае, если прежнее значение
        уже имеется или еще отсутствует соответственно. Так, отображение счетчиков типа
        LongAdder может быть обновлено следующим образом:*/
        mapStringLongAdder.computeIfAbsent(word, k -> new LongAdder()).increment();
        /*Когда ключ вводится в отображение в первый раз, нередко требуется сделать не­
        что особенное, и для этой цели очень удобен метод merge ( ) . В качестве одного па­
        раметра ему передается исходное значение, которое используется, когда ключ еще
        отсутствует. В противном случае вызывается функция, предоставляемая этому методу
        в качестве другого параметра. Эта функция объединяет существующее значение с ис­
        ходным. (Но в отличие от метода compute () , эта функция не обрабатывает ключ.)
        Метод merge () можно вызвать следующим образом:*/
        mapStringLong.merge(word, 1L, (existingValue, newValue3) -> existingValue + newValue3);
        // или же таким образом:
        mapStringLong.merge(word, 1L, Long::sum);
        // Как говорится, проще и короче не бывает.*/
    }
}

/*
-----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! Некоторых программистов удивляет, что в потокобезопасной, предположительно,
структуре данных разрешаются операции, не являющиеся потокобезопасными. Но этому имеют­
ся два совершенно противоположных объяснения. Если простое хеш -отображение типа HashMap
модифицируется в нескольких потоках исполнения, они могут нарушить его внутреннюю структуру
(т.е. массив связных списков). В итоге некоторые связи могут быть пропущены и даже зациклены,
приведя структуру данных в полную негодность. Ничего подобного не может произойти с хеш -о ­
тображением типа ConcurrentHashMap. В приведенном выше примере кода вызовы методов
get() и put() вообще не нарушают структуру данных. Но поскольку последовательность выпол­
няемых операций не является атомарной, то ее результат непредсказуем.
-----------------------------------------------------------------------------------------------------------------------
HA ЗАМЕТКУ! В хеш-отображении типа ConcurrentHashMap пустые значения null не допуска­
ются. Имеется немало методов, в которых пустое значение null служит для указания на то, что
заданный ключ отсутствует в отображении.
-----------------------------------------------------------------------------------------------------------------------
*/
