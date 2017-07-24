package com.jeep.lolesports.service;

import com.jeep.lolesports.model.Integrante;

import java.util.List;

public interface IntegranteService {
    List<Integrante> findAll();
    Integrante findById(Long id);
    void save(Integrante category);
    void delete(Integrante category);
}
