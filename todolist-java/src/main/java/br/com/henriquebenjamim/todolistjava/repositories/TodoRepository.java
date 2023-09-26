package br.com.henriquebenjamim.todolistjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henriquebenjamim.todolistjava.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
  
}
