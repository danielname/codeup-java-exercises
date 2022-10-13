package movies;

public class Movie {

    private String name;
    private String category;

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }
    public String checkCategory(){
        return this.category;
    }
    public String checkName(){
        return this.name;
    }
    public Movie(){
            name = "null";
            category = "null";
    }
    public Movie(String title, String genre){
        name = title;
        category = genre;
    }

}
