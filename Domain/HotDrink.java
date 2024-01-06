package Domain;

public class HotDrink extends Bottle {
  private int temperature;

  public HotDrink(int price, int place, String name, long id, float bottleVolume, int temperature) {
    super(price, place, name, id, bottleVolume);
    this.temperature = temperature;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  @Override
  public String toString() {
    return super.toString() + "temrepature = " + temperature + "\n";
  }
}
