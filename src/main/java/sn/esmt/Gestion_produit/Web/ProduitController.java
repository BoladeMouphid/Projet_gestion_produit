package sn.esmt.Gestion_produit.Web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.Gestion_produit.Entity.ProduitEntity;
import sn.esmt.Gestion_produit.Repository.ProduitRepository;
import sn.esmt.Gestion_produit.Service.ProduitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
    private ProduitService produitService;
    public ProduitEntity save(ProduitEntity produitEntity) { return produitService.save(produitEntity);}
    @GetMapping
    public List<ProduitEntity> all() { return produitService.getAll().get();}

    @PutMapping
    public ProduitEntity update(String nom, ProduitEntity produitEntity){
        return produitService.update(nom, produitEntity);
    }

    @DeleteMapping
    public void delete(String nom){
        produitService.get(nom);
    }
    @GetMapping("/nom")
    public Optional<ProduitEntity> get(String nom){
        return produitService.get(nom);
    }


}
