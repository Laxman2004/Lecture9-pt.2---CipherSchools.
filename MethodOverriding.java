class Parent{
    void fun(){
        System.out.println("Hii I'm A");
    }
}
class Child extends Parent{
    void fun(){
        System.out.println("Hii I'm B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
    }
}
