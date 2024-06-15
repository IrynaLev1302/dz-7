public enum SolarSystem {
    Mercury("Меркурій",0, 2439, null ),
    Venus("Венера",75, 6051, Mercury),
    Earth("Земля", 52, 6371, Venus),
    Mars("Марс", 98, 3389, Earth),
    Jupiter("Юпітер", 760, 69911, Mars),
    Saturn("Сатурн", 651, 58232, Jupiter),
    Uranus("Уран", 2500, 25362, Saturn),
    Neptune("Нептун", 2700, 24622, Uranus);


    private final String title;
    private final int orderFromSun;
    private final int distanceFromPrevious;
    private final int distanceFromSun;
    private final int radius;
    private final SolarSystem previousPlanet;
    private  SolarSystem nextPlanet;

    SolarSystem(String title, int prevDistance, int radius, SolarSystem previous) {
        this.title = title;
        this.orderFromSun = previous == null ? 1 : previous.orderFromSun + 1;
        this.distanceFromPrevious = prevDistance;
        this.radius = radius;
        this.previousPlanet = previous;
        this.distanceFromSun = previous == null ? 0 : previous.distanceFromSun + prevDistance;
        if (previous != null) {
            previous.nextPlanet = this;
        }
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }

    public String getTitle() {
        return title;
    }
}



