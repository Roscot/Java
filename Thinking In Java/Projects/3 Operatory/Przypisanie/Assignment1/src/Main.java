class Plane {
    int level;
}

class Boat {
    float speed;
}

class Letter {
    char c;
}

public class Main {

    static void modify(Letter y) {
        y.c = 'x';
    }

    public static void main(String[] args) {
        //Aliasing int
	    Plane p1 = new Plane();
	    Plane p2 = new Plane();
	    p1.level=1;
	    p2.level=20;
        System.out.println("p1.level=" + p1.level + ", p2.level=" + p2.level);
        p1=p2;
        System.out.println("p1.level=" + p1.level + ", p2.level=" + p2.level);
        p1.level=30;
        System.out.println("p1.level=" + p1.level + ", p2.level=" + p2.level);

        //Aliasing float
        Boat b1 = new Boat();
        Boat b2 = new Boat();
        b1.speed=10f;
        b2.speed=50f;
        System.out.println("b1.speed=" + b1.speed + ", b2.speed=" + b2.speed);
        b1=b2;
        System.out.println("b1.speed=" + b1.speed + ", b2.speed=" + b2.speed);
        b1.speed=80f;
        System.out.println("b1.speed=" + b1.speed + ", b2.speed=" + b2.speed);

        //Aliasing przy przekazywaniu obiektu jako argumentu metody
        Letter a = new Letter();
        a.c = 'a';
        System.out.println("a.c=" + a.c);
        modify(a);
        System.out.println("a.c=" + a.c);
    }
}
