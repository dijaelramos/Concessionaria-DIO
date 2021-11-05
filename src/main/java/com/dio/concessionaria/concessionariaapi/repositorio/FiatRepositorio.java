package com.dio.concessionaria.concessionariaapi.repositorio;

import com.dio.concessionaria.concessionariaapi.fiat.Fiat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FiatRepositorio extends JpaRepository <Fiat, Long> {
}
