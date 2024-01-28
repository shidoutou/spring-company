package com.company.adminpro.service.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.company.adminpro.mapper.cases.CasesMapper;

@Service
public class CaseIdGeneratorService {

    private final CasesMapper casesMapper;

    public CaseIdGeneratorService(CasesMapper casesMapper) {
        this.casesMapper = casesMapper;
    }

    private static final String PREFIX = "AK";
    private final AtomicInteger counter = new AtomicInteger(0);
    private String currentDate = "";

    // ケースIDを生成するメソッド
    public synchronized String generateCaseId() {
        // 今日の日付をyyyyMMdd形式で取得
        String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
        // 日付が変わった場合、カウンターをリセット
        if (!today.equals(currentDate)) {
            currentDate = today;
            String lastCaseId = casesMapper.findMaxCaseIdForToday();
            if (lastCaseId != null) {
                int lastNumber = Integer.parseInt(lastCaseId.substring(lastCaseId.length() - 3));
                counter.set(lastNumber);
            } else {
                counter.set(0);
            }
        }

        // プレフィックス、現在日付、カウンター値でケースIDを生成
        return PREFIX + currentDate + String.format("%03d", counter.incrementAndGet());
    }
}
