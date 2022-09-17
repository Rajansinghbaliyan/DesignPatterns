package specifications;

import enums.Size;
import interfaces.Specification;
import io.Product;

public class SizeSpecification implements Specification<Product> {
    private final Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return size == item.getSize();
    }
}
