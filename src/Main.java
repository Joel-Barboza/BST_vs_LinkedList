import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenerateRandomList generateRandomList = new GenerateRandomList();
        ArrayList<Integer> randomList = generateRandomList.getList();

        BinarySearchTree bst = new BinarySearchTree();
        LinkedList linkedList = new LinkedList();

        for (Integer i : randomList) {
            bst.insert(i);
        }

        for (Integer i : randomList){
            linkedList.insert(i);
        }

        long startTimeLinkedList = System.nanoTime();

        linkedList.search(30);

        long elapsedTimeLinkedList = System.nanoTime() - startTimeLinkedList;
        System.out.println("Linked list time: " + elapsedTimeLinkedList);

        long startTimeBST = System.nanoTime();

        bst.search(30);

        long elapsedTimeBST = System.nanoTime() - startTimeBST;
        System.out.println("BST time: " + elapsedTimeBST);

    }
}