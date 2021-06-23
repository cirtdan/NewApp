public class PrimitivesVsObjects {

    public static void main(String[] args) {

        double d = 7.8;


        Student s;

        s = new Student();



        System.out.println(s.age);

        new Student(); //

        System.out.println(new Student().age);

        studentInfo(new Student());

       Student st1 = new Student();

       studentInfo(st1);





    }


    public static void studentInfo(Student st){

    }

}
