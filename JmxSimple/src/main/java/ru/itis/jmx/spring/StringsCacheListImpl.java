package ru.itis.jmx.spring;
import java.util.ArrayList;
import java.util.List;

/**
 * 04.09.2018
 * StringsCacheListImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class StringsCacheListImpl implements StringsCache {

    private int cacheSize;

    private List<String> cache;

    public StringsCacheListImpl() {
        this.cacheSize = 0;
        this.cache = new ArrayList<>();
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public void printStrings() {
        cache.forEach(System.out::print);
    }

    public void addString(String string) {
        if (cache.size() < cacheSize) {
            cache.add(string);
        } else {
            System.err.println("Out of size");
        }
    }
}
