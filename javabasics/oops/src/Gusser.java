import java.util.Scanner;

class gues{
    int guessNum;
    int gussingNum(){
        System.out.println("gusser : guess the no  :");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class player{
    int guessNum;
    int gussingNum(){
        System.out.println("player : guess the no  :");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class umpire{
    int numFromGusser;// umpire propertyies
    int numFromPlay1;
    int numFromPlay2;
    int numFromPlay3;

    //umpieres behavior
    void collectNumFromGusser(){
        gues g = new gues();
        int numFromGusser = g.gussingNum();
    }
    void collectNumFromPlayers(){
        player  p = new player();
        player  p2 = new player();
        player  p3 = new player();
        int numFromPlay1 = p.gussingNum();
        int numFromPlay2 = p2.gussingNum();
        int numFromPlay3 = p3.gussingNum();
    }
    void compare(){
        if(numFromGusser == numFromPlay1){
            System.out.println("play1wonthegame");
        }else if(numFromGusser == numFromPlay2){
            System.out.println("player2wonthegame");
        }else if(numFromGusser == numFromPlay3){
            System.out.println("player3wonthegame");
        }else{
            System.out.println("all lost");
        }
    }

}

public class Gusser {
    public static void main(String[] args) {
        System.out.println("game started");
        umpire u = new umpire();

        u.collectNumFromGusser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
