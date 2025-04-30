
class Cat {
   
    private static int catcount=2;

    public void meow()
    {
        System.out.println("Meow");
    }

    public Cat()
    {
        catcount++;

    }

    public static int getcatcount()
    {
      return catcount;
    }
}

public class Catcreate {
    public static void main(String[] args)
    {
        System.out.println(Cat.getcatcount());

        Cat mycat=new Cat();
        mycat.meow();
        System.out.println(Cat.getcatcount());
    }
}
