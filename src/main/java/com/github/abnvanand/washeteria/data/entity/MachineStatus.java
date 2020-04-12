package com.github.abnvanand.washeteria.data.entity;

public enum MachineStatus {
    vacant("vacant"),
    occupied("occupied"),
    malfunctioned("malfunctioned");

    private String label;

    MachineStatus(String label) {
        this.label = label;
    }

    public static MachineStatus findByLabel(String label) {
        for (MachineStatus s : MachineStatus.values()) {
            if (s.label.equalsIgnoreCase(label))
                return s;
        }

        return null;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
