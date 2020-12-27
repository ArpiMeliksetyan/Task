package shop.model.shop;

import shop.model.customer.Customer;
import shop.model.product.Accessories;
import shop.model.product.Clothes;
import shop.model.product.Shoes;
import shop.model.staff.accountant.Accountant;
import shop.model.staff.marketing.MarketingSpecialist;
import shop.model.staff.programmer.Programmer;
import shop.model.staff.sales.SalesManager;

import java.util.Arrays;


public class Shop {

    private String address;
    private String phone;
    private Customer[] customerList;
    private Clothes[] clothesList;
    private Shoes[] shoesList;
    private Accessories[] accessoriesList;
    private Programmer[] programmers;
    private MarketingSpecialist[] marketingSpecialists;
    private Accountant[] accountants;
    private SalesManager[] salesManagers;


    public Shop(String address, String phone, Customer[] customerList, Clothes[] clothesList, Shoes[] shoesList, Accessories[] accessoriesList, Programmer[] programmers, MarketingSpecialist[] marketingSpecialists, Accountant[] accountants, SalesManager[] salesManagers) {
        this.address = address;
        this.phone = phone;
        this.customerList = customerList;
        this.clothesList = clothesList;
        this.shoesList = shoesList;
        this.accessoriesList = accessoriesList;
        this.programmers = programmers;
        this.marketingSpecialists = marketingSpecialists;
        this.accountants = accountants;
        this.salesManagers = salesManagers;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer[] getCustomerList() {
        return customerList;
    }

    public void setCustomerList(Customer[] customerList) {
        this.customerList = customerList;
    }

    public Clothes[] getClothesList() {
        return clothesList;
    }

    public void setClothesList(Clothes[] clothesList) {
        this.clothesList = clothesList;
    }

    public Shoes[] getShoesList() {
        return shoesList;
    }

    public void setShoesList(Shoes[] shoesList) {
        this.shoesList = shoesList;
    }

    public Accessories[] getAccessoriesList() {
        return accessoriesList;
    }

    public void setAccessoriesList(Accessories[] accessoriesList) {
        this.accessoriesList = accessoriesList;
    }

    public Programmer[] getProgrammers() {
        return programmers;
    }

    public void setProgrammers(Programmer[] programmers) {
        this.programmers = programmers;
    }

    public MarketingSpecialist[] getMarketingSpecialists() {
        return marketingSpecialists;
    }

    public void setMarketingSpecialists(MarketingSpecialist[] marketingSpecialists) {
        this.marketingSpecialists = marketingSpecialists;
    }

    public Accountant[] getAccountants() {
        return accountants;
    }

    public void setAccountants(Accountant[] accountants) {
        this.accountants = accountants;
    }

    public SalesManager[] getSalesManagers() {
        return salesManagers;
    }

    public void setSalesManagers(SalesManager[] salesManagers) {
        this.salesManagers = salesManagers;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", customerList=" + Arrays.toString(customerList) +
                ", clothesList=" + Arrays.toString(clothesList) +
                ", shoesList=" + Arrays.toString(shoesList) +
                ", accessoriesList=" + Arrays.toString(accessoriesList) +
                ", programmers=" + Arrays.toString(programmers) +
                ", marketingSpecialists=" + Arrays.toString(marketingSpecialists) +
                ", accountants=" + Arrays.toString(accountants) +
                ", salesManagers=" + Arrays.toString(salesManagers) +
                '}';
    }
}
