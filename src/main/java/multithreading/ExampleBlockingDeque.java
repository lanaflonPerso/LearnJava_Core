package multithreading;

public class ExampleBlockingDeque {

	public static void main(String[] args) {

	}

}

/*
-----------------------------------------------------------------------------------------------------------
•void putFirst(E element)
•void putLast(E element)
	Вводят элемент в очередь, устанавливая, если требуется, блокировку.
	
•Е takeFirstO
•Е takeLastO
	Удаляют элемент из головы очереди и возвращают его, устанавливая, если требуется, блокировку.
	
•boolean offerFirst(E element, long time, TimeUnit unit)
•boolean offerLast(E element, long time, TimeUnit unit)
	Вводят заданный элемент в очередь и возвращают логическое значение true при удачном исхо­
	де, устанавливая, если требуется, блокировку на время ввода элемента или до истечения времени ожидания.
	
•E pollFirst(long time, TimeUnit unit)
•E pollLast(long time, TimeUnit unit)
	Удаляют и возвращают элемент из головы очереди, устанавливая, если требуется, блокировку
	до тех пор, пока элемент доступен, или ж е до тех пор, пока не истечет время ожидания. При неу­
	дачном исходе возвращают пустое значение null.
-----------------------------------------------------------------------------------------------------------
*/