package sn.esmt.Gestion_produit.Service;

import sn.esmt.Gestion_produit.Entity.ProduitEntity;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IProduitService {
    public ProduitEntity save(ProduitEntity produitEntity);
    public ProduitEntity update(String nom, ProduitEntity produitEntity);
    public Optional<ProduitEntity> get(String nom);
    public Optional<List<ProduitEntity>> getAll();
    public void delete(String nom);
}
