public class Grade {
    int points;
    int finalGrade;
    boolean passed = false;

    public Grade(int points) {
        this.points = points;
        defineGrade(points);

        if (this.points >= 50) {
            this.passed = true;
        }
    }

    public void defineGrade(int points) {
        int grade = 0;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        this.setFinalGrade(grade);
    }

    public void setFinalGrade(int grade) {
        this.finalGrade = grade;
    }

    public int getFinalGrade() {
        return this.finalGrade;
    }

    public int getPoints() {
        return points;
    }

    public boolean isPassed() {
        return passed;
    }

}
