package atu.ie.week3_recap;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final Inventory inventory;

    @Autowired
    public ProductController(ProductService productService, Inventory inventory) {
        this.productService = productService;
        this.inventory = inventory;
    }

    @GetMapping("/get")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


    @PostMapping("/add")
    public String addProduct(@Valid @RequestBody Product newProduct) {
        productService.addProduct(newProduct);
        String responseFromInventory = inventory.storeProduct(newProduct);
        return "Product successfully created\n" + responseFromInventory;
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editProduct(@Valid @PathVariable long id, @RequestBody Product changedProduct) {
        boolean status = productService.editProduct(id, changedProduct);

        if(status){
            return new ResponseEntity<>("Product successfully Edited\n", HttpStatus.CREATED);
        }else
            return new ResponseEntity<>("Product not found\n", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> editProduct(@Valid @PathVariable long id) {
        boolean status = productService.deleteProduct(id);

        if(status){
            return new ResponseEntity<>("Product successfully Deleted\n", HttpStatus.CREATED);
        }else
            return new ResponseEntity<>("Product not found\n", HttpStatus.BAD_REQUEST);
    }
}
