public class methods
{
    public static void main(String[] args)
    {
        
        a(true,800,5,100);
        a(true,10000,8,200);
    }
    public static void a(boolean gameover,int score,int levelcompleted,int bonus)
        {
           
            if(gameover)
            {
                int finalscore=score;
                finalscore+=(levelcompleted*bonus);
                finalscore+=1000;
                System.out.println("Your final score is :"+finalscore);

            }

        }
    
}
