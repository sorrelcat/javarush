package com.javarush.task.task37.task3711;

/**
 * Created by sorre on 09.10.2017.
 */
public class Computer {

    CPU cpu = new CPU();
    Memory memory = new Memory();
    HardDrive hardDrive = new HardDrive();

    public void run()
    {
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
