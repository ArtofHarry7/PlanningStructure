package com.omatrix.shipmentplanning.service;

import com.omatrix.shipmentplanning.models.Parameters;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static com.omatrix.shipmentplanning.controller.PlanningController.setPSOIterator;

@Service
public class PlanningService {

    public static byte[] processExcelFile(MultipartFile file) throws IOException {
        long startTime;
        double timeTaken;

        startTime = System.currentTimeMillis();

        if (Parameters.isEnablePSO()) {
            for (int i = 0; i < Parameters.getMaxIterations(); i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setPSOIterator(i+1);
            }
        }

        Workbook workbook = new XSSFWorkbook();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        workbook.write(out);
        workbook.close();

        timeTaken = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Time taken = " + timeTaken + " seconds\n");

        return out.toByteArray();
    }
}

