package facade;
public class Main {
    public static void main(String[] args) {
        // Create a new instance of the facade
        ComputerFacade computer = new ComputerFacade();
        // Turn on the computer
        computer.turnOn();
        // Turn off the computer
        computer.turnOff();
    }
}

