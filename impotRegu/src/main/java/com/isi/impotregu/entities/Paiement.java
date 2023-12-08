package com.isi.impotregu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datePaiement;
    private Double montantPaiement;
    @ManyToOne
    @JoinColumn(name="declaration_id")
    private Declaration declaration;
}
