package _09_Collections_In_Java._1_List_Type._4_Stack;

import java.util.Stack;

public class _1_stack_Example
{
    public static void main(String[] args)
    {
        //creating a stack
        Stack<String> languages = new Stack<String>();

        //adding elements to stack
        languages.push("Java");
        languages.push("Python");
        languages.push("C");
        languages.push("C++");
        languages.push("SQL");

        //displaying the stack elements
        System.out.println("Stack elements: "+languages);

    }
}
