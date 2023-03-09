package introduction.summary;

public class NewProduct {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            String noName = "Unknown";
            return noName;
        }
        return name;
    }
}






