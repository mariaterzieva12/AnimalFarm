package lib;

public enum AnimalType {
    BOZAINIK("Бозайник"),
    PTICA("Птица"),
    BEZGRABNACHNO("Безгръбначно"),
    VLECHUGO ("Влечуго"),
    RIBA("Риба");

    private String typeName;

    AnimalType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return String.format("%s", typeName);
    }
}
