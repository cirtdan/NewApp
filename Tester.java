package staticP;

public class Tester {

    public static void main(String[] args) {


        Class1 c1 = new Class1();
        Class1 c2 = new Class1();
        Class1 c3 = new Class1();
        Class1 c4 = new Class1();
        System.out.println(c4.numberStatic);

        Class1 c5 = new Class1();

        System.out.println(c5.numberInstance);  //1   //5  //1
        System.out.println(c5.numberStatic);    //1   //1  //5

    }
}
