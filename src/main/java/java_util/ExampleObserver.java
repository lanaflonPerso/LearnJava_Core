package Examples.java_util;

public interface ExampleObserver {
}


/*
----------------------------------------------------------------------------------------------------------------------
Чтобы организовать наблюдение за объектом, следует реализовать интерфейс
В этом интерфейсе определяется следующий единственный метод:
Ob s e r ve r .
void update (ObservaЫe иабтодаемый _ о&ъект , Obj ect аргумент)
где параметр
на блюда емый_ объект обозначает объект для наблюдения , тогда как
ргумент
-
значение,
передаваемое методом no t i fyOb s e rve r s ( ) . Метод up­
а
d a t e ( ) вызывается при изменении наблюдаемого объекта.
----------------------------------------------------------------------------------------------------------------------
Класс Obs e rvaЫ e и интерфейс Obs e rve r позволяют реализовывать изощренные
программные архитекrуры, основанные на методике "документ-представление".
-----------------------------------------------------------------------------------------------------------------------
*/