package staticP;

import java.sql.SQLOutput;

public class QATester {

    public static void main(String[] args) {
        QAEngineer engineer1 = new QAEngineer("Rafael", 2, 30, 1, false);
        QAEngineer engineer2 = new QAEngineer("Bahar", 7, 31, 2, false);

//        System.out.println(QAEngineer.companyName); // static variables are the property of the class rather than each object
         // Static variables are accessed by ClassName.variablename
//        System.out.println(Math.PI);

//        System.out.println(engineer1.companyName); // Yopu can still access static variables with an object of the class

        engineer1.name = "Ilkin";

        System.out.println(engineer2.name);
        System.out.println(engineer1.name);

        engineer1.companyName = "Verizon";  //
        System.out.println(engineer2.companyName);
        System.out.println(engineer1.companyName);



    }
}
