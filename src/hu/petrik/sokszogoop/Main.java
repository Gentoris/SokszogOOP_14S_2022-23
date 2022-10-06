package hu.petrik.sokszogoop;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            double a = Math.random() * 5 + 10;
            double b = Math.random() * 5 + 10;
            Teglalap t = new Teglalap(a, b);
            System.out.println();
        }

        Haromszog h1 = new Haromszog(3,4,5);
        System.out.println(h1);
        for (int i = 0; i < 100; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
    }
}
