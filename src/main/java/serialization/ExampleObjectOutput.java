package serialization;

public interface ExampleObjectOutput { }

/*
----------------------------------------------------------------------------------------------------------------------
Интерфейс Obj ectOutput расширяет интерфейсы AutoClo seaЫe и Da ta
Outpi t , поддерживая сериализацию объектов. В нем определяются методы, пере­
численные в табл. 20.7. Следует особо отметить метод wr valueInt teOb j e c t ( ) , который вы­
зывается для сериализации объекта. При возникновении ошибок все методы этого
интерфейса генерируют исключение типа IOExcept ion.
----------------------------------------------------------------------------------------------------------------------
*/