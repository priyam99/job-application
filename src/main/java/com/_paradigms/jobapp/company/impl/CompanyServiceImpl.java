package com._paradigms.jobapp.company.impl;

import com._paradigms.jobapp.company.Company;
import com._paradigms.jobapp.company.CompanyRepository;
import com._paradigms.jobapp.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
