package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++){

            for (int j = 1; j < cathetusLength * 2; j++){
                if(j >= cathetusLength - i + 1 && j <= cathetusLength + i - 1){
                    System.out.print((cathetusLength - j + 1) > 0 ? (cathetusLength - j + 1) : (cathetusLength - j + 1) * -1 + 2);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
