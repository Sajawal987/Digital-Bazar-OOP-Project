import java.util.ArrayList;

public class userBL {
//    private Account account;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddressImg() {
        return addressImg;
    }

    public void setAddressImg(String addressImg) {
        this.addressImg = addressImg;
    }

    private  ArrayList<product> allReceivedProducs = new ArrayList<>();
    private  ArrayList<product> allproducts = new ArrayList<>();
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String password;
    private String userID;

    private String gender;

    private String addressImg;

    public userBL(ArrayList<product> allReceivedProducs, ArrayList<product> allproducts, String name, String email, String address, String phoneNumber, String password, String userID, String gender, String addressImg) {
        this.allReceivedProducs = allReceivedProducs;
        this.allproducts = allproducts;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userID = userID;
        this.gender = gender;
        this.addressImg = addressImg;
    }

    public int getAllProducts() {
        return  allproducts.size();
    }
    public int getAllProducts2() {
        return  allReceivedProducs.size();
    }
    public userBL() {
    }
    public  void Create(product obj) {
        allproducts.add(obj);
    }
    public  void Create2(product obj) {
        allReceivedProducs.add(obj);
    }

    public  int GetIndexFromID(String id){
            int index = -1;
            for(int i = 0; i < allproducts.size(); ++i) {
                if (id.equals(allproducts.get(i).getProduct_id())) {
                    index = i;
                }
            }
            return index;
    }
    public void Remove(int index){allproducts.remove(index);}
    public int getIndex(String id){
        int index = -1;
        for(int i = 0; i < allproducts.size(); ++i) {
            if (id.equals(allproducts.get(i).getProduct_id())) {
                index = i;
            }
        }
        return index;
    }

    public product retrieveFromIndex(int index)
    {
        return allproducts.get(index);
    }

    public product retrieveFromIndex2(int index)
    {
        return allReceivedProducs.get(index);
    }


    public void ChangeAtIndex(int index, product obj){
        allproducts.set(index,obj);
    }

    public userBL(ArrayList<product> allReceivedProducs, ArrayList<product> allproducts, String name, String email, String address, String phoneNumber, String password, String userID, String gender) {
        this.allReceivedProducs = allReceivedProducs;
        this.allproducts = allproducts;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userID = userID;
        this.gender = gender;
    }

    public ArrayList<product> getAllReceivedProducs() {
        return allReceivedProducs;
    }

    public void setAllReceivedProducs(ArrayList<product> allReceivedProducs) {
        this.allReceivedProducs = allReceivedProducs;
    }

    public ArrayList<product> getAllproducts() {
        return allproducts;
    }

    public void setAllproducts(ArrayList<product> allproducts) {
        this.allproducts = allproducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
