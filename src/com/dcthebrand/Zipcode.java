package com.dcthebrand;

public class Zipcode extends ServiceCommunicator{
    private String zipcode;

    //Created a constructor
    public Zipcode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
        this.zipcode = zipcode;
    }

    //created a getter to get zipcode
    public String getZipcode() {
        return zipcode;
    }

    //Created a setter to set zipcode
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public static void main(String[] args) {
        //Created a new zipcode and populated it
        Zipcode zip = new Zipcode("33033");

        //connected the zipcode
        zip.connect();

        //make response = zipcode entered
        String response = zip.get();

        System.out.println("Zip results: ");

        //printed the response
        System.out.println(response);
    }
}
