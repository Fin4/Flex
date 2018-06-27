import com.rl.flex.criterias.Category;
import com.rl.flex.criterias.SearchObject;
import com.rl.sites.Farfetch;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {

        SearchObject nmd = new SearchObject("nmd", 100, Category.SHOES, "adidas");
        SearchObject airMax95 = new SearchObject("air max 95", 100, Category.SHOES, "nike");

        List<SearchObject> searchObjects = Arrays.asList(nmd, airMax95);

        Farfetch farfetch = new Farfetch();

        List<String> results = searchObjects.stream()
                .map(farfetch::get)
                .collect(Collectors.toList());

        int i = 1;
        for (String result : results) {
            try (PrintWriter printWriter = new PrintWriter("farfetch" + i + ".html")) {
                printWriter.print(result);
                i++;
            }
        }


    }
}
