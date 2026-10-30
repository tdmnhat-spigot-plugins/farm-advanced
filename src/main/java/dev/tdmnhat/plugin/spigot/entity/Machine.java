package dev.tdmnhat.plugin.spigot.entity;

public class Machine {

    private Long id;
    private int machineLevel;
    private String ownerUuid;
    private String worldName;
    private int x;
    private int y;
    private int z;

    public Machine(Long id, int machineLevel, String ownerUuid, String worldName, int x, int y, int z) {
        this.id = id;
        this.machineLevel = machineLevel;
        this.ownerUuid = ownerUuid;
        this.worldName = worldName;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMachineLevel() {
        return machineLevel;
    }

    public void setMachineLevel(int machineLevel) {
        this.machineLevel = machineLevel;
    }

    public String getOwnerUuid() {
        return ownerUuid;
    }

    public void setOwnerUuid(String ownerUuid) {
        this.ownerUuid = ownerUuid;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
