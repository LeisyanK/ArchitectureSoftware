package Adapters;

import Application.MovieApp;
import Domain.Model;
import Domain.MovieSearchRequest;
import Ports.IFetchMovieReviews;
import Ports.IPrintMovieReviews;
import Ports.IUserInput;

public class UserCommand implements IUserInput {
    private Model model;

    /**
     * конструктор
     * @param fetchMovieReviews
     * @param printMovieReviews
     */
    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    /**
     * передает команду пользователя внутрь системы
     * т.е. запускает метод Run у модели - запрос попал в домен
     */
    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}