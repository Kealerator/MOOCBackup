import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Write test");
        assertTrue(management.exerciseList().contains("Write test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }

    @Test
    public void checkHowManyExercisesAreCompleted1() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertEquals(1, management.countCompletedExercises());
    }

    public void checkHowManyExercisesAreCompleted2() {
        management.add("New exercise 1");
        management.add("New exercise 2");
        management.add("New exercise 3");
        management.add("New exercise 4");

        management.markAsCompleted("New exercise 2");
        management.markAsCompleted("New exercise 4");
        assertEquals(2, management.countCompletedExercises());
    }
}
