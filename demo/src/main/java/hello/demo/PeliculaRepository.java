package hello.demo;


import org.springframework.data.repository.CrudRepository;

import hello.demo.Pelicula;

public interface PeliculaRepository extends CrudRepository<Pelicula,Integer> {

}