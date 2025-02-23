public class Test {

    public static void main(String[] args) {

        int i = 3;
        int a = i++; // връща 3 първонач.ст-т на i, после увеличава на 4 /i = 4
        System.out.println(a); //3


        int ii = 3;
        int aa = ++ii; //  връща 4 увеличената ст-т на ii /i = 4
        System.out.println(aa); //4

//Скоуп на променлива
        int outer = 1;
            if(outer == 1) {
                int inner = 2;
                System.out.println("inner = " + inner);
                System.out.println("outer = " + outer);
            }
        int inner = 3;
        System.out.println("inner = " + inner);
        System.out.println("outer = " + outer);



    }
}
