package com.fabiandopfer.flashchatnewfirebase;

public class InstantMessage {

    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {

        //das hier wurde nach crash hinzugefügt
        if (author == null) author="Name not saved";

        return author;
    }
}
