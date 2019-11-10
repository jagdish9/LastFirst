class A{

    public void m(){
        System.out.println("A");
    }

    public void n(){
        System.out.println("n of A");
    }
}

class B extends A{

    public void m(){
        System.out.println("B");
    }

    public void o(){
        System.out.println("o of B");
    }
}

public class MainFunction {

    public static void main(String[] args){
        A a = new B();
        a.m();

        B b = new B();
        b.m();

        a.n();

        ((B)a).o();

        A a1 = new A();
        //a1.o(); // not possible
    }
}
