package Stack_Queue;

import java.util.Scanner;

/*
Problem Statement: Implement a First-In-First-Out (FIFO) queue using an array.
The implemented queue should support the following operations: push, dequeue, pop, and isEmpty.
*/
public class Queue {
    static int[] queue=new int[100];
    static int front=-1;
    static int rear=-1;

    static void enqueue(int x){
        if(rear==queue.length-1){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]=x;
    }
    static int dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        int x=queue[front];
        front++;
        if(front>rear){
            front=-1;
            rear=-1;
        }
        return x;
    }
    static int peek(){
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    static boolean isEmpty(){
        return front==-1;
    }
    static void display(){
         if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front; i<=rear;i++){
            System.out.println(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n---- Queue Menu ----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. isEmpty");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();
                    enqueue(x);
                    break;

                case 2:
                    System.out.println("Deleted: " + dequeue());
                    break;

                case 3:
                    System.out.println("Front Element: " + peek());
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println(isEmpty());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 6);

        sc.close();
    }
}