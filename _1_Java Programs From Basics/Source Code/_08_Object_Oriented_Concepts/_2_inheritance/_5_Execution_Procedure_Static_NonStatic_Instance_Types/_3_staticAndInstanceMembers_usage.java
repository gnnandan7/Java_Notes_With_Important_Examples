package _08_Object_Oriented_Concepts._2_inheritance._5_Execution_Procedure_Static_NonStatic_Instance_Types;
class parentC
{
    String iV_P = "Instance Variable Of Patent Class";
    static String sV_P = "Static Variable Of Parent Class";
    {
        System.out.println(iV_P);
        System.out.println("Instance Block Of Parent Class");
        instanceFunc_P();
    }
    static
    {
        System.out.println(sV_P);
        System.out.println("Static Block Of Parent Class");
        staticFunc_P();
    }
    parentC()
    {
        System.out.println("Instance Method Of Parent Class _05_Constructor");
    }
    void instanceFunc_P()
    {
        System.out.println("Parent Class Instance Function");
    }
    static void staticFunc_P()
    {
        System.out.println("Parent Class Static Function");
    }
}

class childC extends parentC
{
    String iV_C = "Instance Variable Of Child Class";
    static String sV_C = "Static Variable Of Child Class";
    {
        System.out.println(iV_C);
        System.out.println("Instance Block Of Child Class");
        instanceFunc_C();
    }
    static
    {
        System.out.println(sV_C);
        System.out.println("Static Block Of Child Class");
        staticFunc_C();
    }

    childC()
    {
        System.out.println("Instance Method Of Child Class _05_Constructor");
    }

    void instanceFunc_C()
    {
        System.out.println("Child Class Instance Function");
    }
    static void staticFunc_C()
    {
        System.out.println("Child Class Static Function");
    }
}
public class _3_staticAndInstanceMembers_usage
{
    public static void main(String[] args)
    {
        childC cc = new childC();
    }
}
