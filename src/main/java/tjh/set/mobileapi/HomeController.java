package tjh.set.mobileapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("support.html")
public class HomeController {

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> getSupportPage() {
        return ResponseEntity.ok("<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "body {\n" +
                " background-color: gray;\n" +
                "}\n" +
                "h1 {\n" +
                " text-align: right;\n" +
                " background-color: white;\n" +
                " color: purple;\n" +
                "}\n" +
                "p {\n" +
                " font-family: comic;\n" +
                " color: blue;\n" +
                " font-size: 20px;\n" +
                "}\n" +
                "ul {\n" +
                "color:white;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Tommy Howell</h1>\n" +
                "<h2>ttoocool@gmail.com</h2>\n" +
                "<p>Please email me with any suggestions or concerns</p>\n" +
                "</body>\n" +
                "</html>");
    }

}
