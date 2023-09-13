package stacks_and_queues.queues.implementation;

public class CustomQueueMain {
    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();
        customQueue.insert(5);
        customQueue.insert(10);
        customQueue.insert(15);
        customQueue.insert(20);
        customQueue.insert(25);
        customQueue.insert(30);
        customQueue.insert(35);
        customQueue.insert(40);
        customQueue.insert(45);
        customQueue.insert(50);

        customQueue.display();
        customQueue.insert(55);

        customQueue.remove();
        customQueue.remove();

        customQueue.display();

        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();

        customQueue.display();
    }
}
