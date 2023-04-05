package HefShine;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    /*
     * Complete the 'getProductSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY products
     *  2. STRING search
     */

    public static List<List<String>> getProductSuggestions(List<String> products, String search) {
        // Write your code here
        Collections.sort(products);
        List<List<String>> suggestions = new ArrayList<>();
        for (int i = 0; i < search.length(); i++) {
            List<String> suggestion = new ArrayList<>();
            String prefix = search.substring(0, i + 1);
            int count = 0;
            for (String product : products) {
                if (product.startsWith(prefix)) {
                    suggestion.add(product);
                    count++;
                }
                if (count == 3) {
                    break;
                }
            }
            suggestions.add(suggestion);
        }
        return suggestions;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int productsCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> products = IntStream.range(0, productsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String search = bufferedReader.readLine();
        List<List<String>> result = Result.getProductSuggestions(products, search);
        result.stream()
                .map(
                        r -> r.stream()
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });
        bufferedReader.close();
        bufferedWriter.close();
    }
}
