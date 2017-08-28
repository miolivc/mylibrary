package mylibrary.bean;

import java.io.Serializable;
import java.util.Date;

public class Emprestimo implements Serializable, Comparable<Livro> {
    private static String codigo;
    private Date emprestimo, devolucao;
    private Aluno aluno;
    private Livro item;
    
    public Emprestimo(Livro item, Aluno aluno){
        super();
        Emprestimo.codigo += codigo ;
        this.emprestimo = this.devolucao = null;
        this.aluno = aluno;
        this.item = item;
    }

    public Date getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Date emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public Livro getItem() {
        return item;
    }

    public void setItem(Livro item) {
        this.item = item;
    }

    public static String getCodigo() {
        return codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    @Override
    public String toString() {
        return "Emprestimo{" + "emprestimo=" + emprestimo + ", devolucao=" + 
                devolucao + ", aluno=" + aluno.getNome() + ", item=" + item + '}';
    }

    @Override
    public int compareTo(Livro o) {
        return this.getItem().getTitulo().compareTo(o.getTitulo());
    }
}
