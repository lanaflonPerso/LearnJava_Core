package reflection_api;


import java.util.Date;

public class ExampleReflectionClass {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------------
        Class ell = Date.class; // если произведен импорт пакета java.util.*;
        /*Следует иметь в виду, что объект типа Class фактически описывает тип, который не обязательно является классом.
         Например, тип int — это не класс, но, несмотря на это, int.class — это объект типа Class.*/
        Class с12 = int.class;

        Class cl3 = Double[].class;

        /*Виртуальная машина Java поддерживает однозначный объект типа Class для каж­дого типа объектов. Следовательно,
        для сравнения объектов можно воспользоваться операцией — , как показано ниже.*/
//        Employee_ForUseHashCode e = new Employee_ForUseHashCode();
//        if (e.getClass() == Employee_ForUseHashCode.class);

        /*Еще один полезный метод позволяет создавать при выполнении програм­мы новый экземпляр класса. Этот метод, как
        и следовало ожидать, называется newlnstance () и вызывается следующим образом:*/
//        try {
//            e.getClass().newInstance();
//        } catch (InstantiationException e1) {
//            e1.printStackTrace();
//        } catch (IllegalAccessException e1) {
//            e1.printStackTrace();
//        }

        /*В результате такого вызова создается новый экземпляр того же класса, что и е. Для инициализации вновь
        созданного объекта в методе newlnstance () используется конструктор без аргументов. Если в классе отсутствует
        конструктор без аргументов, генерируется исключение. Используя методы forName() и newlnstance (), можно
        создавать экземпляры классов, имена которых хранятся в символьных строках:*/
        String s = "java.util.Date";
        try {
            Object m = Class.forName(s).newInstance();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        }
//---------------------------------------------------------------------------------------------------------------------
    }
}


/*
----------------------------------------------------------------------------------------------------------------------
ВНИМАНИЕ! Исторически сложилось так, что метод getName() возвращает для массивов не со­
всем обычные имена их типов, как показано ниже.
    •При вызове Doublet[].class.getName() возвращается символьная строка "[Ljava.lang. Double
    •При вызове int[] .class.getNameO возвращается символьная строка "[I"
----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! Если при создании объекта по имени класса требуется передать конструктору каки ­е-нибудь параметры, то
использовать приведенные выше операторы нельзя. Вместо этого следует вызвать метод newlnstance() из класса Constructor.
----------------------------------------------------------------------------------------------------------------------
•String getName()
    Возвращает имя класса.

•Class getSuperclass()
    Возвращает имя суперкласса данного класса в виде объекта типа Class.

•static Class forName (String className)
    Возвращает объект типа Class, представляющий указанный класс className.

•Object newlnstance()
    Возвращает новый экземпляр класса.

•Field[] getFieldsO 1.1
•Field [] getDeclaredFields () 1.1
    Метод getFields ( ) возвращает массив, который содержит объекты типа Field, соответствующие
    открытым полям анализируемого класса или его суперкласса. А метод getDeclaredFields ()
    возвращает массив, содержащий объекты типа Field, соответствующие всем полям анализируе­
    мого класса. Оба метода возвращают массив нулевой длины, если такие поля отсутствуют или ж е
    если объект типа Class представляет собой простой тип данных или массив.

•Method [] getMethodsO 1.1
•Method [] getDeclaredMethods () 1.1
    Возвращают массив, который содержит объекты типа Method, соответствующие только открытым
    методам, включая унаследованные (метод getMethods ()), или ж е всем методам анализируемого
    класса или интерфейса, за исключением унаследованных (метод getDeclaredMOthodsO ).

•Constructor[] getConstruetors() 1.1
•Constructor[] getDeclaredConstruetors() 1.1
    Возвращают массив, который содержит объекты типа Constructor, соответствующие только
    открытым конструкторам (метод getConstructors ( ) ) или ж е всем конструкторам класса, пред­
    ставленного объектом типа Class (метод getDeclaredMethods ()).

•Field getField(String name)
•Field [] getFields()
    Возвращают общедоступное поле с указанным именем или массив, содержащий все поля.

•Field getDeclaredField(String name)
•Field[] getDeclaredFields()
    Возвращают объявленное в классе поле с указанным именем или же массив, содержащий всеполя.

•T newlnstance() 5.0
    Возвращает новый экземпляр, созданный конструктором по умолчанию.

•Т cast (Object obj) 5.0
    Возвращает заданный объект obj, если он пустой (null) или может быть преобразован в обоб­
    щенный тип Т, а иначе генерирует исключение типа BadCastException.

•Т[] getEnumConstants() 5.0
    Возвращает массив всех значений, если т — перечислимый тип, а иначе — пустое значение null.

•Class<? super Т> getSuperclass() 5.0
    Возвращает суперкласс данного класса или пустое значение null, если обобщенный тип т не обо­
    значает класс или же обозначает класс Object.

•Construetor<T> getConstructor (Class... parameterTypes) 5.0
•Cons true tor<T> getDeclaredConstructor (Class... parameterTypes) 5.0
    Получают открытый конструктор или ж е конструктор с заданными типами параметров.

•T newlnstance (Object.. . parameters) 5.0
    Возвращает новый экземпляр, созданный конструктором с заданными параметрами.

•TypeVariable[] getTypeParameters() 5.0
    Получает переменные обобщенного типа, если этот тип был объявлен как обобщенный, а иначе массив нулевой длины.

•Type getGenericSuperclass() 5.0
    Получает обобщенный тип суперкласса, который был объявлен для этого типа, или ж е пустое значение null, если это
    тип Object или вообще не тип класса.

•Туре[] getGenericInterfaces() 5.0
    Получает обобщенные типы интерфейсов, которые были объявлены для этого типа, в порядке объявления, или массив нулевой
    длины, если данный тип не реализует интерфейсы.
    
•URL getResource (String name) 1.1
•InputStream getResourceAsStream (String name) 1.1
	Находят ресурс там же, где и класс, возвращая его URL или поток ввода, который можно исполь­
	зовать для загрузки. Если ресурс не найден, эти методы возвращают пустое значение null, не
	генерируя исключений и не сообщая об ошибках ввода-вывода.
----------------------------------------------------------------------------------------------------------------------
*/