import enums.Color;
import enums.Size;
import filter.BetterFilter;
import io.Product;
import specifications.AndSpecification;
import specifications.ColorSpecification;
import specifications.SizeSpecification;

import java.util.List;
import java.util.stream.Collectors;

public class OpenCloseMain {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.MEDIUM);
        Product mango = new Product("Mango", Color.YELLOW, Size.LARGE);
        Product house = new Product("house", Color.BLUE, Size.LARGE);

        List<Product> list = List.of(apple, mango, house);

        BetterFilter betterFilter = new BetterFilter();

        // filter with red color
        List<Product> onlyRedProduct = betterFilter
                .filter(list, new ColorSpecification(Color.RED))
                .collect(Collectors.toList());

        System.out.println("Product only with red color : " + onlyRedProduct);

        // filter with blue and large
        List<Product> blueAndLargeItems = betterFilter
                .filter(list,
                        new AndSpecification<>(
                                new ColorSpecification(Color.BLUE),
                                new SizeSpecification(Size.LARGE))
                ).collect(Collectors.toList());
        System.out.println("Product only with blue color and large size: " + blueAndLargeItems);
    }
}
