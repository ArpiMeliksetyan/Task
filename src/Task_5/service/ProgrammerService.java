package Task_5.service;

import Task_5.model.programmer.Programmer;

public interface ProgrammerService {

    void printInfo(Programmer programmer);

    void printAllProgramers(Programmer[] programmers);

    void printJavaLanguage(Programmer[] programmers);

    void seniorLevelBackendProgrammer(Programmer[] programmers);

    void certifiedBackendProgrammersSortedByExperience(Programmer[] programmers);

    void cSharpLanguage(Programmer[] programmers);

    Programmer maxWorkingHour(Programmer[] programmers);

    void projectComplexity(Programmer programmer, int rate, int day, int hour);



}
