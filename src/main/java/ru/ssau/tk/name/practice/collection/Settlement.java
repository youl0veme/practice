package ru.ssau.tk.name.practice.collection;

public class Settlement extends Location {
    private int settlement;
    private SettlementType type;

    enum WaypointType {
        DEPOT,
        WAREHOUS,
        EMPTY
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public int getSettlement() {
        return settlement;
    }

    public SettlementType getType() {
        return type;
    }
}
