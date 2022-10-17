package structural.facade.problem;

public class Main {

    private static final long BOOT_ADDRESS = 1234456;
    private static final long BOOT_SECTOR = 1234;
    private static final int SECTOR_SIZE = 12;

    public static void main(String[] args) {

        Cpu processor = new Cpu();
        Memory ram = new Memory();
        HardDrive hd = new HardDrive();

        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
