package tn.agena3000.sfcs.kademproject.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.sfcs.kademproject.entities.Contrat;
import tn.agena3000.sfcs.kademproject.services.IContratServices;

import java.util.List;

@RestController
@RequestMapping("contrat")
@RequiredArgsConstructor
public class ContratController {
    private final IContratServices iContratServices;

    @GetMapping()
    public List<Contrat> getAllContrat(){
        return iContratServices.getAllContrat();
    }
    @GetMapping("/{id}")
    public Contrat getByIdContrat(@PathVariable int id){
        return iContratServices.getByIdContrat(id);
    }
    @DeleteMapping("/{id}")
    private void deleteContrat(@PathVariable int id){
        iContratServices.deleteContrat(id);
    }
    @PostMapping()
    public void ajouterContrat(@RequestBody Contrat contrat){
        iContratServices.ajouterContrat(contrat);
    }
    @PutMapping()
    private Contrat updateContrat(@RequestBody Contrat contrat){
        iContratServices.updateContrat(contrat);
        return contrat;
    }

}
