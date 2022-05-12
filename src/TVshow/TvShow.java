package TVshow;

public class TvShow {
    String showName;
    String numEpisode;
    String showGenre;

    public TvShow(String showName, String numEpisode, String showGenre) {
        this.showName = showName;
        this.showGenre = showGenre;
        this.numEpisode = numEpisode;
    }

    public String getNumEpisode() {
        return numEpisode;
    }

    public String getShowName() {
        return showName;
    }

    public String getShowGenre() {
        return showGenre;
    }

    public String toString(){
        return ("The show is " + getShowName() + " and it has " + getNumEpisode() + " number of episodes, and is considered " + getShowGenre());
    }
}
