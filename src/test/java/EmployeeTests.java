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
    public void testGetSound(){
        var employee = new Employee("Geetika");

        var expected = "Aaow";
        var actual = employee.getSound();

        assertEquals(expected, actual);
    }
    @Test
    void eatFood (){
        var employee = new Employee("Geetika");

        var expected = "Nom nom nom!";
        var actual = employee.getFood();

        assertEquals(expected, actual);
    }

}

