package com.julienvey.trello;

public final class NotAuthorizedException extends TrelloClientRequestException {
    public NotAuthorizedException(String message) {
        super(message);
    }

    public NotAuthorizedException() {
        this("Not authorized");
    }

    public NotAuthorizedException(String response, Throwable cause) {
        super(response, cause);
    }
}
