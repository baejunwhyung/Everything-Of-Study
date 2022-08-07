public class 섯다 {
    public static void main (String[] args) {
        Player py= new Player();
        AI ai=new AI();
        int pfc,psc,ptt;//플레이어 첫번째 카드,두번째 카드,두카드 합 토탈
        int afc,asc,att;//AI 첫번째 카드,두번째 카드, 두카드 합 토탈
        pfc=(int) (Math.random()*12)+1;
        System.out.println("플레이어 첫번 째 카드: "+ "" +pfc);
        py.setfirstCard(pfc);
        psc=(int)(Math.random()*12)+1;
        System.out.println("플레이어 두번 째 카드: "+ "" +psc);
        py.setsecondtCard(psc);
        ptt=(pfc+psc)%10;
        py.settotalCard(ptt);
        System.out.println("플레이어 두 카드 합의 1의자리: "+ptt);
        afc=(int) (Math.random()*12)+1;
        System.out.println("AI의 첫번 째 카드: "+ "" +afc);
        py.setfirstCard(afc);
        asc=(int)(Math.random()*12)+1;
        System.out.println("AI의 두번 째 카드: "+ "" +asc);
        py.setsecondtCard(asc);
        att=(afc+asc)%10;
        py.settotalCard(att);
        System.out.println("AI의 두 카드 합의 1의자리: "+att);

        if(ptt>att){
            System.out.println("플레이어가 이겼습니다.");
        }
        else if(ptt==att){
            System.out.println("비겼습니다.");
        }
        else{
            System.out.println("AI가 이겼습니다.");
        }


    }
}




class Player{
    private int firstCard;
    private int secondCard;
    private int totalCard;

    public int getfirstCard(){
        return firstCard;
    }
    public void setfirstCard(int firstCard){
        this.firstCard=firstCard;
    }
    public int getsecondtCardtCard(){
        return secondCard;
    }
    public void setsecondtCard(int secondCard){
        this.secondCard=secondCard;
    }
    public int gettotalCard(){
        return totalCard;
    }
    public void settotalCard(int totalCard){
        this.totalCard=totalCard;
    }


}
class AI{
    private int firstCard;
    private int secondCard;
    private int totalCard;

    public int getFirstCard(){
        return firstCard;
    }
    public void setFirstCard(int firstCard){
        this.firstCard=firstCard;
    }
    public int getsecondtCardtCard(){
        return secondCard;
    }
    public void setsecondtCard(int secondCard){
        this.secondCard=secondCard;
    }
    public int gettotalCard(){
        return totalCard;
    }
    public void settotalCard(int totalCard){
        this.totalCard=totalCard;
    }


}





