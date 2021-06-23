public class GarbageCollectionjm {

    public static void main(String[] args) {
        // Java has 2 types of memory: Stack and Heap

        // Stack - a fast access memory -> local variables, object references and method calls are stored in stack
        // Heap - a slower, bigger type of memory where all objects are created, stored and garbage collected.
        // Garbage collection - Automatic removal of unused objects from heap memory.

//        int [] arr = new int[1000000000];  // Run out of heap space if you create large number of objects in short amount of time
      //   OutOfMemoryError: Java heap space

      //  m1();  //StackOverflowError is the stack memory error


        Student s1 = new Student();
        Student s2 = new Student();

        s2 = s1;

        Student s3 = s1; //
        s1 = null;
        s2 = null;

        System.gc(); // it is only a suggestion for JVM to start the GC process




    }

    public static void  m1(){
        m1();  //recursive call
    }
}
