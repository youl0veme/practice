package ru.ssau.tk.name.practice.collection;

import ru.ssau.tk.name.practice.collection.Settlement.*;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    public WaypointType getType() {
        return type;
    }
}
