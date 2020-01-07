 class Computer extends Thread {
    @Override
    public void run()
    {
        while(Main.i< Main.GAME_NUMBER)
        {
            try{

                    sleep(5000);

            }catch(InterruptedException e){}
           if(Main.i > Main.GAME_NUMBER) {
               break;

           }
            Main.i--;
            Main.number.remove(Main.i);
            for(Integer s: Main.number )  {
                System.out.print(s+" ");
            }

            if (Main.i<2){
                System.out.println("Game over.\nYou lose.\nInput any number to exit...");
                break;
            }
            System.out.println();
        }
        Main.i--;
        Main.number.remove(Main.i);
    }
}
