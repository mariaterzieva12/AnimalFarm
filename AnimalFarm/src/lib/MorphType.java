package lib;

public enum MorphType {
    ЕARTH("Сухоземно"),
    WATER("Водно"),
    EARTH_WATER("Водно/Сухоземно");

    private String morphType;

    MorphType(String morphType) {
        this.morphType = morphType;
    }

    public String getMorphType() {
        return morphType;
    }

    @Override
    public String toString() {
        return String.format("%s", morphType);
    }
}
