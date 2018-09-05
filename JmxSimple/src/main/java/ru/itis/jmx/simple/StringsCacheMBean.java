package ru.itis.jmx.simple;

/**
 * 04.09.2018
 * StringsCache
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface StringsCacheMBean {
    int getCacheSize();
    void setCacheSize(int cacheSize);
    void printStrings();
    void addString(String string);

}
