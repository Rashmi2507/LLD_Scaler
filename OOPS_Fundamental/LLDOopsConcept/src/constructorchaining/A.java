package constructorchaining;

public class A {

    A() {
        System.out.println("Inside A's constructor");
    }

    A(String name) {
        System.out.println("Inside A's constructor" + name);
    }
}
