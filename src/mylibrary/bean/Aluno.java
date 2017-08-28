package mylibrary.bean;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable {
    private String curso;

    public Aluno(String cpf, String nome, String telefone, String email, Endereco endereco, String curso) {
        super(cpf, nome, telefone, email, endereco);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "curso=" + curso + "}\n" ;
    }
}
