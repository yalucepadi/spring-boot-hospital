package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "its_me")
public class YairLucianoCcepayaDiaz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_me")
	private Integer codMe;
	@Column(name = "name", length = 20)
	private String name;
	@Column(name = "sex", length = 2)
	private String sex;
	@Column(name = "age", length = 20)
	private String age;

}
