package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int sumPower = numberToPrint;
        for (int i = 1; i < power; i++){
            sumPower *= numberToPrint;
        }
        System.out.println(sumPower);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
