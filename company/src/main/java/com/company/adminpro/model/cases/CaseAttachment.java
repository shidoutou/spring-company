package com.company.adminpro.model.cases;

import lombok.Data;

@Data
public class CaseAttachment {
    private Integer id;
    private Integer caseId;
    private byte[] fileData;
    private String fileDescription;
}
