package mylibrary.dao;

import java.io.IOException;
import java.util.List;

interface Dao <T> {
    public boolean add(T t) throws IOException, ClassNotFoundException;
    public boolean edit(T t) throws IOException, ClassNotFoundException;
    public boolean remove(T t) throws IOException, ClassNotFoundException;
    public List<T> get() throws IOException, ClassNotFoundException;
}
