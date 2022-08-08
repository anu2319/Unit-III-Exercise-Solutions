import java.util.Scanner;

public class OneRowNim
{
    private String playerOneName;
    private String playerTwoName;
    private int player;
    private int nSticks;
    private int nMoves = 0;

    public OneRowNim(int nSticks, int player)
    {
        this.nSticks = nSticks;
        this.player = player;
    }


    public int getPlayer()
    {
        return player;
    }

    public int getnSticks()
    {
        return nSticks;
    }

    public void setNames(String playerOneName, String playerTwoName)
    {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getPlayerOneName()
    {
        return playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    public boolean takeSticks(int num)
    {
       if(num < 1)
       {
           return false;
       }
       else if(num > 3)
       {
           return false;
       }
       else
       {
           nSticks = nSticks - num;
           player = 3 - player;
           nMoves++;
           return true;
       }
    }

    public boolean playerOneGoesNext()
    {
        return (player==1);
    }

    public void report()
    {
        System.out.println("Number of Sticks  : " + getnSticks());
        System.out.println("Current Player is : " + getPlayer());
    }

    public int getnMoves()
    {
        return nMoves;
    }

    public boolean gameOver()
    {
        if(nSticks <=0)
        {
            return true;
        }
        return false;
    }

    public  boolean valid(int sticks)
    {
        if(sticks > nSticks)
        {
            System.out.println("Insufficient sticks");
            return false;
        }
        return true;
    }

    public int getWinner()
    {
        if(nSticks < 1)
        {
            return player;
        }
        return 0;
    }


    public static void main(String[] args)
    {

        OneRowNim oneRowNim = new OneRowNim(11,2);
        oneRowNim.setNames("Xena","Yogi");
        System.out.println("PlayerOne Name is : " + oneRowNim.getPlayerOneName());
        System.out.println("PlayerTwo Name is : " + oneRowNim.getPlayerTwoName());

        while(oneRowNim.gameOver()==false)
        {
            oneRowNim.report();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of sticks to remove: ");
            int sticks = sc.nextInt();
            if(oneRowNim.valid(sticks))
            {
                oneRowNim.takeSticks(sticks);
            }
            else
            {
                System.out.println("Game is over");
                return;
            }
        }
        oneRowNim.report();
        System.out.println("****Game is Over****");
        System.out.println("Number of Moves : " + oneRowNim.getnMoves());
        System.out.println("Winner player is : " + oneRowNim.getWinner());
    }
}
