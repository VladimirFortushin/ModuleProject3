package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import org.example.dialogue.DialogueOrderManager;
import org.example.dialogue.Lines;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "/start")
public class MyServlet extends HttpServlet {
    private final DialogueOrderManager manager = new DialogueOrderManager();
    private int iterationsCounter = 0;
    private String protagonistLine;
    @SneakyThrows
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>My Dialog</title>");
        out.println("</head>");
        out.println("<body>");
        String masterLine = null;
        out.println("<br>");


        if(iterationsCounter > 0){
            masterLine =  manager.defineMasterLine(protagonistLine);
            out.println("<strong>" + masterLine + "</strong>");
        }else{
            masterLine = manager.getLines().getMasterLinesByLevel(1).get(0);
            out.println("<strong>" + masterLine + "</strong>");
        }
        if(masterLine.equals(manager.getLines().getMasterLinesByLevel(14).get(1))){
            out.println("<br>");
            out.println("<br>");
            out.println("<strong>Вы убедили Создателя в нежизнеспособности его планов. Поздравляем!</strong>");
        }

        if(manager.getNewLevelNum(masterLine) == 0){

            out.println("<br>");
            out.println("<br>");
            out.println("<strong>Вы умерли</strong>");
            out.println("<br>");
            out.println("<p>Ваши кости разносит ветром пустоши. Ваше Убежище теперь наверняка погибнет, впрочем как и вы сами.</p>");

        }
        out.println("<br>");

        out.println("<form method=\"post\">");
        List<String> protagonistLines = manager.getLines().getProtagonistLinesByLevel(manager.getNewLevelNum(masterLine));
        for (String line : protagonistLines) {
            out.println("<input type=\"radio\" name=\"protagonistLine\" value=\"" + line + "\"/>" + line);
            out.println("<br>");
        }
        out.println("<br>");
        out.println("<input type=\"submit\" value=\"Ответить\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.protagonistLine = req.getParameter("protagonistLine");
        iterationsCounter++;
        resp.sendRedirect(req.getContextPath() + "/start");

    }




}
