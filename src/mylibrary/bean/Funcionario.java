package mylibrary.bean;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {
    private String cargo, setor, senha;

    public Funcionario(String cpf, String nome, String telefone, String email, Endereco endereco, String cargo, String setor, String senha) {
        super(cpf, nome, telefone, email, endereco);
        this.cargo = cargo;
        this.setor = setor;
        this.senha = senha;
    }

    public Funcionario(String cpf, String nome, Endereco endereco, String cargo, String setor, String senha) {
        super(cpf, nome, endereco);
        this.cargo = cargo;
        this.setor = setor;
        this.senha = senha;
    }

    public Funcionario(String cpf, String nome, String telefone, Endereco endereco,  String cargo, String setor, String senha) {
        super(cpf, nome, telefone, endereco);
        this.cargo = cargo;
        this.setor = setor;
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString() + "cargo=" + cargo + ", setor=" 
                + setor + ", senha=" + senha + '}';
    }
}
