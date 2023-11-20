package ra.service;

import org.springframework.stereotype.Service;
import ra.model.Product;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    static List<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1, "Trà sữa", 100));
        productList.add(new Product(2, "Kem", 200));
        productList.add(new Product(3, "Bánh gấu", 300));
    }

    public List<Product> findAll() {
        return productList;
    }

    public void save(Product product) {
        if (product.getProductCode() == 0) {
            //thêm mới
            productList.add(product);
        } else {
            productList.set(productList.indexOf(findById(product.getProductCode())), product);
        }
    }
    public Product findById(int id) {
        for (Product p : productList) {
            if (p.getProductCode() == id) {
                return p;
            }
        }
        return null;
    }

    public void delete(int id) {
        productList.remove(findById(id));
    }

    public int getNewId() {
        int idMax = 0;
        for (Product p : productList) {
            if (idMax < p.getProductCode()) {
                idMax = p.getProductCode();
            }
        }
        return idMax + 1;
    }
}
