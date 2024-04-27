
public class MainProgram {

    public static void main(String[] args) {

    }

    public static int partsCompleted() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("New exercise 1");
        management.add("New exercise 2");
        management.add("New exercise 3");
        management.add("New exercise 4");

        management.markAsCompleted("New exercise 2");
        management.markAsCompleted("New exercise 4");

        return management.countCompletedExercises();
    }
}
