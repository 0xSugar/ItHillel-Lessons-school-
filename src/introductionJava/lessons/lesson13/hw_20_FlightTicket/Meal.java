package introductionJava.lessons.lesson13.hw_20_FlightTicket;

public class Meal {
    private Menu menu;
    private Drinks drinks;

    public Meal(Menu menu, Drinks drinks) {
        this.menu = menu;
        this.drinks = drinks;
    }

    public int getPrice() {
        return drinks.getPrice() + menu.getPrice();
    }
    /**
     * Если еда не = null, тогда включена еда и сразу её выводит. Если напитки = null, то НЕ включены, если не
     * равно null, тогда след. проверка, напитки равны Drinks.YES ? тогда включены : иначе не включены.
     * @return
     */
    @Override
    public String toString() {
        return "Eда " +
                (menu != null ? ("включена (" + menu + ")") : "не включена") + ", " +
                (drinks != null ? drinks : "не включены ($0)");
    }
}
