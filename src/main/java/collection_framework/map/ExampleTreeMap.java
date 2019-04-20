package collection_framework.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------------------------------
        Map<Integer, String> treeMap = new TreeMap<>();
//        Map<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(3, "c");
        treeMap.put(2, "d");
        treeMap.put(4, "b");
        treeMap.put(1, "e");
        treeMap.put(5, "a");
        for(Map.Entry<Integer, String> map: treeMap.entrySet()){
            System.out.println(map.getKey() + ", " + "\"" + map.getValue() + "\"");
        }
//-----------------------------------------------------------------------------------------------------------------------------------------
        // Create age tree map.
        TreeMap<String, Double> treeMap01 = new TreeMap<String, Double>();
        // Put elements to the map.
        treeMap01.put("John Doe", 3434.34);
        treeMap01.put("Tom Smith", 123.22);
        treeMap01.put("Jane Baker", 1378.00);
        treeMap01.put("Tod Hall", 99.22);
        treeMap01.put("Ralph Smith", -19.08);
        // Get age set of the entries.
        Set<Map.Entry<String, Double> > set = treeMap01.entrySet();
        // Display the elements.
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Deposit 1000 into John Doe's account.
        double balance = treeMap01.get("John Doe");
        treeMap01.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " +
                treeMap01.get("John Doe"));
//-----------------------------------------------------------------------------------------------------------------------------------------
    }
}

/*
-----------------------------------------------------------------------------------------------------------------------------------------
 TreeMap — реализация Map основанная на красно-чёрных деревьях. Как и LinkedHashMap является упорядоченной. По-умолчанию,
 коллекция сортируется по ключам с использованием принципа "natural ordering", но это поведение может быть настроено под
 конкретную задачу при помощи объекта Comparator, которые указывается в качестве параметра при создании объекта TreeMap.
-----------------------------------------------------------------------------------------------------------------------------------------
Класс TreeMap расширяет класс AЬstractMap и реализует интерфейс NavigaЬleMap. В нем создается отображение, размещаемое в
древовидной структуре. В классе TreeMap предоставляются эффективные средства для хранения пар "ключ-значение" в отсортированном
порядке и обеспечивается их быстрое извлечение. Следует заметить, что , в отличие от хеш-отображения, древовидное
отображение гарантирует, что его элементы будут отсортированы по порядку нарастания ключей.
-----------------------------------------------------------------------------------------------------------------------------------------
Классы TreeSet и TreeMap сохраняют элементы в отсортированном порядке. Однако понятие "порядок сортировки" точно определяет
применяемый ими компаратор. По умолчанию эти классы сохраняют элементы , используя то, что в Java называется естественным
упорядичением, т.е. ожидаемым упорядочением, когда после А следует В, а после 1 - 2 и т.д. Если же элементы требуется
упорядочить иным образом, то при создании множества или отображения следует указать компаратор типа Comparator. Это дает
возможно точно управлять порядком сохранения элементов в отсортированных коллекциях.
-----------------------------------------------------------------------------------------------------------------------------------------
Ввод элемента в древовидное множество происходит медленнее, чем в хеш-таблицу (табл. 9.3), но все же намного быстрее, чем
в требуемое место массива или связного списка. Если древовидное множество состоит из п элементов, то в среднем требуется
log2n сравнений, чтобы найти правильное расположение нового элемента. Так, если древовидное множество уже содержит 1000
элементов, для ввода нового элемент потребует около 10 сравнений.
------------------------------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! Чтобы пользоваться древовидным множеством, необходимо иметь возможность сравнивать его элементы. Для этого
элементы должны относиться к классу, реализующему интерфейс Comparable (см. раздел 6.1 .1), а иначе придется предоставить
объект типа Comparator при построении множества (см. раздел 6.3 .8).
-----------------------------------------------------------------------------------------------------------------------------------------
•
ТгеёМарО
Конструирует древовидное отображение по ключам, относящимся к типу, реализующему интерфейс
Comparable.
•
TreeMap (Comparators super К> с)
Конструирует древовидное отображение, используя указанный компаратор для сортировки ключей.
•
TreeMap (Мар<? extends К, ? extends V > entries)
Конструирует древовидное отображение и вводит все элементы из указанного отображения.
•
TreeMap(SortedMapS extends К, ? extends V> entries)
Конструирует древовидное отображение и вводит все элементы из отсортированного отображения,
используя тот же самый компаратор элементов, что и для отсортированного отображения.
-----------------------------------------------------------------------------------------------------------------------------------------

*/