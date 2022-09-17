package interfaces;// This to define the specification for objects

public interface Specification<T> {
 boolean isSatisfied(T item);
}
