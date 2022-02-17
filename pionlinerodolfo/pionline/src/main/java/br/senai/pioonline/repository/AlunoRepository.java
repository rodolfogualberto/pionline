package br.senai.pioonline.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.senai.pioonline.model.Aluno;

@Repository("alunoRepository")

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

	Optional<Aluno> findById(Integer id);

	List<Aluno> findAll();

	void deleteAll();

	void deleteById(Integer id);

	void save(Aluno aluno);



}
