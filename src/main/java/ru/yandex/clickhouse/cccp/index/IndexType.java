package ru.yandex.clickhouse.cccp.index;

/**
 * Data type in index
 *
 * Created by Jkee on 29.10.2016.
 */
public interface IndexType <T> {

    Class<T> getClazz();

    String getID();

    long toBound(T bound);

    T fromBound(long bound);

    long maxValue();

    long minValue();

}
