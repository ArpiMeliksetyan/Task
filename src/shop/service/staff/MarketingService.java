package shop.service.staff;


import shop.model.staff.marketing.MarketingSpecialist;

import java.io.IOException;

public interface MarketingService {

    void printInfo(MarketingSpecialist marketingSpecialist);

    void printAll(MarketingSpecialist[] marketingSpecialists);

    void write(MarketingSpecialist marketingSpecialist) throws IOException;

    MarketingSpecialist[] read(String path) throws IOException;

    void printAllSortedByFirstname(MarketingSpecialist[] marketingSpecialists);

    void comission(MarketingSpecialist[] marketingSpecialists);

    void minExperience(MarketingSpecialist[] marketingSpecialists);


}
