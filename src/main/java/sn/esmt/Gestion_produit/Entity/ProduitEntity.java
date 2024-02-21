package sn.esmt.Gestion_produit.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Table(name = "produit")
@NoArgsConstructor
@Getter
@Setter

public class ProduitEntity {
    @Id
    @Column(name = "nom", length = 150, nullable = false)
    private String nom;
    @Column(name = "reference", length = 200, nullable = false)
    private String ref;
    @Column(name = "quantiteStock")
    private double qtStock;

}
