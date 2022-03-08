package com.jst.rtsbilling.model;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="bill")

public class Billing {

   // @Id
    private Long slno;



    private String plant;
    private String tsdate;
    //@NotBlank
   // @Id
   // @Indexed(unique=true)
    private String tripsheet_no;
    private String root_schema;
    private String vehicle_type;
    private String vehicle_no;
    private String sp_name;
    private String supplier_covered;
    private Long kilometer;
    private Float sp_cost;
   // private Date createdAt = new Date();
   // private Date updatedAt = new Date();
    //vehicle number enumeration
    enum Vehicle {
        TN20AT3292,        TN18C0532,        TN22BV4440,        TN20CY8481,
        TN20BL3849,        TN05AD1436,        TN18P7871,        TN18AT2284,        TN05L9596
    }

    public Long getSlno() {
        return slno;
    }

    public void setSlno(Long slno) {
        this.slno = slno;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getTsdate() {
        return tsdate;
    }

    public void setTsdate(String tsdate) {
        this.tsdate = tsdate;
    }

    public String getTripsheet_no() {
        return tripsheet_no;
    }

    public void setTripsheet_no(String tripsheet_no) {
        this.tripsheet_no = tripsheet_no;
    }

    public String getRoot_schema() {
        return root_schema;
    }

    public void setRoot_schema(String root_schema) {
        this.root_schema = root_schema;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_no() {
        return vehicle_no;
    }

    public void setVehicle_no(String vehicle_no) {
        this.vehicle_no = vehicle_no;
    }

    public String getSp_name() {
        return sp_name;
    }

    public void setSp_name(String sp_name) {
        this.sp_name = sp_name;
    }

    public String getSupplier_covered() {
        return supplier_covered;
    }

    public void setSupplier_covered(String supplier_covered) {
        this.supplier_covered = supplier_covered;
    }

    public Long getKilometer() {
        return kilometer;
    }

    public void setKilometer(Long kilometer) {
        this.kilometer = kilometer;
    }

    public Float getSp_cost() {
        return sp_cost;
    }

    public void setSp_cost(Float sp_cost) {
        this.sp_cost = sp_cost;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "slno=" + slno +
                ", plant='" + plant +
                ", tsdate=" + tsdate +
                ", tripsheet_no=" + tripsheet_no +
                ", root_schema='" + root_schema +
                ", vehicle_type='" + vehicle_type +
                ", vehicle_no='" + vehicle_no +
                ", sp_name='" + sp_name +
                ", supplier_covered='" + supplier_covered +
                ", kilometer=" + kilometer +
                ", sp_cost=" + sp_cost +
                '}';
    }


// public Billing() { super();    }


/*
+at variable is " +
     "%f, while the value of the " + "Long variable is %d, " +
     "and the string is %s", floatVar, intVar, stringVar);


*/



}
