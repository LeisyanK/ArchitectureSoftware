package Application;

import Domain.MovieSearchRequest;
import Ports.IUserInput;

public class MovieUser {
    private IUserInput userInputDriverPort;

    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    /**
     * получает запрос пользователя и передает адаптеру
     * метод handleUserInput реализован в классе UserCommand (см. App.java line 23)
     * @param movieSearchRequest
     */
    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}