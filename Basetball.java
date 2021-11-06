
package assingnment3_q1;

public class Basetball extends Ball implements Tossable
{
     public Basetball(String brandname)
    {
        super(brandname);
    }
    public void bounce()
    {
        System.out.println(" (Bounce)With Empty......!!!!!");
    }
      public void toss()
    {
        System.out.println(" (Toss)With Empty......!!!!!");

    }
}
