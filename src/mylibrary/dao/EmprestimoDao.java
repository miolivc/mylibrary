package mylibrary.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.List;
import mylibrary.bean.Emprestimo;

public class EmprestimoDao implements Dao<Emprestimo> {
    private File archive;
    List<Emprestimo> emprestados;
    
    public EmprestimoDao() throws IOException {
        this.archive = new File("Emprestimos.txt");
        if(!this.archive.exists()) this.archive.createNewFile();
    
    }

    @Override
    public boolean add(Emprestimo t) throws IOException, ClassNotFoundException {
        emprestados = this.get();
        if(!objExist(t)){
            emprestados.add(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public boolean edit(Emprestimo t) throws IOException, ClassNotFoundException {
        emprestados = this.get();
        if (objExist(t)){
            emprestados.remove(t);
            emprestados.add(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Emprestimo t) throws IOException, ClassNotFoundException {
        if(objExist(t)){
            emprestados.remove(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public List<Emprestimo> get() throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        if(this.archive.length()> 0){
            in = new ObjectInputStream(new FileInputStream(archive));
            emprestados = (ArrayList<Emprestimo>) in.readObject();
            in.close();
        }else{
            emprestados = new ArrayList<>();
        }
        return emprestados;
    }
 
    public boolean objExist(Emprestimo t){
        for(Emprestimo i : emprestados){
            if(i.getItem().getTitulo().equals(t.getItem().getTitulo()))
                return true;
        }
        return false;
    }
    
    public void writeArchive() throws IOException{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archive));
            //Collections.sort(emprestados);
            out.writeObject(emprestados);
            out.close();
    }
    
}