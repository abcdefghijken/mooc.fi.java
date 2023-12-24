import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class ExerciseManagementTest {
    private ExerciseManagement mgmt;

    @Before
    public void initialize() {
        mgmt = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, mgmt.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        mgmt.add("one");
        assertEquals(1, mgmt.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        mgmt.add("exercise");
        assertTrue(mgmt.exerciseList().contains("exercise"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        mgmt.add("new exercise");
        mgmt.markAsCompleted("new exercise");
        assertTrue(mgmt.isCompleted("new exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        mgmt.add("new exercise");
        mgmt.markAsCompleted("new exercise");
        assertFalse(mgmt.isCompleted("some exercise"));
    }
}
