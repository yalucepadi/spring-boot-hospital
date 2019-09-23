package pe.edu.upn.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;


import pe.edu.upn.demo.model.entity.Paciente;

public interface PacienteService extends JpaRepository<Paciente, String> {

}
