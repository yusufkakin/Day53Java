package TVshow;

import java.util.Scanner;
import java.util.ArrayList;

public class showLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> list = new ArrayList<>();
        while(true){
            System.out.println("Name of the show:");
            String showName = scanner.nextLine();
            if (showName.isBlank())
                break;
            System.out.println("How many episodes?");
            String episodeQuantity = scanner.nextLine();
            System.out.println("What is the genre?");
            String genreName = scanner.nextLine();

            list.add(new TvShow(showName, episodeQuantity, genreName));

        }

        for (TvShow tvShow : list)
            System.out.println(tvShow.toString());

    }

}
