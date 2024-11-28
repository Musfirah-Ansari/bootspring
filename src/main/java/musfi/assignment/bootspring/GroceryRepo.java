package musfi.assignment.bootspring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GroceryRepo implements igrocery<Grocery> {

    public Map<Integer, Grocery> items;

    public GroceryRepo(){
        items = new HashMap<>();
    }

    @Override
    public void save(Grocery t) {
        items.put(t.getId(), t);
        
    }

    @Override
    public Collection<Grocery> viewAll() {
        return items.values();

    }

    @Override
    public void delete(Grocery t) {
        items.remove(t.getId());
    }

    
    
}

