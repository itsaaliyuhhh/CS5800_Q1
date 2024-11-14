package org.Quiz1;

import java.util.List;

public class Book implements Cloneable {
    protected String title;
    protected String author;
    protected List<String> chapters;

    public Book(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Chapters: " + chapters;
    }
}
