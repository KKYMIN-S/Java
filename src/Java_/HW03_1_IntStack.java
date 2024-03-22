package Java_;

public class HW03_1_IntStack {
    private int[] int_array;
    private int max_stack_size;
    private int stack_top = -1; // initial position
    public HW03_1_IntStack(int max_stack_size) { // constructor
        this.max_stack_size = max_stack_size;
        this.int_array = new int[max_stack_size];
    }
    public int push(int entry) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push new element.");
        }
        int_array[++stack_top] = entry;
        return entry;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
        }
        int pop_array = int_array[0];
        for (int i=0;i<max_stack_size-1;i++){

            int_array[i] = int_array[i + 1];
        }
        stack_top--;
        return pop_array;
    }
    public boolean isEmpty() {
        return stack_top == -1;
    }
    public boolean isFull() {
        return stack_top == max_stack_size - 1;
    }
    public void print() {
        for (int i = 0; i <= stack_top; i++) {
            System.out.print(int_array[i] + " ");
        }
    }
}
