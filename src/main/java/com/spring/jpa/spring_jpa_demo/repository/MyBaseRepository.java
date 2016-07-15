
package com.spring.jpa.spring_jpa_demo.repository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.spring.jpa.spring_jpa_demo.entity.Todo;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface MyBaseRepository <T, ID extends Serializable> extends Repository <T,ID>{	
	void delete(T deleted);
	List <T> findAll(ID id);
	Optional <T> findOne(ID id);
	T save(T persisted);	
}
