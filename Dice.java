class Dice
{
  private int noOfdice;
  Dice(int noOfdice)
  {
    this.noOfdice=noOfdice;
  }
  public int rollDice() {
        return ((int) (Math.random() * (6 * noOfdice - 1 * noOfdice))) + 1;

    }
}
