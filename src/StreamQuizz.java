import java.util.List;


public class StreamQuizz {


    public static void main(String[] args) {
        List<String> names = List.of("tani", "tanaka", "od", "taniguchi", "takata");
        List<String> result = names.stream().sorted().filter(name -> name.contains("a")).toList();


        System.out.println(result);
    }


}



