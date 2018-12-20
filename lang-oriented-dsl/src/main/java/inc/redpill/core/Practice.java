package inc.redpill.core;

public interface Practice<T extends Resource> {
    T make();
}
