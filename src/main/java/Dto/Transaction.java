package Dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Transaction {
    private String transactionid;
    private String productid;
    private String productname;
    private String productcategory;
    private double productprice;
    private int productquantity;
    private String productbrand;
    private double totalamount;
    private String currency;
    private String customerid;
    private Timestamp transactiondate;
    private String paymentmethod;
}
