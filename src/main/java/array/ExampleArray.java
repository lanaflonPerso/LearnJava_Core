package array;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ExampleArray {
    public static void main(String[] args) throws IOException {

//======================================================================================================================
//=========================================== interesting functionality ================================================
//======================================================================================================================

        int[] argA = new int[3];
        argA[0] =
        argA[1] =
        argA[2] = 3;
//        System.out.println(Arrays.toString(argA));

//======================================================================================================================
//======================================================================================================================
//======================================================================================================================

        Path path = Paths.get("core/src/main/resources/IO/alice30.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
//        System.out.println(contents);

        // If instead of a collection there is an array, then the Stream.of() method serves for this purpose.
        Stream<String> words = Stream.of(contents.split("\\PL+"));
//        words.forEach(i -> System.out.println(i));

        //The of() method has receive parameter varargs, therefore, a data stream can be created from any number
        // of arguments, as shown below.

        // And to create a stream of data from the part of the array is the method Arrays.stream(array, from, to).
        Stream<String> song = Stream.of("gently", "down", "the", "stream");
//        song.forEach(i -> System.out.println(i));

//======================================================================================================================
//======================================== array initialization ========================================================
//======================================================================================================================

        // You can create an array with a size zero
        int[] array9 = new int[0];

        // Here, the array is also initialized only for a specified number of elements.
        int[] array_A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(Arrays.toString(array_A));

        // Here, the array is also initialized only for a specified number of elements.
        int[] array_B = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(Arrays.toString(array_B));

        // not filling space in array, filled with zeros.
        int[] array2 = new int[18];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[11] = 11;
//        System.out.println(Arrays.toString(array2));
//        System.out.println(array2.length);

        // Attention here two arrays refer to the same link
        int[] array6 = array2;
        array6[11] = 22;
        System.out.println(Arrays.toString(array2));  // [1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(array6));  // [1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0]

        // And so the arrays do not reference the same link
        int[] array7 = Arrays.copyOf(array2, array2.length);
        array7[11] = 55;
//        System.out.println(Arrays.toString(array2));  // [1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0]
//        System.out.println(Arrays.toString(array7));  // [1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 55, 0, 0, 0, 0, 0, 0]

//--------------------------------------------------------------------------------------------------------------------
        int[] nums, nums1, nums2;
//        nums = new int[3];
//        nums1 = new int[3];
//        nums2 = new int[3];
//
//        int[] nums3[], nums4[], nums5[];
//        // nums3 = new int[3];    // Error of compilation
//        // nums4 = new int[3];    // Error of compilation
//        // nums5 = new int[3];    // Error of compilation
//        nums3 = new int[3][];
//        nums4 = new int[3][];
//        nums5 = new int[3][];
//
//        int nums6[], nums7[], nums8[];
//        // nums6 = new int[3][];    // Error of compilation
//        // nums7 = new int[3][];    // Error of compilation
//        // nums8 = new int[3][];    // Error of compilation
//        nums6 = new int[3];
//        nums7 = new int[3];
//        nums8 = new int[3];

        int treeD[][][] = new int[3][4][5];
        int i, j, k;

        for(i = 0; i < 3; i++){
            for(j = 0; j < 4; j++){
                for(k = 0; k < 5; k++){
                    treeD[i][j][k] = i * j * k;
                }
            }
        }
//        System.out.println(Arrays.deepToString(treeD));
//
//        for(i = 0; i < 3; i++){
//            for(j = 0; j < 4; j++){
//                for(k = 0; k < 5; k++){
//                    System.out.print(treeD[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

//        int k = 0;
//        int[][] arr2D = new int[4][];
//
//        arr2D[0] = new int[1];
//        arr2D[1] = new int[2];
//        arr2D[2] = new int[3];
//        arr2D[3] = new int[4];
//
//        for(int i = 0; i < 4; i++){
//            for(int j = 0; j < i + 1; j++){
//                arr2D[i][j] = k;
//                k++;
//            }
//        }
//
//        for(int i = 0; i < 4; i++){
//            for(int j = 0; j < i + 1; j++){
//                System.out.print(arr2D[i][j]);
//            }
//            System.out.println();
//        }
//----------------------------------------------------------------------------------------------------------------------

        String[] ddd = new String[3];
        int[] dde = new int[3];
        Integer[] ii = ArrayOperations.castIntArrayToIntegerArray(dde);

//======================================================================================================================
//=========================== There are two ways to initialize an array with an empty value ============================
//======================================================================================================================

        // First way
        int[] arg = null;

        // Second way
        int[] art = new int[0];

//======================================================================================================================
//======================================================================================================================
//======================================================================================================================
    }
}

/*
----------------------------------------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------------------------------------
Являются ли массивы в Java однородными?
Да. За исключением случаев, разрешённых полиморфизмом.
Пояснение: Массивы в Java однородные, то есть все элементы в массиве должны быть одного типа, за исключением случаев,
разрешённых полиморфизмом. Иными словами, когда вы создаёте массив, вы должны определить тип элементов, которые могут
в нём содержаться. Если тип не примитивный, а определённый через класс, то реальный массив, помимо объектов заданного
класса, может содержать также объекты подклассов того класса, который был указан в объявлении массива
----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! При необходимости можно создать массив нулевого размера. Такой массив может
оказаться полезным при написании метода, возвращающего массив, который оказывается в неко­
торых случаях пустым. Массив нулевой длины объявляется следующим образом:
new тип^элементов [0]
Следует, однако, иметь в виду, что массив нулевой длины не равнозначен массиву с пустыми зна­чениями null.
----------------------------------------------------------------------------------------------------------------------
НА ЗАМЕТКУ! У всех видов массивов имеется открытый, а не защищенный метод clone(). Им можно воспользоваться для создания
нового массива, содержащего копии всех элементов, как в следующем примере кода:
int[] luckyNumbers = { 2, 3, 5, 7, 11, 13 };
int[] cloned = (int[]) luckyNumbers.clone();
cloned[5] = 12; // не изменяет элемент массива luckyNumbers[5]
----------------------------------------------------------------------------------------------------------------------
ВНИМАНИЕ! Исторически сложилось так, что метод getName() возвращает для массивов не со­
всем обычные имена их типов, как показано ниже.
    •При вызове Doublet[].class.getName() возвращается символьная строка "[Ljava.lang. Double
    •При вызове int[] .class.getNameO возвращается символьная строка "[I"
----------------------------------------------------------------------------------------------------------------------
Неровные массивы
Все рассмотренные ранее языковые конструкции мало чем отличались от аналогичных конструкций в других языках программирования.
Но механизм массивов в Java имеет особенность, предоставляющую совершенно новые возможности. В этом языке вообще нет
многомерных массивов, а только одномерные. Многомерные массивы — это искусственно создаваемые "массивы массивов".
----------------------------------------------------------------------------------------------------------------------
ВНИМАНИЕ! Как ни досадно, но массивы наследуют метод toString() от класса Object, в ре­зультате чего тип массива
выводится в архаичном формате. Например, при выполнении приведен­ного ниже фрагмента кода получается символьная
строка " [101а46еЗО", где префикс [ I означа­ет массив целых чисел.
    int[] luckyNumbers = { 2, 3, 5, 7, 11, 13 };
    String s = "" + luckyNumbers;
В качестве выхода из этого неприятного положения можно вызвать статический метод Arrays.toString(). Так, при
выполнении следующего фрагмента кода будет получена символьная строка "[2, 3, 5, 7, 11, 13]”:
    String s = Arrays.toString(luckyNumbers) ;
А для корректного вывода многомерных массивов следует вызывать метод Arrays.deepToString().
----------------------------------------------------------------------------------------------------------------------
В массиве все элементы хранятся в памяти рядом друг с другом.
Массивы обеспечивают быстрое чтение.
Все элементы массива должны быть однотипными (только целые числа, только вещественные числа и т. д.).
----------------------------------------------------------------------------------------------------------------------
*/