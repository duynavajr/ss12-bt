package ra.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ra.model.Product;
import ra.service.ProductService;
import java.util.List;

@Controller
@RequestMapping("/ProductController")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ModelAndView list() {
        List<Product> productList = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("list", "product", productList);
        return modelAndView;
    }

    @GetMapping("add")
    public ModelAndView addForm() {
        ModelAndView modelAndView = new ModelAndView("add");
        return modelAndView;
    }
    @PostMapping("add")
    public String add(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/ProductController";
    }

    @GetMapping("edit/{productCode}")
    public ModelAndView edit(@PathVariable("productCode") int id){
        // lấy ra theo dường dẫn
        Product productEdit = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit","product",productEdit);
        return modelAndView;
    }
    @PostMapping("edit")
    public  String update(@ModelAttribute("product") Product product){
        productService.save(product);
        return "redirect:/ProductController";
    }
    @GetMapping("delete/{productCode}")
    public  String delete(@PathVariable("productCode") int productCode){
        productService.delete(productCode);
        return "redirect:/ProductController";
    }
}
