package com.jst.rtsbilling.controller;

import javax.validation.Valid;
import com.jst.rtsbilling.model.Billing;
import com.jst.rtsbilling.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")



public class BillingController {


    @Autowired
    BillingRepository billingRepository;

    @PostMapping("/billing")
    public Billing createBill(@Valid @RequestBody Billing bills) {
        System.out.print(bills);
        //bill.setCompleted(false);
        return billingRepository.save(bills);

    }
}