package shop.service.product;

import shop.exception.InvalidParametersException;
import shop.model.product.Shoes;

import java.io.IOException;

public interface ShoesService {

    Shoes createShoes() throws InvalidParametersException;

    void printInfo(Shoes shoes);

    void printAllShoes(Shoes[] shoes);

    void write(Shoes clothes) throws IOException;

    Shoes[] read(String path) throws IOException;

    void shoesSortedByPrice(Shoes[] shoes);

    void isTieShoes(Shoes[] shoes);

    void shoesByType(Shoes[] shoes);

    void shoesGroupedByBrand(Shoes[] shoes);

    void expensiveShoes(Shoes[] shoeses);
}
