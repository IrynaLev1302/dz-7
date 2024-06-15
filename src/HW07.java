public class HW07 {
    public static void main(String[] args) {

        SolarSystem planet = SolarSystem.Mercury;
        System.out.println("Планета: " + planet.getTitle());
        System.out.println("Порядковий номер від Сонця: " + planet.getOrderFromSun());
        System.out.println("Віддаленість від попередньої планети: " + planet.getDistanceFromPrevious());
        System.out.println("Відстань від Сонця: " + planet.getDistanceFromSun());
        System.out.println("Радіус: " + planet.getRadius());
        System.out.println("Попередня планета: " + (planet.getPreviousPlanet() != null ? planet.getPreviousPlanet() : "немає"));
        System.out.println("Наступна планета: " + (planet.getNextPlanet() != null ? planet.getNextPlanet() : "немає"));




    }


}
