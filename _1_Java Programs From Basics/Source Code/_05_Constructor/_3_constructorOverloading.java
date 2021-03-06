package _05_Constructor;

class constructorOverloading
{
    private String a;
    constructorOverloading()
    {
        System.out.println("This is default constructor");
        System.out.println();
    }

    constructorOverloading(String a)
    {

        System.out.println(a);
        System.out.println();
    }

    constructorOverloading(String aa,int bb)
    {
        System.out.println("aa: "+aa);
        System.out.println("bb: "+bb);
        System.out.println();
    }

    constructorOverloading(int bbb,String aaa)
    {
        System.out.println("aaa: "+aaa);
        System.out.println("bbb: "+bbb);
        System.out.println();
    }
}


public class _3_constructorOverloading
{
    public static void main(String[] args)
    {
        System.out.println("_05_Constructor Overloading\n");

        /**
         * @Note
         * Constructors can be overloaded in 3 ways
         * 1. OVERLOADING: number of parameter
         * 2. OVERLOADING: type of parameter
         * 3. OVERLOADING: order of parameter
         */

        //to read the default constructor
        new constructorOverloading();
        //for parameterized constructor with order string type
        new constructorOverloading("OVERLOADING: number of parameter");

        //for parameterized constructor with order string type then int type
        new constructorOverloading("OVERLOADING: type of parameter",10);

        //for parameterized constructor with order int type then string type
        new constructorOverloading(100,"OVERLOADING: order of parameter");
    }
}
