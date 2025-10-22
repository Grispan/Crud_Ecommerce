package com.curso.boot.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@SuppressWarnings("serial")
@MappedSuperclass
public class AbstractEntity  <ID extends Serializable> implements Serializable{
	


	@Id
	@GeneratedValue(stratedy=GewnerationType.IDENTITY)
	
	private ID id;
	
	public ID geytId() {
		return id;
	}
	
	public void setId(ID id) {
		this.id =id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity other = (AbstractEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
