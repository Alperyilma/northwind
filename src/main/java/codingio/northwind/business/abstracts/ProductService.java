package codingio.northwind.business.abstracts;

import codingio.northwind.core.utilities.results.DataResult;
import codingio.northwind.core.utilities.results.Result;
import codingio.northwind.dataAccess.abstracts.ProductDao;
import codingio.northwind.entities.concretes.Product;
import codingio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {

    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
    DataResult<List<Product>> getAllSorted();

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);
    DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);
    DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
    DataResult<List<Product>> getByProductNameContains(String productName);
    DataResult<List<Product>> getByProductNameStartsWith(String productName);
    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();


}