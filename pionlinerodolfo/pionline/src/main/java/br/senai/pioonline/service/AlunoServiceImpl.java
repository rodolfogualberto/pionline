package br.senai.pioonline.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.pioonline.model.Aluno;
import br.senai.pioonline.repository.AlunoRepository;

@Service("alunoService")

public class AlunoServiceImpl implements AlunoService {



    @Autowired

    AlunoRepository alunoRepository;



    @Override

    public Optional<Aluno> getAlunoById(Integer id) {

        return alunoRepository.findById(id);

    }



    @Override

    public List<Aluno> getAllAlunos() {

        return alunoRepository.findAll();

    }



    @Override

    public void deleteAllAlunos() {

        alunoRepository.deleteAll();

    }



    @Override

    public void deleteAlunoById(Integer id) {

        alunoRepository.deleteById(id);

    }

    

    @Override

    public void updateAlunoById(Integer id, Aluno aluno) {



        Optional<Aluno> getAluno = getAlunoById(id);

        getAluno.get().setName(aluno.getName());

        getAluno.get().setEmail(aluno.getEmail());



        alunoRepository.save(aluno);

    }



    @Override

    public void updateAluno(Aluno aluno) {

        alunoRepository.save(aluno);

    }



    @Override

    public void insertAluno(Aluno aluno) {

        alunoRepository.save(aluno);

    }

}
