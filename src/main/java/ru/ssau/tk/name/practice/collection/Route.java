package ru.ssau.tk.name.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private final List<Location> locations = new ArrayList<>();

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void addLocationByIndex(int index, Location location) {
        this.locations.add(index, location);
    }

    public void removeLocation(int index) {
        this.locations.remove(index);
    }
}
