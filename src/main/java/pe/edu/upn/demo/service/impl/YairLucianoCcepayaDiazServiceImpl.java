package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.YairLucianoCcepayaDiaz;
import pe.edu.upn.demo.model.repository.YairLucianoCcepayaDiazRepository;
import pe.edu.upn.demo.service.YairLucianoCcepayaDiazService;
@Service
public class YairLucianoCcepayaDiazServiceImpl implements YairLucianoCcepayaDiazService{
	@Autowired
	private YairLucianoCcepayaDiazRepository yairLucianoCcepayaDiazRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<YairLucianoCcepayaDiaz> findAll() throws Exception {
		
		return yairLucianoCcepayaDiazRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<YairLucianoCcepayaDiaz> findById(Integer id) throws Exception {
		
		return yairLucianoCcepayaDiazRepository.findById(id);
	}
	@Transactional
	@Override
	public YairLucianoCcepayaDiaz save(YairLucianoCcepayaDiaz entity) throws Exception {
	
		return yairLucianoCcepayaDiazRepository.save(entity);
	}
	@Transactional
	@Override
	public YairLucianoCcepayaDiaz update(YairLucianoCcepayaDiaz entity) throws Exception {
		
		return yairLucianoCcepayaDiazRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		
		yairLucianoCcepayaDiazRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		  yairLucianoCcepayaDiazRepository.deleteAll();
		
	}
	
	
	

}
