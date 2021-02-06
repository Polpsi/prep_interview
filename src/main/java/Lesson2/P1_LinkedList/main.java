package Lesson2.P1_LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insertFirst("First");
        linkedList.insertLast("Second");
        linkedList.insertFirst("Sova"); // Не знаю, почему сова, просто в голову пришло.

        linkedList.remove(2);
        linkedList.remove("First");
    }
}
