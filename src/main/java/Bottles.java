import java.io.PrintStream;

class Bottles {


    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            out.print(beers + container(beers) + " of beer on the wall,");
            out.println(beers + container(beers) + " of beer,");
            out.print(actionAfterTakeBeer(beers));
            out.println(beersLeft(beers) + container(beers - 1) + " of beer on the wall.\r\n");
        }

    }

    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    private static String actionAfterTakeBeer(int beers) {
        return (beers == 0) ? "Go to the store, buy some more," : "Take one down, pass it around,";
    }

    private static String container(int beers) {
        return (beers == 1) ?
                " bottle" :
                " bottles";
    }

    private static int beersLeft(int beers) {
        return (beers + 99) % 100;

    }
}
