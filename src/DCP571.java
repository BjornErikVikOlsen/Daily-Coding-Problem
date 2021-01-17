public class DCP571 {

    public static void main(String[] args) {
        DCP571 dcp571 = new DCP571();
        dcp571.hanoi(4, "A", "B", "C");

    }


    public void move(String f, String t){
        System.out.format("Move disc from %s to %s %n", f,t);
    }

    public void moveVia(String f, String v, String t){
        move(f, v);
        move(v, t);
    }

    public void hanoi(int n, String f, String h, String t){
        if(n == 0){

        } else {
            hanoi(n-1, f, t, h);
            move(f, t);
            hanoi(n-1, h, f, t);
        }
    }
}
