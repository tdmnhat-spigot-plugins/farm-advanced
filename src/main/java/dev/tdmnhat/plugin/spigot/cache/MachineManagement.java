package dev.tdmnhat.plugin.spigot.cache;

import dev.tdmnhat.plugin.spigot.entity.Machine;

import java.util.List;

public class MachineManagement {

    private List<Machine> machines;

    public MachineManagement(List<Machine> machines) {
        this.machines = machines;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public boolean addMachine(Machine machine) {
        return machines.add(machine);
    }
}
