package project2;
/* 12. We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'.
The constructor of student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
*/
abstract class Marks {
    abstract double getPercentage();
}

class StudentA extends Marks {
    private double s1, s2, s3;

    public StudentA(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double getPercentage() {
        return (s1 + s2 + s3) / 3.0;
    }
}

class StudentB extends Marks {
    private double s1, s2, s3, s4;

    public StudentB(double s1, double s2, double s3, double s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    double getPercentage() {
        return (s1 + s2 + s3 + s4) / 4.0;
    }
}

