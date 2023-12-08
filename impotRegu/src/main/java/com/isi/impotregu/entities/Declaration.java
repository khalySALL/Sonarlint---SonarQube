package com.isi.impotregu.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Declaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Date dateDeclaration;
    private Double montantDeclaration;
    @ManyToOne
    @JoinColumn(name ="declarant_id")
    private Declarant declarant;

}
