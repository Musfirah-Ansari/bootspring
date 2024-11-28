package musfi.assignment.bootspring;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("items") //https://localhost:8080/items
public class GroceryController {

    GroceryRepo repo;

    public GroceryController(){
        repo = new GroceryRepo();
    }

    //Add & Update
    @PostMapping("add") //https://localhost:8080/items/add
    public String addItems(@RequestBody Grocery grocery){
        repo.save(grocery);
        return "Items saved as " + grocery.getName();

    }

    //Delete
    @PostMapping("delete") //https://localhost:8080/items/delete
    public String deleteItems(@RequestBody Grocery grocery){
        repo.delete(grocery);
        return "Items deleted as " + grocery.getName();

    }

    //Read
    @GetMapping("")
    public Collection<Grocery> viewAll() {
        return repo.viewAll();
    }
    
}
