import org.example.Developer;


public class DeveloperTests {

    @Test
    public void testGetSound(){
        var developer = new Developer("Geetika", "java");

        var expected ="Woop woop";
        var actual = developer.getSound();

        assertEquals(expected, actual)
    }
    @Test
    public void testGetProgrammingLanguage(){
        var developer = new Developer("Geetika", "java");

        var expected ="java";
        var acual = developer.getProgrammingLanguage();

        assertEquals(expected, actual);

    }

}
