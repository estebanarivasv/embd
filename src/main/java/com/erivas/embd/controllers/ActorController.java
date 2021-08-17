package com.erivas.embd.controllers;

import com.erivas.embd.data.models.ActorModel;
import com.erivas.embd.repositories.ActorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   //@RestController indicates that the data returned by each method will be written straight into the response body instead of rendering a template.
class ActorController {

    /*
    // TODO: Refactor to services
    private final ActorRepository repository;
    ActorController(ActorRepository repository) {
        this.repository = repository;
    }

    // GET ALL
    @GetMapping("/actors")
    List<ActorModel> all() {
        return repository.findAll();
    }

    // POST
    @PostMapping("/actors")
    ActorModel newActor(@RequestBody ActorModel newActor) {
        return repository.save(newActor);
    }

    // GET Single item
    // @GetMapping("/actors/{id}")
    // ActorModel one(@PathVariable Long id) {
        //return repository.findById(id)
        //        .orElseThrow(() -> new ElementNotFoundException(id))
        ;
    // }

    // PUT
    @PutMapping("/actors/{id}")
    ActorModel replaceActor(@RequestBody ActorModel newActor, @PathVariable Long
            id) {
        return repository.findById(id)
                .map(actor -> {
                    actor.setName(newActor.getName());
                    // actor.setMovies(newActor.getMovies());
                    return repository.save(actor);
                })
                .orElseGet(() -> {
                    newActor.setId(id);
                    return repository.save(newActor);
                });
    }

    // DELETE
    @DeleteMapping("/actors/{id}")
    void deleteActor(@PathVariable Long id) {
        repository.deleteById(id);
    }
     */
}
