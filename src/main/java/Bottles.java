import java.io.PrintStream;

class Bottles {


    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            if (beers == 0) {
                out.print(beers + " bottles" + " of beer on the wall,");
                out.println(beers + " bottles" + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println("99 bottles of beer on the wall.\r\n");
                return;
            } else if (beers == 1) {
                out.print(beers + " bottle" + " of beer on the wall,");
                out.println(beers + " bottle" + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beers - 1 + " bottles" + " of beer on the wall.\r\n");
            } else if (beers == 2) {
                out.print(beers + " bottles" + " of beer on the wall,");
                out.println(beers + " bottles" + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beers - 1 + " bottle" + " of beer on the wall.\r\n");
            } else {
                out.print(beers + " bottles" + " of beer on the wall,");
                out.println(beers + " bottles" + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beers - 1 + " bottles" + " of beer on the wall.\r\n");
            }
        }
    }

    public static String actionAfterTakeBeer(int beers) {
        if(beers == 0) {
            return "Go to the store, buy some more,";
        } else {
            return "Take one down, pass it around,";
        }
    }
}
