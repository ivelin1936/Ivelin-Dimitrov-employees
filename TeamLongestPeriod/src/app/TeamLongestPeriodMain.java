package app;

import app.Core.Engine;
import app.io.ConsoleOutputWriter;
import app.io.FileIO;
import app.io.FileIOImpl;
import app.io.Writer;
import app.repository.EmployeeRepository;
import app.repository.EmployeeRepositoryImpl;
import app.serveces.EmployeeService;
import app.serveces.EmployeeServiceImpl;

public class TeamLongestPeriodMain {
    public static void main(String[] args) {

        FileIO fileIO = new FileIOImpl();
        Writer writer = new ConsoleOutputWriter();
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmployeeService emplService = new EmployeeServiceImpl(employeeRepository);

        Engine engine = new Engine(fileIO, writer, emplService);
        engine.run();
    }
}
