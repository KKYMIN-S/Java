package Java_;

import java.util.Scanner;
public class HW03_1_IntStack_App {
    public static void main(String[] args) {
        final int stack_size = 20;
        int int_data;
        HW03_1_IntStack int_stack = new HW03_1_IntStack(stack_size);
        System.out.printf("Testing push() operation of integer stack (stack_size = %d) ....\n", stack_size);
        for (int i=0; i<stack_size; i++) {
            int_data = (int) (Math.random() * stack_size);
            int_stack.push(int_data);
            System.out.printf("After push (%3d) : ", int_data);
            int_stack.print(); System.out.printf("\n");
        }
        System.out.printf("\nTesting pop() operation of integer stack (stack_size = %d) ....\n", stack_size);
        for (int i=0; i<stack_size; i++) {
            int_data = int_stack.pop();
            System.out.printf("After pop (%3d) : ", int_data);
            int_stack.print(); System.out.printf("\n");
        }
    }
}
