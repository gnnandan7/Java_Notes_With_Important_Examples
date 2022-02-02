package _06_CollectionsInJava._2_Queue_Interface._01_Queue_Interface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Methods
- add() -  Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception
- offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false
- element() - Returns the head of the queue. 'Throws an exception if the queue is empty'.
- peek() - Returns the head of the queue. 'Returns null if the queue is empty'.
- remove() - Returns and removes the head of the queue. 'Throws an exception if the queue is empty'.
- poll() - Returns and removes the head of the queue. 'Returns null if the queue is empty'.
 */

public class _02_implementing_PriorityQueue_Using_Queue
{
    public static void main(String[] args)
    {
        // Creating Queue using the LinkedList class
        Queue<String> languages = new PriorityQueue<>();

        //offer elements to queue
        languages.offer("Java");
        languages.offer("Python");
        languages.offer("C++");
        languages.offer("C");

        System.out.println("After adding elements into the queue: "+languages);

        //accessing the elements
        String accessHeadElement = languages.peek();
        System.out.println("The element at the top: "+accessHeadElement);

        //removing the element
        String removeHeadElement = languages.poll();
        System.out.println("The removed element is: "+removeHeadElement);

        System.out.println("The updated queue is "+languages);
    }
}
