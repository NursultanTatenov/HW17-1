package com.company;

import java.util.Arrays;

public class  Farm {
    private String address;
    private String ownerName;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheeps, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm\n{" + "address=" + address+
                ", \nownerName=" + ownerName+
                ", \ncows=" + Arrays.toString(cows) +
                ", \nsheeps=" + Arrays.toString(sheeps) +
                ", \nhorses=" + Arrays.toString(horses) ;
    }
}
