class SnakesandLadders {
  private int end;
  private int start;
  SnakesandLadders(int startPoint, int endPoint) {
      this.start = startPoint;
      this.end = endPoint;
  }

  public int getEndPoint() {
      return end;
  }
}


class Snakes extends SnakesandLadders {

  Snakes(int start, int end) {
      super(start, end);
  }

}

class Ladders extends SnakesandLadders {

  Ladders(int start, int end) {
      super(start, end);
  }
}
