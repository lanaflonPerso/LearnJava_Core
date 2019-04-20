package generics;

public class ExampleGenericMethods {
    public static void main(String[] args) {
        ExampleGenericMethods gm = new ExampleGenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
        gm.<ExampleGenericMethods>f(gm);
    }


    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
}

/*
----------------------------------------------------------------------------------------------------------------------
Обобщенные методы можно определять как в обычных, так и в обобщенных классах. Когда вызывается обобщенный метод, ему
можно передать конкретные типы данных, заключая их в угловые скобки перед именем метода, как показано ниже.
                String middle = ArrayAlg.<String>getMiddle("John", "Q.", "Public");
                gm.<ExampleGenericMethods>fArgInt(gm);

В данном случае (как и вообще) при вызове метода можно пропустить параметртипа String. У компилятора имеется достаточно
информации, чтобы вывести из такого обобщения именно тот метод, который требуется вызвать. Он сравнивает тип параметра
метода (т.е. String[] с обобщенным типом Т[]) и приходит к выводу, что вместо обобщенного типа Т следует подставить тип
String, что равнозначно следующему вызову:
                String middle = ArrayAlg.getMiddle("John", "Q.", "Public");

Выводимость типов в обобщенных методах практически всегда действует исправ­
но. Но иногда компилятор ошибается, и тогда приходится разбираться в тех ошиб­
ках, о которых он сообщает. Рассмотрим в качестве примера следующую строку кода:
double middle = ArrayAlg.getMiddle(3.14, 1729, 0);
При выполнении этой строки кода компилятор выведет сообщение об ошибке за­
гадочного содержания, но суть его в том, что данный код можно интерпретировать
двояко и в обоих случаях — правильно. По существу, компилятор выполняет автоу­
паковку параметра в один объект типа Double и два объекта типа Integer, а затем
пытается найти для них общий супертип. И таких супретипов два: класс Number и ин­
терфейс Comparable, который сам является обобщенным. В этом случае для устра­
нения ошибки методу следует передать все параметры со значениями типа double.
----------------------------------------------------------------------------------------------------------------------
*/