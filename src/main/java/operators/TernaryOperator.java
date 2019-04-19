package operators;

public class TernaryOperator {
    public static void main(String[] args) {
// ---------------------------------------------------------------------------------------------------------------------
        int luck_1 = 10;
        int luck_2 = 10;
//        if ((luck > 10 ? luck++ : luck--) < 10) {
//            System.out.println("Bear");
//        }
//        if (luck < 10){
//            System.out.println("Shark");
//        }

        System.out.println((luck_1 > 10 ? luck_1++ : luck_1--) < 10);
        System.out.println((luck_1 > 10 ? luck_1++ : luck_1--));
        System.out.println("------");
        System.out.println((luck_2 > 10 ? luck_2++ : --luck_2) < 10);
        System.out.println((luck_2 > 10 ? luck_2++ : --luck_2));
// ---------------------------------------------------------------------------------------------------------------------
    }
}
