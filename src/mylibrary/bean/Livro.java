package mylibrary.bean;

import java.io.Serializable;
import java.util.Objects;

public class Livro implements Serializable, Comparable<Livro> {
    private String isbn, titulo, autor, editora, paginas;
    private int qtde;
    
    /**
     * Construtor de livro
     * @param isbn
     * @param titulo
     * @param autor
     * @param editora
     * @param paginas
     * @param qtde 
     */
    public Livro(String isbn, String titulo, String autor, String editora, String paginas, int qtde) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.qtde = qtde;
    }

    /**
     * Retorna um ISBN
     * @return String
     */
    public String getIsbn() {
        return isbn;
    }
    
    /**
     * Altera o valor do ISBN
     * @param isbn 
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    /**
     * Confere se livros são iguais
     * @param obj
     * @return boolean
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    /**
     * Retorna como String o estado do Objeto Livro
     * @return String
     */
    @Override
    public String toString() {
        return "Livro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor
                + ", editora=" + editora + ", paginas=" + paginas + ", qtde=" + qtde + '}';
    }
    
    @Override
    public int compareTo(Livro o){
        return this.getIsbn().compareTo(o.getIsbn());
    }
    
    
    
}
