package specifications;

import interfaces.Specification;

public class AndSpecification<T> implements Specification<T> {
    private final Specification<T> first;
    public final Specification<T> second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
