package diall.ci.saanalysys;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "sa", produces = MediaType.APPLICATION_JSON_VALUE)
public class SentimentController {

    @GetMapping
    public List<Object> search(){
        return List.of(new Sentiment(1, "Belle formation", 1));
    }
}
