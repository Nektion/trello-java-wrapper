package com.julienvey.trello.exception;

public class TrelloApiException extends RuntimeException {

    public TrelloApiException(String message) {
        super(message);
    }

    public TrelloApiException(String response, Throwable cause) {
        super(response, cause);
    }

}
