package sn.esmt.Gestion_produit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.Gestion_produit.Entity.ProduitEntity;

import java.util.Optional;
@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {
    @Query("select e from ProduitEntity e where e.nom=?1 and e.qtStock=?2")
    public Optional<ProduitEntity> findByNomAndQuantiteStock(String nom, double qtStock);

    @Query("select e from ProduitEntity e where e.nom= :n and e.qtStock= :q")

    public Optional<ProduitEntity> findByNomAndQuantiteStockv2(@Param("n") String nom, @Param("q") double qtStock);
    public Optional<ProduitEntity> findByNom(String nom);

}
