package com.curso.boot.domain;
@Entity
@Table(name="CARGOS")
public class Cargo  extends AbstractEntity{
@Column(nome="nome" nullable=false, unique= true, length=60)
private String nome;

@ManyToOne
@JoinColumn(name="id_departamentos_fk")
private Departamento departamento;

@OneToMany(mappedBy="cargo")
private List<Funcionario> funcionarios;



}
