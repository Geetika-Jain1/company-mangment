import org.example.Employee;

public class EmployeeTests {

    @Test
    public void testConstructorSetName(){
        var employee = new Employee("Geetika");

        var expected = "Geetika";
        var actual = employee.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testGEtSound(){
        var employee = new Employee();

        var expected "Aaow";
        var actual = employee.getSound();

        assertEquals(expected, actual);
    }


}

