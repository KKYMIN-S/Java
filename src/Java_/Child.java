package Java_;

class Child extends Parent {
    // This method overrides show() of Parent
    @Override void show()
    {
        System.out.println("Child's show()");
    }
}