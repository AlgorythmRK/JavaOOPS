//Creating the Class and Its Objects

public  class Main3 {
   //declaration of the data type called Student
    public static class Student
   {
    String Name;
    int RollNo;
    String Div;
   }    

   public static void  main(String args[])
   {
    //declaration of the object
      Student S = new Student();
      //the Below are the attributes
      S.Div="L";
      S.Name="Adavi Rao K";
      S.RollNo=20;
      System.out.println(S.Div);
      System.out.println(S.Name);
      System.out.println(S.RollNo);

      //Multiple 0bject of the same class can be created
      Student O = new Student();
      O.Name="Manja";
      O.RollNo=32;
      O.Div="N";
      System.out.println(O.Div);
      System.out.println(O.RollNo);
      System.out.println(O.Name);
      
   }
}
