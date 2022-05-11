package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.service.IMatriculaService;

import java.util.List;

public interface MatriculaRepository {
    Matricula save(Matricula matricula);

    IMatriculaService findById(Long id);

    List<Matricula> findAll();
}
