package structural.facade.solution;

public class Cpu {
    public void freeze() {
        System.out.println("freezing the processor... ");
    }
    public void jump(long position) {
        System.out.println("jumping processor to position : " + position + "...");
    }
    public void execute() {
        System.out.println("executing the process...");
    }
}
