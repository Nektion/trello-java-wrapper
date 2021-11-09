package com.julienvey.trello;

public class TrelloClientRequestException extends RuntimeException {
    public TrelloClientRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrelloClientRequestException(String message) {
        super(message);
    }

    public TrelloClientRequestException(Throwable cause) {
        super(cause);
    }
}
