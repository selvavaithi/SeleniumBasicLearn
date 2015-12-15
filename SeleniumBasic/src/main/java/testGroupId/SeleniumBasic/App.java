package testGroupId.SeleniumBasic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Testing World!!" );
        MyAppTest myapptest = new MyAppTest();
       String myappteststring = myapptest.CheckTesting();
       
       System.out.println("Testing: "+myappteststring);
    }
}
