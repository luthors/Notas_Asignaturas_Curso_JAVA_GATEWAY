package com.luthorscode.microservicios.app.examenes.models.repository;


import org.springframework.data.repository.CrudRepository;

import com.luthorscode.microservicios.commons.examenes.models.entity.Asignatura;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {}
