package pe.edu.upn.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;


import pe.edu.upn.demo.model.entity.Medico;

public interface MedicoService extends JpaRepository<Medico, Integer>{

}
