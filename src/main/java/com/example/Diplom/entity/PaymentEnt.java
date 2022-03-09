package com.example.Diplom.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

public class PaymentEnt {
    @Getter
    @Setter
    @Entity
    @Table(name = "Payment")
    public class Payment {
        @Id
        private Long PaymentId;
        private int price;
        private String PaymentName;
        @Transient
        @ManyToMany(fetch = FetchType.EAGER)
        private Set<CourseEnt.Course> course;

        public Payment() {
        }

        public Long getPaymentId() {
            return PaymentId;
        }

        public void setPaymentId(Long paymentId) {
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

        public Set<CourseEnt.Course> getCourse() {
            return course;
        }

        public void setCourse(Set<CourseEnt.Course> course) {
            this.course = course;
        }

        public Payment(Long paymentId, int price, String paymentName, Set<CourseEnt.Course> course) {
            PaymentId = paymentId;
            this.price = price;
            PaymentName = paymentName;
            this.course = course;
        }
    }
}
