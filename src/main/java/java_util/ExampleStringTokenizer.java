package Examples.java_util;

import java.util.StringTokenizer;

public class ExampleStringTokenizer {
    public static void main(String[] args) {
////---------------------------------------------------------------------------------------------------------------------
        // Demonstrate StringTokenizer.
        String in = "title=Java: The Complete Reference;" +
                    "author=Schildt;" +
                    "publisher=McGraw-Hill;" +
                    "copyright=2014";

        StringTokenizer st = new StringTokenizer(in, "=;");

        while(st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
//---------------------------------------------------------------------------------------------------------------------
//        String input = "But I'm not dead yet! I feel happy!";
//        StringTokenizer stoke = new StringTokenizer(input);
//
//        while(stoke.hasMoreElements()) System.out.print(stoke.nextToken() + " ");
//
//        System.out.println();
//        System.out.println(Arrays.toString(input.split(" ")));
//
//        Scanner scanner = new Scanner(input);
//        while(scanner.hasNext()) System.out.print(scanner.next() + " ");
//--------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------------
    }
}

/*
-----------------------------------------------------------------------------------------------------------------------
Обработка текста зачастую предполагает синтаксический анализ или разбор
ф орматированной входной строки. Синтакси'Чf!ский анализ подразумевает разделе­
ние текста на ряд отдельных частей, так называемых лексем, которые способны пе­
редать в определенной последовательности некоторое семантическое значение.
Класс S t r i ngToken i z e r обеспечивает первую стадию процесса синтаксического
а нализа, и поэтому его зачастую называют лекси-ческuм аналшатором или просто ска·
нером. Этот класс реализует интерфейс Enume r a t i on. Таким образом, задав вход­
ную строку, средствами класса S t r i ngTokeni z e r можно перечислить содержащи­
еся в ней отдельные лексемы.
Чтобы воспользоваться классом S t r i ngTo ken i z e r , следует указать входную
и символьную строку, содержащую разделители. Разделители это символы, раз­
деляющие лексемы. Каждый символ в символьной строке разделителей рассма­
тривается как допустимый разделитель. Например, символьная строка 11 , ; : 11 уста­
навливает в качестве разделителей запятую, точку с запятой и двоеточие. Набор
разделителей, выбираемых по умолчанию, состоит из пробельных символов: про­
бела, знака табуляции , перевода строки и возврата каретки.
-----------------------------------------------------------------------------------------------------------------------
int countTokena()
                           Исполь.зуя текущий набор разделителей, определяет коли·
                           чество лексем, которые осrалось разобрать и во3вратить
                           в качестве результата

boolean hasМoreElements()  Возвращает логическое 3начение true, если в символьной
                           строке остается одна лексема или больше, а иначе - логиче­
                           ское значение fal.se

Ьoolean hasМoreTokens()    Возвращает логическое значение true, если в символьной
                          строке остается одна лексема или больше, а иначе - логиче­
                          ское 3начение false

OЬject nextEleamt()       Возвращает следующую лексему в виде объекта типа CЬject

Strinq nextToken()        Возвращает следующую лексему в виде объекта типа String

Strinq nextToken(Strinq razdeliteli)
                          Возвращает следующую лексему в виде объекта типа OЬject
                          и .задает символьную строку ра:щелителей в соответствии со
                          значением параметра разде.литми
-----------------------------------------------------------------------------------------------------------------------

*/
