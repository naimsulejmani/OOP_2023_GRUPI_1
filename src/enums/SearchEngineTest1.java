package enums;

public class SearchEngineTest1 {
    public static void main(String[] args) {
        SearchEngine[] engines = SearchEngine.values();
        for (SearchEngine engine : engines) {
            if (engine.getUrl().equals("https://www.bing.com"))
                System.out.println(engine.getUrl());
        }

        //set search engine with random
        SearchEngine randomEngine = engines[(int) (Math.random() * engines.length)];
        System.out.println(randomEngine);
//        System.out.println(engines[2]);

        switch (randomEngine) {
            case YAHOO -> System.out.println("Jeni ne YAHOO");
            case GOOGLE -> System.out.println("JENI NE GOOGLE");
            case BING -> {
                System.out.println("JENI");
                System.out.println("NE BING");
            }
        }


    }
}
