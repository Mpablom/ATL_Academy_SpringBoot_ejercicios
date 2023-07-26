package atl.academy.trivia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {
    @GetMapping("/categories")
    public String categories(){
        return "[\n" +
                "  {\n" +
                "    \"category\": \"Cultura\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";
    }
}
