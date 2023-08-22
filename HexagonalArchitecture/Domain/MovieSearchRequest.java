package Domain;

public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

    /**
     * получает название фильма по запросу
     * @return
     */
    public String getMovieName() {
        return request;
    }
}
