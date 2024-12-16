package com._paradigms.jobapp.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id,
                                                @RequestBody Company company){
        companyService.updateCompany(company, id);
        return new ResponseEntity<>("Company updated successfully",
                HttpStatus.OK);
    }
}
/*
Companies
GET /companies
PUT /companies/{id}
POST /companies
DELETE /companies/{id}
GET /companies/{id}

Reviews
GET /companies/{companyId}/reviews
POST /companies/{companyId}/reviews
GET /companies/{companyId}/reviews/{reviewId}
PUT /companies/{companyId}/reviews/{reviewId}
DELETE /companies/{companyId}/reviews/{reviewId}

 */