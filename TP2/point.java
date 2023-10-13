public class point {
    int ord;
    int abs;
    static int nombre;
    int numero;

    point() {
        abs = 0;
        ord = 0;
        nombre++;
    }
    void setCoordonneePoint(int u, int v) {
        abs = u;
        ord = v;
    }
    void Translate(int u, int v) {
        abs = abs + u;
        ord = ord + v;
    }

    void affichPoint() {
        System.out.println("les cordonner de la point est " + abs + ", " + ord);
    }

    boolean origine() {
        return abs == 0 && ord == 0;
    }
    boolean Egal(point q) {
        return abs == q.abs && ord == q.ord;
    }
    void autrePointe(point p2) {
        abs = p2.abs;
        ord = p2.ord;
    }
    point symetrie(){
        point sp=new point();
        sp.abs=0-abs;
        sp.ord=0-ord;
        return sp;
    }
}