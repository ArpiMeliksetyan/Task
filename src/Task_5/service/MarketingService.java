package Task_5.service;

import Task_5.model.marketing.MarketingSpecialist;


public interface MarketingService {

    void printInfo(MarketingSpecialist marketingSpecialist);

    void printAll(MarketingSpecialist[] marketingSpecialists);

    void printAllSortedByFirstname(MarketingSpecialist[] marketingSpecialists);

    void comission(MarketingSpecialist[] marketingSpecialists);

    void minExperience(MarketingSpecialist[] marketingSpecialists);


}
