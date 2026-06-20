package com.example.jaz_s_33091_nbp;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Currency Controller")
@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @Operation(summary = "Oblicz średni kurs waluty z podanego przedziału dat")
    @GetMapping("/{currency}")
    public ResponseEntity<Double> getAverageRate(
            @PathVariable String currency,
            @RequestParam String startDate,
            @RequestParam String endDate
    ) {
        return ResponseEntity.ok(currencyService.getAverageRate(currency, startDate, endDate));
    }
}