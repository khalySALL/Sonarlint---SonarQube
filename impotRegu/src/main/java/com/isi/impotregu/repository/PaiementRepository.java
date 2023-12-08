package com.isi.impotregu.repository;


import com.isi.impotregu.entities.Paiement;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PaiementRepository extends JpaRepository<Paiement, Long> {

}
