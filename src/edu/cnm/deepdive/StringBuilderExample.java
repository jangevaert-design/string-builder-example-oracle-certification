package edu.cnm.deepdive;

public class StringBuilderExample {

  public static void main(String[] args) {
    String myString = "";

    for(char c = 'a'; c <= 'z'; c++) {
      myString += c;//for every iteration a new String object will be created.
      System.out.println(myString);
    }
    System.out.println("\n"+ myString);

    //by using the StringBuilder class you avoid creating multiple objects.
    StringBuilder sb = new StringBuilder();//create a new object of the StringBuilder class.

    for (char c = 'a'; c <= 'z'; c++) {
      sb.append(c);// add char to StringBuilder. This reuses StringBuilder without creating a String
      //every time.
    }
    System.out.println("\n" + sb);

    //
    StringBuilder builder = new StringBuilder("start");
    builder.append("-middle");//"start-middle".
    StringBuilder anotherBuilder = builder.append("-end");//"start-middle-end".
    System.out.println(builder);
    System.out.println(anotherBuilder);
    System.out.println("Same content: " +
        (System.identityHashCode(builder) == (System.identityHashCode(anotherBuilder))));
    System.out.println("same memory location: " + (builder == anotherBuilder));

    StringBuilder myBuilder = new StringBuilder();
    System.out.println("\nsize = " + myBuilder.length());
    System.out.println("capacity = " + myBuilder.capacity());

    myBuilder = new StringBuilder(100);
    System.out.println("\nsize = " + myBuilder.length());
    System.out.println("capacity = " + myBuilder.capacity());

    myBuilder.append("My new test");
    System.out.println("\nsize = " + myBuilder.length());
    System.out.println("capacity = " + myBuilder.capacity());

    StringBuilder a = new StringBuilder("This ");
    StringBuilder b = a.append("Java ");// here we have two times the same instance since we assigning
    //the a object to b.
    b = b.append("is").append(" so ").append("Cool");
    System.out.println(a);// will print "This Java is so Cool". Since we only have instantiated one
    // StringBuilder object
    System.out.println(b);// will print "This Java is so Cool"
  }
}
