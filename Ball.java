
package assingnment3_q1;

public abstract class Ball
{
    private String brandName;
    public Ball(String brandName)
    {
        this.brandName=brandName;
    }

    public String getBrandName() 
    {
        return brandName;
    }
    public abstract void bounce();
    
}
