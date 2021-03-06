package es.com.blogspot.elblogdepicodev.plugintapestry.services.dao;

import java.util.List;

import org.apache.tapestry5.jpa.annotations.CommitAfter;

import es.com.blogspot.elblogdepicodev.plugintapestry.misc.Pagination;

public interface GenericDAO<T> {

	 T findById(Long id);

	 List<T> findAll();

	 List<T> findAll(Pagination paginacion);

	 long countAll();

	 @CommitAfter
	 void persist(T producto);

	 @CommitAfter
	 void remove(T producto);

	 @CommitAfter
	 void removeAll();
}