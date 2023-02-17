import java.util.Scanner;

class guesser {
    int guessNum;

    int guesssingnum() {

        Scanner scan = new Scanner(System.in);
        System.out.println("gusser guess number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}
class player {
    int guessNum;

    int guessingnum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("player guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectTheNumberFromGusser() {
        guesser g = new guesser();
        numFromGusser = g.guesssingnum();
    }

    void collectNumFromPlayer() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numFromPlayer1 = p1.guessingnum();
        numFromPlayer2 = p2.guessingnum();
        numFromPlayer3 = p3.guessingnum();

    }

    void compare() {
        if (numFromGusser == numFromPlayer1) {
            System.out.println("player1 won the game");
        } else if (numFromGusser == numFromPlayer2) {
            System.out.println("player2 won the game");
        } else if (numFromGusser == numFromPlayer3) {
            System.out.println("player3 won the game");
        } else {
            System.out.println("all are wrong");
        }
    }
}

class guessergame {
    public static void main(String[] args) {
        System.out.println("game started");
        Umpire u = new Umpire();
        u.collectTheNumberFromGusser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
