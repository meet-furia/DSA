package stacks_and_queues.queues.implementation;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.insert(5);
        circularQueue.insert(10);
        circularQueue.insert(15);
        circularQueue.insert(20);
        circularQueue.insert(25);
        circularQueue.insert(30);
        circularQueue.insert(35);
        circularQueue.insert(40);
        circularQueue.insert(45);
        circularQueue.insert(50);

        circularQueue.display();
        circularQueue.insert(55);

        circularQueue.remove();
        circularQueue.remove();

        circularQueue.display();

        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();

        circularQueue.display();


        circularQueue.insert(5);
        circularQueue.insert(10);
        circularQueue.display();
    }
}
