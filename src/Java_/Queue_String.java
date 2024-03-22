package Java_;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_String {
    public static void main(String[] args) {
        Queue<String> queue_str = new LinkedList<>();
        char ch = 'A';
        String str;
        for (int i = 0; i < 5; i++) {
            str = "" + ch;
            queue_str.offer(str); // enqueue instead of push
            System.out.println("after enqueue(" + ch + "), queue_str : " + queue_str);
            ch += 1;
        }
        while (!queue_str.isEmpty()) {
            str = queue_str.poll(); // dequeue instead of pop
            System.out.println("after dequeue(" + str + "), queue_str : " + queue_str);
        }
    }
}
