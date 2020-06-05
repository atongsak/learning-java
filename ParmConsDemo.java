// A parameterized constructor.

class MyClassP {
    int x;

    MyClassP(int i) {
        x = i;
    }
}

public class ParmConsDemo {
    public static void main(String[] args) {
        MyClassP t1 = new MyClassP(10);
        MyClassP t2 = new MyClassP(88);

        System.out.println(t1.x + " " + t2.x);
    }

}
