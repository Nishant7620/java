
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionFramework {

    public static void main(String[] args) {
        // List
        ArrayList<Integer> list = new ArrayList<Integer>();    //we have created object of ArrayList which implements properties of List interface
        // by adding <Integer> generic our list is specify

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2, 25);
        //list.add("Nishant");
        System.out.println(list);

        // ArrayList               
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);

        System.out.println(arraylist);

        // LinkedList
        List<Integer> linkedlist = new LinkedList<Integer>();

        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(1, 30);
        linkedlist.remove(2);
        System.out.println(linkedlist);

        //Vector
        Vector<Integer> vector = new Vector<Integer>();

        vector.add(10);
        vector.add(20);
        vector.add(1, 25);

        System.out.println(vector);

        //Stack
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        // Set = ?
        //HashSet
        Set<Integer> hashset = new HashSet<Integer>();

        hashset.add(10);
        hashset.add(20);
        hashset.add(15);
        hashset.add(25);
        hashset.add(10);
        hashset.add(2);

        System.out.println(hashset);

        //LinkedHashset
        LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<Integer>();
        linkedHashset.add(5);
        linkedHashset.add(2);
        linkedHashset.add(4);
        linkedHashset.add(5);
        System.out.println(linkedHashset);
        boolean check = linkedHashset.contains(2);
        System.out.println("2 is present or not = " + check);
        //TreeSet
        TreeSet<Integer> treeset = new TreeSet<Integer>();

        treeset.add(10);
        treeset.add(2);
        treeset.add(5);
        treeset.add(8);
        treeset.add(8);
        System.out.println("Treeset = " + treeset);

        //Queue
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(25);
        queue.offer(15);

        System.out.println("Queue = " + queue);
        System.out.println(queue.poll());
        System.out.println("Queue = " + queue);  // it will remove starting element or first element from queue (FIFO)
        // also return that value
        System.out.println(queue.peek());       // return top element which is starting element in queue oppo to stack                                            

        // PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.offer(12);
        pq.offer(3);
        pq.add(4);
        pq.offer(2);
        System.out.println("priority queue = " + pq);
        System.out.println("priority queue minumum = " + pq.peek());  // here is min heap value

        // PriorityQueue for max heap
        PriorityQueue<Integer> rpq = new PriorityQueue<Integer>(Comparator.reverseOrder());

        rpq.offer(12);
        rpq.offer(3);
        rpq.add(4);
        rpq.offer(2);
        System.out.println("priority queue max heap = " + rpq);
        System.out.println("priority queue minumum = " + rpq.peek());  // here gives max heap value

        //Deque
        //ArrayDeque
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.offer(10);
        deque.offer(20);
        deque.pollLast();
        deque.offerLast(40);
        deque.offerFirst(30);
        System.out.println(deque);
    }

}
