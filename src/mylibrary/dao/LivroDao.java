package mylibrary.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mylibrary.bean.Emprestimo;
import mylibrary.bean.Livro;

public class LivroDao implements Dao<Livro> {
    private File archive;
    List<Livro> acervo;
    
    public LivroDao() throws IOException {
        this.archive = new File("Acervo.txt");
        if(!this.archive.exists()) this.archive.createNewFile();
    
    }

    @Override
    public boolean add(Livro t) throws IOException, ClassNotFoundException {
        acervo = this.get();
        if(!objExist(t)){
            acervo.add(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public boolean edit(Livro t) throws IOException, ClassNotFoundException {
        acervo = this.get();
        if (objExist(t)){
            acervo.remove(t);
            acervo.add(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Livro t) throws IOException, ClassNotFoundException {
        if(objExist(t)){
            acervo.remove(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public List<Livro> get() throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        if(this.archive.length()> 0){
            in = new ObjectInputStream(new FileInputStream(archive));
            acervo = (ArrayList<Livro>) in.readObject();
            in.close();
        }else{
            acervo = new ArrayList<>();
        }
        return acervo;
    }
 
    public boolean objExist(Livro t){
        for(Livro i : acervo){
            if(i.getIsbn().equals(t.getIsbn()))
                return true;
        }
        return false;
    }
    
    public void writeArchive() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archive));
            Collections.sort(acervo);
            out.writeObject(acervo);
    }
}