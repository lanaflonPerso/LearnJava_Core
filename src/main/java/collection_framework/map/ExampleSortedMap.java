package collection_framework.map;

public interface ExampleSortedMap {

}


/*
-----------------------------------------------------------------------------------------------------------------------
Этот интерфейс расширяет интерфейс Мар.Он обеспечивает размещение заnисей в отображении по порядку нарастания ключей.
-----------------------------------------------------------------------------------------------------------------------
Для формирования поддиапазонов отсортированных множеств и отображений задается порядок сортировки, а не позиции элементов.
С этой целью в интерфейсе
                SortedSet объявляются три метода:
                SortedSet<E> subs et(Е from, Е to)
                SortedSet<E> headset(E to)
                SortedSet<E> tailSet(E from)
Все они возвращают подмножества всех элементов, которые больше или равны значению параметра from и меньше значения
параметра to. А для отсортированных отображений аналогичные методы возвращают представления отображений, состоящие из всех
элементов, в которых ключи находятся в заданном поддиапазоне. Все эти методы перечислены ниже.
                SortedMap<K, V> subMap(K from, К to)
                SortedMap<K, V> headMap(K to)
                SortedMap<K, V> tailMap(K from)
-----------------------------------------------------------------------------------------------------------------------
•
Comparators super K> comparator ()
Возвращает компаратор, используемый для сортировки ключей, или пустое значение null, если
ключи сравниваются методом сош раге ТоО из интерфейса Comparable.
•
К firstKeyO
•
К lastKeyO
Возвращают наименьший и наибольший ключи в отображении.
•
SortedMap<K, V > subMap(K firstIncluded, К firstExcluded)
•
SortedMap<K, V > headMap(K firstExcluded)
•
SortedMapCK, V > tailMap(K firstlncluded)
Возвращают представление элементов отсортированного отображения в заданном диапазоне.
-----------------------------------------------------------------------------------------------------------------------

*/