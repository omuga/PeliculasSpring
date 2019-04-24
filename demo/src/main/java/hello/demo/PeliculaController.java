package hello.demo;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hello.demo.PeliculaRepository;


@RestController
public class PeliculaController {
    @Autowired
    private PeliculaRepository pelicularepository;
    @GetMapping(path = "/add/{title}")
    public Pelicula addNewPelicula( @PathVariable("title")String title){
        Pelicula p = new Pelicula();
        p.setTitle(title);
        pelicularepository.save(p);
        return p;

    }


    @GetMapping("/hello")
    public  String getaMovie(){
        return "H";
    }

    @RequestMapping("/peliculas/{id}")
    public Optional<Pelicula> getMovie(@PathVariable("id") Integer id){
        Optional<Pelicula> p = pelicularepository.findById(id);
        return p;
    }

    
    
}
