import static org.junit.Assert.*
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 

class MultiplicationTest {
    Multiplication pgm = new Multiplication(); 

    @Test 
    void testMultiply() { 
        int ans = pgm.multiplyNumbers(2, 3); 
        assertEquals(6, ans); 
    } 
}
