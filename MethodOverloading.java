class Demo{
    void fun(){
        System.out.println("I have no parameters");
    }
    void fun(int a){
        System.out.println("I have 1 parameter a: "+ a);
    }
    void fun(String s){
        System.out.println("I have a String s: "+ s);
    }
    void fun(int a, int b){
        System.out.println("I have 2 parameter a & b: "+a+", "+b);
    }
}
public class MethodOverloading {
   public static void main(String[] args) {
    Demo obj = new Demo();
    obj.fun();
    obj.fun(5);
    obj.fun("Hii there");
    obj.fun(10,20);
    //Best example for overloading is println or print
    System.out.println(5);
    System.out.println("abc");
    System.out.println(5.06);

   }

}
