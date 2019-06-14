package jiegouxing.facade;

public class FacadeComputer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    FacadeComputer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void start(){
        cpu.start();
        memory.start();
        disk.start();
    }

    public void shutdown(){
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }
}
