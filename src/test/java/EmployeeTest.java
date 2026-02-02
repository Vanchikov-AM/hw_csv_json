import org.example.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    void testToString() {
        //given
        String expected = "Employee{id=1, firstName='Иван', lastName='Иванов', country=RU, age=23}";
        //when
        String result = new Employee(1, "Иван", "Иванов", "RU", 23).toString();
        //then
        Assertions.assertEquals(expected, result);
    }
}
