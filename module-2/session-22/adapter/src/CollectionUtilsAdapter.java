import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class CollectionUtilsAdapter implements CollectionOperations {

    // Phương thức chuyển đổi từ Set<Integer> sang List<Integer>
    public List<Integer> convertSetToList(Set<Integer> set) {
        return new ArrayList<>(set);
    }

    // Phương thức tìm giá trị lớn nhất trong Set<Integer>
    @Override
    public int findMax(Set<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Set cannot be null or empty");
        }
        return Collections.max(numbers);
    }
}
