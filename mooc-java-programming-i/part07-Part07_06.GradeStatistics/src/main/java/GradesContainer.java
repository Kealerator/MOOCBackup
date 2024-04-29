import java.util.ArrayList;

public class GradesContainer {
    ArrayList<Grade> gradeList;
    ArrayList<Grade> passedList;

    public GradesContainer() {
        this.gradeList = new ArrayList<>();
        this.passedList = new ArrayList<>();
    }

    public void addToContainer(Grade addable) {
        this.gradeList.add(addable);
    }

    public String generateStars(int wanted) {
        int starAmount = 0;
        String string = "";

        for (Grade gradeObj : gradeList) {
            if (gradeObj.getFinalGrade() == wanted) {
                starAmount++;
            }
        }

        for (int i = 0; i < starAmount; i++) {
            string += "*";
        }

        return string;
    }

    public Double pointAverage() {
        int sum = 0;

        for (Grade gradeProcessed : this.gradeList) {
            sum += gradeProcessed.getPoints();
        }

        return Double.valueOf(sum) / Double.valueOf(gradeList.size());

    }

    public String pointAveragePassing() {
        int sum = 0;
        String passingAvg = "-";

        for (Grade gradeProcessed : this.gradeList) {
            if (gradeProcessed.isPassed()) {
                sum += gradeProcessed.getPoints();
                this.passedList.add(gradeProcessed);
            }
        }

        if (this.passedList.size() > 0) {

            passingAvg = String.valueOf(Double.valueOf(sum / this.passedList.size()));
        }

        return passingAvg;

    }

    public Double calculatePassPercentage() {
        return 100 * Double.valueOf(this.passedList.size()) / Double.valueOf(this.gradeList.size());

    }

    public void createGradeDistributionList() {
        ArrayList<String> gradeDistributionList = new ArrayList<>();

        for (int i = 5; i > -1; i--) {
            String stars = generateStars(i);
            gradeDistributionList.add(i + ":" + stars);
        }

        for (String gradesList : gradeDistributionList) {
            System.out.println(gradesList);
        }
    }

}
