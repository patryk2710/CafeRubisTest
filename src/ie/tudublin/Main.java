package ie.tudublin;

public class Main {

    public void cafe() {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Cafe());
    }

    public static void main(String[] arg) {
        Main main = new Main();
        main.cafe();
    }
}
