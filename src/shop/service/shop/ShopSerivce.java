package shop.service.shop;

import shop.model.shop.Shop;

import java.io.IOException;

public interface ShopSerivce {
    Shop createShop() throws IOException;

    void printInfo(Shop shop);
}
