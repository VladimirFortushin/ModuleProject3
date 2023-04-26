import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.MyServlet;
import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServletTest {

   private MyServlet myServlet = new MyServlet();
    @Test
    void givenHttpServletRequest_whenUsingMockHttpServletRequest_thenReturnsParameterValue() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter("protagonistLine")).thenReturn("Мне вас не одолеть. Я присоединяюсь к вам.");

        myServlet.doGet(request, response);


    }

}
