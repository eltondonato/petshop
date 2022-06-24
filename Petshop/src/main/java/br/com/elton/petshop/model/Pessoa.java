package br.com.elton.petshop.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
@ManyToMany
@JoinTable(name = "pessoa_cachorro",
		joinColumns = @JoinColumn(name="pessoa_id"),
		inverseJoinColumns = @JoinColumn(name="cachorro_id"))
		
private List<Cachorro> cachorros = new ArrayList<Cachorro>();
public void addCachorro(Cachorro c) {
	cachorros.add(c);
}

}
