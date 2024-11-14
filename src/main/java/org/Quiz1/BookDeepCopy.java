package org.Quiz1;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book {
    public BookDeepCopy(String title, String author, List<String> chapters) {
        super(title, author, new ArrayList<>(chapters)); // Deep copy of chapters list
    }

    @Override
    public BookDeepCopy clone() {
        return new BookDeepCopy(this.title, this.author, new ArrayList<>(this.chapters));
    }
}
