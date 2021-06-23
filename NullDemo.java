public class NullDemo {

    public static void main(String[] args) {
        Student s1 = new Student();

       s1.printValues();
//       s1.printNameUppercase();


//       Student s2 = null;


//       s1.printID();

       // NP Exception is thrown if you access a reference variable
        // or call a method of a null object

        // WHenever you get NP Exception, check if the obkect you are calling the method on is initialized

        String str = null;
        System.out.println( printUpper(str));
    }


    public static String printUpper(String str){
        if(str == null){  // null check
           return "";
        }
        return str.toUpperCase();

    }


}
