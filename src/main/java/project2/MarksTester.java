package project2;

public class MarksTester {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(82, 90, 92);
        StudentB studentB = new StudentB(78, 84, 88, 92);

        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}

