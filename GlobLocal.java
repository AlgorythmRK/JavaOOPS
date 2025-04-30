import java.util.Random;


class Diceroll {
    Random random;
    int number;
    Diceroll()
    {
        random=new Random();
        int number=0;
        roll(random,number);
        //// this results in error as the variables are decalared in the 
        /// method or constructor.
        /// 
        /// the sol is write
        /// roll(random,nummber);
        /// 
        /// void roll(random,number)
    }

    void roll(Random random, int number)
    {
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
}

public class GlobLocal
{
    public static void main(String args[])
    {
        Random ran;
        int number;
        Diceroll d=new Diceroll();
        d.roll(ran,number);
    }
}