class Factor {
    boolean isFactor(int a, int b) {
        if((b%a) == 0) return true;
        else return false;
    }
}

public class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if(x.isFactor(6, 20)) System.out.println("6 is factor");
            else System.out.println("6 is not factor");
        if(x.isFactor(3, 20)) System.out.println("3 is factor");
            else System.out.println("3 is not factor");

    }

}
