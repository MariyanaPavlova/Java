public class SwitchDemoFallThrough {

    public static void main(String[] args) {
        int age = 13;

        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 15:
            case 16:
            case 17:  System.out.println("malak si ne si za barovete");
            		break;
            
            case 18:
            case 19:
            case 20: System.out.println("are piqnka idvai tebe chakahme");
            		break;
            
            case 80:
            case 81: System.out.println("ammm siguren li si? :) ");
            		break;

            default: System.out.println("hodi si zemi lichnata karta");
        }

    }
}
