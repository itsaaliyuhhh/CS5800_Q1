package org.Quiz1;

import java.util.ArrayList;
import java.util.List;

public class PrototypeBookDriver {
    public static void main(String[] args) {
        List<String> chaptersShallow = new ArrayList<>();
        chaptersShallow.add("Chapter 1");
        chaptersShallow.add("Chapter 2");
        BookShallowCopy bookShallow = new BookShallowCopy("Shallow Book", "Author A", chaptersShallow);
        BookShallowCopy cloneShallow = bookShallow.clone();
        bookShallow.chapters.add("Chapter 3"); // Modify original book's chapters

        System.out.println("Shallow Copy Test:");
        System.out.println("Original: " + bookShallow);
        System.out.println("Clone: " + cloneShallow);

        List<String> chaptersDeep = new ArrayList<>();
        chaptersDeep.add("Chapter 1");
        chaptersDeep.add("Chapter 2");
        BookDeepCopy bookDeep = new BookDeepCopy("Deep Book", "Author B", chaptersDeep);
        BookDeepCopy cloneDeep = bookDeep.clone();
        bookDeep.chapters.add("Chapter 3");

        System.out.println("\nDeep Copy Test:");
        System.out.println("Original: " + bookDeep);
        System.out.println("Clone: " + cloneDeep);
    }
}
