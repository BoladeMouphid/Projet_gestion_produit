package sn.esmt.Gestion_produit.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sn.esmt.Gestion_produit.Entity.ProduitEntity;
import sn.esmt.Gestion_produit.Repository.ProduitRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProduitService implements IProduitService {
    private ProduitRepository produitRepository;

    public ProduitEntity save(ProduitEntity produitEntity){
        return produitRepository.save(produitEntity);
    }

    public ProduitEntity update(String nom, ProduitEntity produitEntity){
        Optional<ProduitEntity> produitEntity1 = this.get(nom);
        if(produitEntity1.isPresent()){
            produitEntity1.get().setNom(produitEntity.getNom());
            produitEntity1.get().setRef(produitEntity.getRef());
            produitEntity1.get().setQtStock(produitEntity.getQtStock());
            return produitRepository.save(produitEntity1.get());

        }

        return produitEntity;
    }

    public Optional<List<ProduitEntity>> getAll(){
        return Optional.empty();
    }

    public Optional<ProduitEntity> get(String nom){
        return produitRepository.findById(nom);
    }
    public void delete(String nom){
        Optional<ProduitEntity> produitEntity1 = this.get(nom);
        if(produitEntity1.isPresent()) {
            //todo
            produitRepository.delete(this.get(nom).get());
        }


    }

}
