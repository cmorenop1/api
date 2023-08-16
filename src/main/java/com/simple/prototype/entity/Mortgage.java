package com.simple.prototype.entity;

import jakarta.persistence.*;

/**
 * Entity representing the Mortgage table in the database.
 */
@Entity
@Table(name = "mortgages")
public class Mortgage {

    // Unique identifier for the mortgage.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int mortgage_id;

    // Type of mortgage application.
    @Column(name = "application_type")
    private String application_type;

    // Type of mortgage product.
    @Column(name = "product_type")
    private String product_type;

    // Value of the property for which the mortgage is applied.
    @Column(name = "property_value")
    private int property_value;

    // Interest rate for the mortgage.
    @Column(name = "mortgage_rate_percent")
    private int mortgage_rate_percent;

    // Term/duration of the mortgage in years.
    @Column(name = "mortgage_term_years")
    private int mortgage_term_years;

    // Province where the property is located.
    @Column(name = "province")
    private String province;

    // City where the property is located.
    @Column(name = "city")
    private String city;

    // Street where the property is located.
    @Column(name = "street")
    private String street;

    // House number of the property.
    @Column(name = "house_number")
    private String house_number;

    // Postal code of the property.
    @Column(name = "postcode")
    private String postcode;

    // Income of the mortgage applicant.
    @Column(name = "income")
    private int income;

    // Expenses of the mortgage applicant.
    @Column(name = "expenses")
    private int expenses;

    // URL to related files (e.g., documents).
    @Column(name = "file_url")
    private String file_url;

    // Name as it appears on the applicant's DNI (National Identity Document).
    @Column(name = "name_on_dni")
    private String name_on_dni;

    // Number as it appears on the applicant's DNI (National Identity Document).
    @Column(name = "number_on_dni")
    private String number_on_dni;

    // Type of auction, if applicable.
    @Column(name = "auction_type")
    private String auction_type;

    // Default constructor.
    public Mortgage() {
    }

    public int getMortgage_id() {
        return mortgage_id;
    }

    public void setMortgage_id(int mortgage_id) {
        this.mortgage_id = mortgage_id;
    }

    public String getApplication_type() {
        return application_type;
    }

    public void setApplication_type(String application_type) {
        this.application_type = application_type;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public int getProperty_value() {
        return property_value;
    }

    public void setProperty_value(int property_value) {
        this.property_value = property_value;
    }

    public int getMortgage_rate_percent() {
        return mortgage_rate_percent;
    }

    public void setMortgage_rate_percent(int mortgage_rate_percent) {
        this.mortgage_rate_percent = mortgage_rate_percent;
    }

    public int getMortgage_term_years() {
        return mortgage_term_years;
    }

    public void setMortgage_term_years(int mortgage_term_years) {
        this.mortgage_term_years = mortgage_term_years;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public String getName_on_dni() {
        return name_on_dni;
    }

    public void setName_on_dni(String name_on_dni) {
        this.name_on_dni = name_on_dni;
    }

    public String getNumber_on_dni() {
        return number_on_dni;
    }

    public void setNumber_on_dni(String number_on_dni) {
        this.number_on_dni = number_on_dni;
    }

    public String getAuction_type() {
        return auction_type;
    }

    public void setAuction_type(String auction_type) {
        this.auction_type = auction_type;
    }

    //NEEDED: @OVERRRIDE TO STRING, OTERWISE ->> com.simple.prototype.entity.Mortgage@61b1f532


    @Override
    public String toString() {
        return "Mortgage{" + "mortgage_id=" + mortgage_id +
                ", application_type='" + application_type + '\'' +
                ", product_type='" + product_type + '\'' +
                ", property_value='" + property_value + '\'' +
                ", mortgage_rate_percent=" + mortgage_rate_percent +
                ", mortgage_term_years=" + mortgage_term_years +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house_number='" + house_number + '\'' +
                ", postcode='" + postcode + '\'' +
                ", income=" + income +
                ", expenses=" + expenses +
                ", file_url='" + file_url + '\'' +
                ", name_on_dni='" + name_on_dni + '\'' +
                ", number_on_dni='" + number_on_dni + '\'' +
                ", auction_type='" + auction_type + '\'' +
                '}';
    }
}








































