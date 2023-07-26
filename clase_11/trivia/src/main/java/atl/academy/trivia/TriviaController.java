package atl.academy.trivia;

import entities.Categoria;
import entities.Preguntas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public Preguntas getQuestion(@PathVariable String categoria){
        Preguntas pregunta = new Preguntas();
        pregunta.setCategory("Cultura");
        pregunta.setQuestion("¿Qué ingredientes se necesitan para hacer una michelada?");
        pregunta.setAnswer(0);
        pregunta.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");

        String[] options= new String[3];
        options[0]="Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante";
        options[1]="Cerveza, lima/limón y limon";
        options[2]="Cerveza, sal, tabasco y lima/limón";

        pregunta.setOptions(options);

        return pregunta;
    }
    @GetMapping("/categories")
    public List<Categoria> categories(){

        Categoria cat = new Categoria();
        cat.setCategory("Cultura");
        cat.setDescripcion("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categoria cat2 = new Categoria();
        cat2.setCategory("Deportes");
        cat2.setDescripcion("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria cat3 = new Categoria();
        cat3.setCategory("Arte");
        cat3.setDescripcion("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categoria cat4 = new Categoria();
        cat4.setCategory("Cine");
        cat4.setDescripcion("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categoria cat5 = new Categoria();
        cat5.setCategory("Historia");
        cat5.setDescripcion("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");

        Categoria cat6 = new Categoria();
        cat6.setCategory("Ciencia");
        cat6.setDescripcion("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

        List<Categoria> categorias = new ArrayList<>();
        categorias.add(cat);
        categorias.add(cat2);
        categorias.add(cat3);
        categorias.add(cat4);
        categorias.add(cat5);
        categorias.add(cat6);
        return categorias;
    }
}
