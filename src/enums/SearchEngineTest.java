package enums;

public class SearchEngineTest {
    public static void main(String[] args) {
        SearchEngine userSearchEngine = SearchEngine.GOOGLE;
        System.out.println(userSearchEngine);
        System.out.println(userSearchEngine.getUrl());

        SearchEngineClass yahoo = SearchEngineClass.YAHOO;
        System.out.println(yahoo);
        System.out.println(yahoo.getUrl());

        if (userSearchEngine.equals(SearchEngine.YAHOO)) {
            //if(google == SearchEngine.GOOGLE)
            System.out.println("YES YOU ARE SEARCHING IN GOOGLE");
        } else {
            System.out.println("YOU ARE SEARCHING IN DIFFERENT SEARCH ENGINE");
        }


        /*
            compareTo -
                - 0: jane te barabarte
                - <0: eshte me e vogel
                - >0: eshte me madhe

         */
        System.out.println(userSearchEngine.compareTo(SearchEngine.GOOGLE));
        System.out.println(userSearchEngine.compareTo(SearchEngine.BING));
        System.out.println(userSearchEngine.compareTo(SearchEngine.YAHOO));

        System.out.println(SearchEngine.YAHOO.compareTo(userSearchEngine));
    }
}





