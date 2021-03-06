package com.souvik.bank.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Immutable
public class BankBranch {

    @Id
    @Column(name = "ifsc", updatable = false, nullable = false)
    private String ifsc;

    @Column(name = "bank_id")
    private int bank_id;

    @Column(name = "branch")
    private String branch;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "bank_name")
    private String bankName;

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "BankBranch{" +
                "ifsc='" + ifsc + '\'' +
                ", bank_id=" + bank_id +
                ", branch='" + branch + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
