package pattern;

public interface Builder<T> {

    void init();
    Builder add(T obj);
    Builder remove(T obj);
    void build();
}
