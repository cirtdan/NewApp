public class AssignmentObjectVsPrimitives {

    public static void main(String[] args) {
//  Ziya

        int i = 8;
        int x = 90;

        i = x;

        Student s1 = new Student();
        s1.name = "Rafael";
        Student s2 = new Student();
        s2.name = "Gulara";
        s1 = s2;
        // Assign s2's reference to s1
        // s1 will point to whatever s2 currently points to
        System.out.println(s1.name);
        System.out.println(s2.name);


    }
}
