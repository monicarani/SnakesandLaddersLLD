import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello...\n Let's play Snakes and Ladders game...\n");
    System.out.println("Enter the number of players : ");
    int nop = sc.nextInt();
    Queue<Player> players = new LinkedList<>();
    for(int i=0;i<nop;i++)
    {
      int id =i+1;
      System.out.println("Enter the name of Player - "+String.valueOf(id)+" : ");
      String name=sc.next();
      Player p = new Player(name);
      players.add(p);
    }
    System.out.println("Enter No of Snakes");
        int nSnakes = sc.nextInt();

        HashMap<Integer, Snakes> snakeMap = new HashMap<Integer, Snakes>();
        sc.nextLine();
        while (nSnakes-- > 0) {
        	int max = 99;
            int min = 1;
            int range = max - min + 1;
            int start = (int)(Math.random() * range) + min;
            while(snakeMap.containsKey(start)) {
            	start = (int)(Math.random() * range) + min;
            }
            int end = (int)(Math.random() * (start-1)) + min;
            Snakes snake = new Snakes(start, end);
            snakeMap.put(start, snake);
            System.out.println(start+" " +end);
        }

        System.out.println("Enter No of Ladders");
        int nLadders = sc.nextInt();

        HashMap<Integer, Ladders> ladderMap = new HashMap<>();
        sc.nextLine();
        while (nLadders-- > 0) {
        	int max = 99;
            int min = 1;
            int range = max - min + 1;
            int start = (int)(Math.random() * range) + min;
            while(snakeMap.containsKey(start) || ladderMap.containsKey(start)) {
            	start = (int)(Math.random() * range) + min-1;
            }
            int end = (int)(Math.random() * (range-start)) + min;
            Ladders ladder = new Ladders(start, end);
            ladderMap.put(start, ladder);
            System.out.println(start+" "+end);
        }
        int bSize = 100;
        Dice dice = new Dice(1);
        Board gameBoard = new Board(bSize, dice,snakeMap, ladderMap, players);
        gameBoard.startGame();
        sc.close();
        
  }
}
