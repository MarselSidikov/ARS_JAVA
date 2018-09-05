package ru.itis.jmx.spring;

/**
 * 04.09.2018
 * StringsCache
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface StringsCache {
    int getCacheSize();
    void setCacheSize(int cacheSize);
    void printStrings();
    void addString(String string);

}
