package com.omatrix.shipmentplanning.controller;

import com.omatrix.shipmentplanning.models.Parameters;
import com.omatrix.shipmentplanning.service.PlanningService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

//@Controller
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanningController {

    private ByteArrayInputStream fileContent;
    private static int PSOIterator = 0;

    public static void setPSOIterator(int PSOIterator) {
        PlanningController.PSOIterator = PSOIterator;
    }

    @GetMapping("/PSOIterator")
    public int getPSOIterator() {
        return PSOIterator;
    }

    @PostMapping("/upload")
    public ResponseEntity<byte[]> handleFileUpload(
            @RequestParam("file") MultipartFile file,
            @ModelAttribute Parameters params) throws IOException {

            System.out.println(params);
            setPSOIterator(0);

        byte[] excelData = PlanningService.processExcelFile(file);

        return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=result.xlsx")
                .body(excelData);
    }
}
