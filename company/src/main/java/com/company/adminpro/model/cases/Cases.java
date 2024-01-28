package com.company.adminpro.model.cases;

import java.sql.Date;

import lombok.Data;

@Data
public class Cases {
    private Integer id;
    private String caseId;
    private String caseName;
    private Date registrationDate;
    private Date deadline;
    private String status;
    private String category;
    private Integer assigneeId;
    private Integer description;
}
