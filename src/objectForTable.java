import org.jetbrains.annotations.NotNull;

class objectsForTable implements Comparable<objectsForTable>{
    private String userID;
    private String title;
    private String description;
    private String location;
    private String condition;
    private String product_id;
    private String price;
    private String dateOfPublish;
    public objectsForTable(){}
    public objectsForTable(String userID, String title, String description, String location, String condition, String product_id, String price, String dateOfPublish) {
        this.userID = userID;
        this.title = title;
        this.description = description;
        this.location = location;
        this.condition = condition;
        this.product_id = product_id;
        this.price = price;
        this.dateOfPublish = dateOfPublish;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) { this.price = price;}

    public String getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(String dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }

    @Override
    public int compareTo(@NotNull objectsForTable o) {
        float x = Float.parseFloat(this.getPrice());
        float y = Float.parseFloat(o.getPrice());
        return Float.compare(x,y);
    }

}