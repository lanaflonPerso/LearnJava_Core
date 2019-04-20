package IO;

import java.io.ByteArrayInputStream;

public class ExampleByteArrayInputStream {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------
//        // Demonstrate ByteArrayInputStream.
//        String tmp = "abcdefghijklmnopqrstuvwxyz";
//        byte b[] = tmp.getBytes();
//
//        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
//        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);
//--------------------------------------------------------------------------------------------------------------------
        /*Класс ByteAr r a y l npu t S t re am реали­
        зует методы ma r k ( ) и r e s e t ( ) . Но если метод rna r k ( ) не вызывается , то метод
        re set ( ) устанавливает указатель на начало потока ввода (в данном случае - в на­
        чало массива байтов, передаваемого конструктору данного класса) . В приведен­
        н ом ниже примере показано, как пользоваться методом r e s e t ( ) для чтения одних
        и тех же вводимых данных дважды. В данном примере программа читает и выво­
        дит буквы " аЬ с " сначала в нижнем регистре, а затем в верхнем.*/
        String tmp = "abc";
        byte b[] = tmp.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);

        for (int i=0; i<2; i++) {
            int c;
            while ((c = in.read()) != -1) {
                if (i == 0) {
                    System.out.print((char) c);
                } else {
                    System.out.print(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            in.reset();
        }
//--------------------------------------------------------------------------------------------------------------------
    }
}

/*
----------------------------------------------------------------------------------------------------------------------
Класс ByteAr r a y l npu t S t re am реализует поток ввода, использующий массив
байтов в качестве источника данных.
----------------------------------------------------------------------------------------------------------------------
Метод c l o s e ( ) не оказывает никакого влияния на объект класса ByteArray­
I npu t S t re am, поэтому вызывать его для данного объекта класса не нужно, хотя
это и не считается ошибкой.
----------------------------------------------------------------------------------------------------------------------
*/