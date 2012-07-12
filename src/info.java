/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/12/12
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 */

public class info {
    public
    String name;
    int amount;
    //String author;
    //String publication;
    int getcount()
    {
        amount--;
        return amount;

    }
    public  info(String x, int y)
    {
        name=x;
        amount=y;

    }

}
