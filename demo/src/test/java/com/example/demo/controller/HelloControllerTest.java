import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    @Test
    public void testSayHello() {
        HelloController controller = new HelloController();
        String response = controller.sayHello().getBody();
        assertEquals("¡Hola, arauca que calor!", response);
    }
}
