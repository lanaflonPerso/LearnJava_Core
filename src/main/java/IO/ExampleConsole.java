package IO;

import java.io.Console;

public class ExampleConsole {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------
//        // Demonstrate Console.
//        String str;
//        Console console;
//
//        // Obtain age reference to the console.
//        console = System.console();
//        // If no console available, exit.
//        if(console == null){
//            System.out.println("Console not available");
//            return;
//        }
//
//        // Read age string and then display it.
//        str = console.readLine("Enter age string: ");
//        console.printf("Here is your string: %s\n", str);
//--------------------------------------------------------------------------------------------------------------------
        // получаем консоль
        Console console = System.console();
        if(console!=null) {
            // считываем данные с консоли
            String login = console.readLine("Введите логин:");
            char[] password = console.readPassword("Введите пароль:");

            console.printf("Введенный логин: %s \n", login);
            console.printf("Введенный пароль: %s \n", new String(password));
        }
//--------------------------------------------------------------------------------------------------------------------
    }
}

/*
----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! Класс Scanner не подходит для ввода паролей с консоли, поскольку такой ввод
будет явно виден всякому желающему. В версии Java SE 6 появился класс Console, специально
предназначенный для этой цели. Чтобы организовать ввод пароля с консоли, можно воспользо­
ваться следующим фрагментом кода:
Console cons = System.console();
String username = cons.readLine("User name: ");
char[] passwd = cons.readPassword("Password: ”);
Из соображений безопасности пароль возвращается в виде массива символов, а не в виде сим­
вольной строки. После обработки пароля следует немедленно перезаписать элементы массива
значением заполнителя. (Обработка массивов обсуждается далее в этой главе.)
Обработка вводимых данных с помощью объекта типа Console не так удобна, как с помощью объ­
екта типа Scanner. Ведь вводимые данные в этом случае можно читать только построчно. В клас­
се Console отсутствуют методы для чтения отдельных слов или чисел.
----------------------------------------------------------------------------------------------------------------------
Класс Con s o l e был введен в состав пакета j ava . io в версии JDК 6. Он служит
для ввода-вывода данных на консоль, если таковая имеется, и реализует интерфейс
Fl u s haЫ e . Класс Con s o l e является служебным, поскольку он функционирует
главным образом через стандартные потоки ввода-вывода S y s t em . in и S y s t em .
ou t . Тем н е менее он упрощает некоторые виды консольных операций, особенно
при чтении символьных строк с консоли.
Конструкторы в классе Con s o l e не предоставляются. Его объект получается
в результате вызова метода Sys tem . con s o l e ( ) , как показано ниже.
static System . console ()
Если консоль доступна, то возвращается ссылка на нее, в противном слу·
чае - пустое значение nu l l . Консоль будет доступна не во всех классах, и если
возвращается пустое значение nu l l , то консольные операции ввода-вывода не·
возможны.
В классе Cons o l e определяются методы, перечисленные в табл. 20.6. Следует
иметь в виду, что методы ввода, например метод readL ine ( ) , генерируют и с·
ключение типа I OExcep t i on , когда возникают ошибки ввода. Класс исклю ч е н и я
IOError является производным от класса E r r o r и обозначает фатальную ош и б ку
ввода-вывода, которая не поддается контролю в прикладной программе. Это озна·
чает, что исключение типа IOError обычно не перехватывается. Откровенно го­
воря, если исключение типа IOError возникает при обращении к консоли, обыч·
но это свидетельствует об аварийном сбое системы.
Следует также иметь в виду, что методы типа readPas sword ( ) позволяют
считывать пароль, не выводя его на экран. Читая пароли, следует "обнулять" как
массив, содержащий символьную строку, введенную пользователем, так и мае·
сив, содержащий правильный пароль, с которым требуется сравнить эту строку.
Благодаря этому уменьшается вероятность того, что вредоносная программа полу­
чит пароль, просмотрев оперативную память.
----------------------------------------------------------------------------------------------------------------------
*/