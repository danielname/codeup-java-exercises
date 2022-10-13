package movies;

public class Movie {

        private static String name;
        public String setName(String name){
            return Movie.name = name;
        }
        private static String category;
        public static String setCategory(String category){
            return Movie.category = category;
        }
    public Movie(){
            name = "null";
            category = "null";
    };

}
