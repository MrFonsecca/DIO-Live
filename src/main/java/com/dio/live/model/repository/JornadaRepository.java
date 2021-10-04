package com.dio.live.model.repository;

import com.dio.live.model.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
    static JornadaTrabalho deleteById(JornadaTrabalho jornadaTrabalho) {
        return null;
    }
}
