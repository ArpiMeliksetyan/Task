package shop.service.staff;


import shop.model.staff.programmer.Programmer;

import java.io.IOException;

public interface ProgrammerService {

    void printInfo(Programmer programmer);

    void printAllProgramers(Programmer[] programmers);


    void write(Programmer programmer) throws IOException;

    Programmer[] read(String path) throws IOException;

    void printJavaLanguage(Programmer[] programmers);

    void seniorLevelBackendProgrammer(Programmer[] programmers);

    void certifiedBackendProgrammersSortedByExperience(Programmer[] programmers);

    void cSharpLanguage(Programmer[] programmers);

    Programmer maxWorkingHour(Programmer[] programmers);

    void projectComplexity();
}
