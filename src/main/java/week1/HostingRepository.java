package week1;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// 24th Jan22
public class HostingRepository {

    public static List<Hosting> filterHosting(List<Hosting> hosting, Predicate<Hosting> predicate)
    {
        return hosting.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
