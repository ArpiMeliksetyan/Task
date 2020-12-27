package shop.service.product;

import shop.exception.InvalidParametersException;
import shop.model.product.Accessories;

import java.io.IOException;

public interface AccessoriesService {

    Accessories createAccessories() throws InvalidParametersException;

    void printInfo(Accessories accessories);

    void printAllAccessories(Accessories[] accessories);


    void write(Accessories accessories) throws IOException;

    Accessories[] read(String path) throws IOException;

    void accessoriesByMetal(Accessories[] accessories);

    void haveDiamondAndSortedByPrice(Accessories[] accessories);
}
