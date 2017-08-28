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
import mylibrary.bean.Funcionario;

public class FuncionarioDao implements Dao<Funcionario> {
    private File archive;
    List<Funcionario> corpoFunc;
    
    public FuncionarioDao() throws IOException {
        this.archive = new File("Corpo de Funcionarios.txt");
        if(!this.archive.exists()) this.archive.createNewFile();
    
    }

    @Override
    public boolean add(Funcionario t) throws IOException, ClassNotFoundException {
        corpoFunc = this.get();
        if(!objExist(t)){
            corpoFunc.add(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public boolean edit(Funcionario t) throws IOException, ClassNotFoundException {
        corpoFunc = this.get();
        if (objExist(t)){
            corpoFunc.remove(t);
            corpoFunc.add(t);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Funcionario t) throws IOException, ClassNotFoundException {
        if(objExist(t)){
            corpoFunc.remove(t);
            writeArchive();
            return true;
        }
        return false;
    }

    @Override
    public List<Funcionario> get() throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        if(this.archive.length()> 0){
            in = new ObjectInputStream(new FileInputStream(archive));
            corpoFunc = (ArrayList<Funcionario>) in.readObject();
            in.close();
        }else{
            corpoFunc = new ArrayList<>();
        }
        return corpoFunc;
    }
 
    public boolean objExist(Funcionario t){
        for(Funcionario i : corpoFunc){
            if(i.getCpf().equals(t.getCpf()))
                return true;
        }
        return false;
    }
    
    public void writeArchive() throws IOException{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archive));
            Collections.sort(corpoFunc);
            out.writeObject(corpoFunc);
            out.close();
    }

    
}