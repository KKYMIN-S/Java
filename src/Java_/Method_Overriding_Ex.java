package Java_;

public class Method_Overriding_Ex {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new Child();
        obj2.show();
    }
}
