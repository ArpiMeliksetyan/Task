package shop.service.product;

import shop.exception.InvalidParametersException;
import shop.model.product.Clothes;


import java.io.IOException;

public interface ClothesService {

    Clothes createClothes() throws InvalidParametersException;

    void printInfo(Clothes clothes);

    void printAllClothes(Clothes[] clothes);

    void write(Clothes clothes) throws IOException;


    Clothes[] read(String path) throws IOException;

    void cheapestClothes(Clothes[] clothes);

    void clothesBySeason(Clothes[] clothes);

    void clothesSortedByPriceAndNotReapetedBarCodes(Clothes[] clothes);

    void clothesGroupedByCountry(Clothes[] clothes);

}
