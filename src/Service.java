import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Service {

    public String performOperations(String initialString){
        Stream<String> allLines = initialString.lines();
        Map<Object, List<String>> map = allLines.skip(1) //we skip the header
                .distinct() //we remove duplicates
                .filter(s -> !s.trim().isEmpty())
                .filter(s -> s.length() > 0)
                .collect(Collectors.groupingBy(s -> s.charAt(0))); //we sort by the first letter of the full name
        StringBuilder finalString = new StringBuilder();
        //now we just format the final string
        for(Object key:map.keySet()){
            finalString.append(key.toString()).append(":\n");
            map.get(key).forEach(s -> {
                finalString.append(s);
                finalString.append("\n");
            });
            finalString.append("\n");
        }
        return finalString.toString();
    }
}
