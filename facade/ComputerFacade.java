package facade;
public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void turnOn() {
        System.out.println("Computer is starting...");
        processor.freeze();
        ram.load(0, hd.read(0, 1024));
        processor.jump(0);
        processor.execute();
        System.out.println("Computer is on!");
    }

    public void turnOff() {
        System.out.println();
        System.out.println("Computer is shutting down...");
        processor.stop();
        System.out.println("Computer is off!");
    }
}