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
import mylibrary.bean.Aluno;

public class AlunoDao implements Dao<Aluno> {
    private final File archive;
    private List<Aluno> alunos;
    
    public AlunoDao() throws IOException {
        this.archive = new File("Alunos.txt");
        if(!this.archive.exists()) this.archive.createNewFile();
    
    }

    @Override
    public boolean add(Aluno t) throws IOException, ClassNotFoundException {
        alunos = this.get();
        if(! objExist(t)){
            alunos.add(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public boolean edit(Aluno t) throws IOException, ClassNotFoundException {
        alunos = this.get();
        if (objExist(t)){
            alunos.remove(t);
            alunos.add(t);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Aluno t) throws IOException, ClassNotFoundException {
        if(objExist(t)){
            alunos.remove(t);
            alunos.add(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public List<Aluno> get() throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        if(this.archive.length()> 0){
            in = new ObjectInputStream(new FileInputStream(archive));
            alunos = (ArrayList<Aluno>) in.readObject();
            in.close();
        }else{
            alunos = new ArrayList<>();
        }
        return alunos;
    }
 
    public boolean objExist(Aluno t) throws IOException, ClassNotFoundException{
        alunos = get();
        return alunos.stream().anyMatch((i) -> (!i.getCpf().equals(t)));
    }
    
    public void writeArchive() throws IOException{
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archive))) {
            Collections.sort(alunos);
            out.writeObject(alunos);
        }
    }
    
}