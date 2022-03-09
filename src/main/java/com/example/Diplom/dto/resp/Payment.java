package com.example.Diplom.dto.resp;

public class Payment {

    public Payment(int PaymentId, int price, String PaymentName){
        this.PaymentId = PaymentId;
        this.price = price;
        this.PaymentName = PaymentName;

    }

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int paymentId) {
        PaymentId = paymentId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPaymentName() {
        return PaymentName;
    }

    public void setPaymentName(String paymentName) {
        PaymentName = paymentName;
    }

    private int PaymentId;
    private int price;
    private String PaymentName;
}
