package cv1;

public class Bod
{
    private double x;
    private double y;
    public Bod (double x, double y)
    {
       this.x=x;
       this.y=y; /**this prřistupuju k y této třídy**/
    }
    public double getVzd()/**Vzdálenost bodu od počátku**/
    {
        return Math.hypot(x, y);
    }
    public double getVzd(Bod b)/**Vzdálenost bodu od jiného bodu**/
    {
        return Math.hypot(x-b.x,y-b.y);
    }
    public String getStr()
    {
        return String.format("%.2f, %.2f",x,y);
    }
}
