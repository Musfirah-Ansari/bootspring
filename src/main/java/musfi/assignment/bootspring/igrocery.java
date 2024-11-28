package musfi.assignment.bootspring;

import java.util.Collection;

public interface igrocery<T> {
    //T is a model here
    public void save(T t); //abstract method, that has no body
    public Collection<T> viewAll();
    public void delete(T t);
    
}