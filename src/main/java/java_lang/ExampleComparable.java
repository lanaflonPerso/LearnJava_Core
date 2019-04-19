package Examples.java_lang;

import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface.
 *
 * @author Cay Horstmann
 * @version 1.30 2004-02-27
 */
public interface ExampleComparable {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all EmployeeRAF objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     *
     * @param other another EmployeeRAF object
     * @return a negative value if this employee has a lower salary than
     * otherObject, 0 if the salaries are the same, a positive value otherwise
     */
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}

/*
----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! В документации на интерфейс Com p a ra ble предполагается, что метод
compareToO должен быть совместим с методом equals(). Это означает, что результат сравне­
ния х .compareTo (у) должен быть равен нулю, если к такому же результату приводит сравнение
х.equals (у). Этому правилу следует большинство классов из прикладного программного интер­
фейса Java API, где реализуется интерфейс Comparable.
----------------------------------------------------------------------------------------------------------------------
НАЗАМЕТКУ! В языке Java имеется следующее стандартное требование: "Автор реализации метода
должен гарантировать, что для всех объектов х и у выполняется условие sgn (х. compareTo (у))
= -sgn (у. compareTo (х)). (Это означает, что если при вызове у. compareTo (х) генерируется
исключение, то же самое должно происходить и при вызове х.compareTo (у).)” Здесь sgn озна­
чает знак числа: sgn(n) равно - 1 , если п — отрицательное число; 0, если п = 0; или 1, если
п — положительное число. Иными словами, если поменять местами явный и неявный параметры
метода compareTo (), знак возвращаемого числового значения (но не обязательно его фактиче­
ская величина) также должен измениться на противоположный.
Что касается метода equals О, то при наследовании могут возникнуть определенные затрудне­
ния. В частности, класс Manager расширяет класс EmployeeRAF, а следовательно, он реализует ин­
терфейс Comparable<EmployeeRAF>, а не интерфейс Comparable<Manager>, как показано ниже.
                class Manager extends EmployeeRAF{
                    public int compareTo(EmployeeRAF other){
                        Manager otherManager = (Manager) other; // Так нельзя!
                        ...
                    }
                    ...
                }
Но в этом случае нарушается правило "антисимметрии". Если объект х относится к классу
EmployeeRAF, а объект у — к классу Manager, то вызов х .compareTo (у) не приведет к исклю­
чению, поскольку х и у будут сравнены как объекты класса EmployeeRAF. А при противоположном
вызове у.compareTo (х) будет сгенерировано исключение типа ClassCastException. Анало­
гичная ситуация возникает при реализации метода equals ( ) , которая обсуждалась в главе 5. Из
этого за труднительного положения имеются два выхода.
Если у подклассов разные представления о сравнении, нужно запретить сравнение объектов,
принадлежащих разным классам. Таким образом, каждый метод compareTo () должен начи­
наться со следующей проверки:
                if (getClass() != other.getClass()) throw new ClassCastException();
Если ж е существует общий алгоритм сравнения объектов подклассов, то в суперклассе следует
реализовать единый метод compareToO и объявить его как final.
Допустим, в организации руководящие работники считаются выше рядовых по рангу, независимо
от зарплаты. Как в таком случае быть с другими подклассами, например Executive и Secretary?
Если требуется учредить нечто вроде табеля о рангах, то в класс EmployeeRAF следует ввести метод
rank ( ) . Тогда в каждом подклассе метод rank() должен переопределяться, а результаты его ра­
боты учитываться при выполнении метода compareToO.
----------------------------------------------------------------------------------------------------------------------
НАЗАМЕТКУ! В версии Java SE 5.0 интерфейс Comparable стал обобщенным, как показано ниже.
        public interface Comparable<T>{
            int compareTo(T other); // этот параметр относится
                // к обобщенному типу Т
        }
Так, если класс реализует интерфейс Comparable<EmployeeRAF>, он должен содержать следую­щий метод:
        int compareTo (EmployeeRAF other) ;
По желанию можно по-прежнему пользоваться базовым (иначе называемым "сырым”) типом Comparable, но в этом случае придется
вручную приводить параметр метода compareTo() к требуемому типу.
----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! На первый взгляд может показаться, что метод sort ( ) из класса Arr ay оперирует
только массивами типа Comparable [ ] и что компилятор выдаст предупреждение, как только об­
наружит вызов метода sort() для массива, элементы которого не реализуют данный интерфейс.
Увы, это не так. Вместо этого метод sort О принимает массивы типа Object [ ] и выполняет при­
ведение типов, как показано ниже.
// Такой подход принят в стандартной библиотеке,
// но применять его все же не рекомендуется
if (((Comparable) a[i]).compareTo(a[j]) > 0)
{
// переставить элементы массива a[i] и a[j]
}
Если элемент массива a[i] не принадлежит классу, реализующему интерфейс Comparable, вир­
туальная машина сгенерирует исключение.
----------------------------------------------------------------------------------------------------------------------
Разу­меется, существует и неявное требование: метод сошрагеТо() должен на самом деле быть способным сравнивать два
объекта и возвращать признак того, что один из них больше другого. В таком случае этот метод должен возвращать
отрицательное число­вое значение, если объект х меньше объекта у, нулевое значение — если они равны, а иначе
—•положительное числовое значение.

compareTo(), возвращающий от­рицательное числовое значение, если первый его аргумент меньше второго; нулевое
значение, если аргументы равны; а иначе — положительное числовое значение.

СОВЕТ. Метод compareTo() из интерфейса Comparable возвращает целое значение. Если
объекты не равнозначны, возвращается положительное или отрицательное числовое значение.
Возможность использовать в качестве признака неравенства любое число, отличное от нуля, может
оказаться полезной при сравнении целочисленных полей. Допустим, у каждого работника имеется
однозначный идентификационный номер. В этом случае можно возвратить разность идентифика­
ционных номеров id - other.id. Она будет отрицательной, если идентификационный номер
первого работника меньше идентификационного номера второго работника, нулевой, если номера
равны, а иначе — положительной. Следует, однако, иметь в виду, что пределы изменения целых
значений должны быть достаточно малы, чтобы вычитание не привело к переполнению. Если з а ­
ранее известно, что идентификационный номер не является отрицательным или его абсолютное
значение не превышает величину (Integer.MaxjValue - 1) / 2, рассматриваемый здесь
способ сравнения можно смело применять.
Разумеется, такой способ вычитания не подходит для чисел с плавающей точкой. Разность salary -
o ther. sa la ry может быть округлена до нуля, если размеры зарплат очень близки, но не оди­
наковы. В результате вызова Double.compare(х, у) просто возвращается значение -1 , если
х < у,илизначение1,еслих> 0.
----------------------------------------------------------------------------------------------------------------------
ВНИМАНИЕ! При объявлении метода сошрагеТо() в интерфейсе модификатор доступа public
не указывается, поскольку все методы интерфейса автоматически являются открытыми. Но при
реализации интерфейса этот модификатор доступа должен быть непременно указан. В противном
случае компилятор предположит, что область действия этого метода ограничивается пакетом, хотя
по умолчанию она не выходит за пределы класса. В итоге компилятор выдаст предупреждение
о попытке предоставить более ограниченные права доступа.
----------------------------------------------------------------------------------------------------------------------
•int compareTo(T other)
    Сравнивает текущий объект с заданным объектом o t h e r и возвращает отрицательное целое зна­
    чение, если текущий объект меньше, чем объект o t h e r , нулевое значение, если объекты равны;
    а иначе — положительное целое значение.
----------------------------------------------------------------------------------------------------------------------
*/
