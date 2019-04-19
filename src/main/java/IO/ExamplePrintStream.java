package IO;

public class ExamplePrintStream {
    public static void main(String[] args) {
//-------------------------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------------------------
    }
}
/*
----------------------------------------------------------------------------------------------------------------------
На заметку! У программирующих на Java со стажем может возникнуть следующий вопрос:
что же случилось с классом PrintStream и стандартным потоком вывода System, out?
В версии Java 1.0 класс PrintStream просто усекал все символы Юникода до символов
в коде ASCII, отбрасывая старший байт (в то время в Юникоде еще применялась 16-раз-
рядная кодировка]. Очевидно, что такой подход не обеспечивал точность и переносимость
результатов, из-за чего он был усовершенствован внедрением в версии Java 1.1 потоков
чтения и записи данных. Для обеспечения совместимости с существующим кодом System,
in, System.out и System.err по-прежнему являются потоками ввода-вывода, но не
для чтения и записи данных.
Класс PrintStream теперь способен преобразовывать внутренним образом символы
Юникода в стандартную кодировку хоста точно так же, как и класс PrintWriter. Объекты типа
PrintStream действуют таким же образом, как и объекты типа PrintWriter, когда
вызываются методы print () и println (), но, в отличие от объектов типа PrintWriter, они
позволяют также выводить исходные байты с помощью методов write (int) и write (byte []).
----------------------------------------------------------------------------------------------------------------------
Класс P r i n t S t r e am предоставляет все возможности для вывода данных по де­
скриптору файла S y s t em . out типа S y s t em, которые используются в примерах
программ с самого начала данной книги. Благодаря этому класс P r i n t S t ream
я вляется одним из наиболее употребительных в Java. Он реализует интерфейсы
Appe ndaЬ l e , Au toC l o s eaЬ l e , C l o s eaЫe и FlushaЫ e .
В классе P r i n t S t ream определяется ряд конструкторов. Рассмотрим сначала
следующие формы конструкторов этого класса:
PrintStreaш (OUtputStreaш поwож - lllDJoдa)
PrintStreaш (OUtputStreaш поwож - В51Jlода , boolean авwооvисwжа)
Printstreaш (OUtputStreaш поwож lllDJOдa , boolean авwооvисwжа ,
Strinq набор_ синво:izов) throws UnsupportedEncodinqException
где параметр поток_ вывода обозначает открытый поток вывода типа OutputStream,
который будет принимать выводимые данные. Параметр а в тоочистка определя·
ет, будет ли буфер вывода автоматически очищаться при каждой записи последова·
тельности символов новой строки (\n) , записи массива байтов или вызове метода
println ( ) . Если параметр а в тоочистка принимает лоmческое значение true, то
происходит автоматическая очистка буфера вьmода. А если этот параметр принима·
ет логическое значение fa l s e , то очистка буфера вывода не производится автомати·
чески.
----------------------------------------------------------------------------------------------------------------------
*/