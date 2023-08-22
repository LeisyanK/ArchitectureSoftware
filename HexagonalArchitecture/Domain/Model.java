package Domain;

import Application.MovieApp;

public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    /**
     * запрос, пришедший от пользователя, передает в бизнес-логику в MovieApp
     * @param userCommand
     */
    public void Run(MovieSearchRequest userCommand)
    {
        movieApp.accept(userCommand);
    }
}
