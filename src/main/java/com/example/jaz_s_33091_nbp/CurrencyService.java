package com.example.jaz_s_33091_nbp;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class CurrencyService {

    private final RestTemplate restTemplate;
    private final CurrencyQueryRepository currencyQueryRepository;

    public CurrencyService(RestTemplate restTemplate, CurrencyQueryRepository currencyQueryRepository) {
        this.restTemplate = restTemplate;
        this.currencyQueryRepository = currencyQueryRepository;
    }

    public double getAverageRate(String currency, String startDate, String endDate) {

        NbpResponse nbpResponse = restTemplate.getForObject(
                "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + startDate + "/" + endDate + "/?format=json",
                NbpResponse.class
        );

        double sum = 0;

        for (NbpRate rate : nbpResponse.getRates()) {
            sum = sum + rate.getMid();
        }

        double average = sum / nbpResponse.getRates().size();
        average = Math.round(average * 10000.0) / 10000.0;

        CurrencyQuery currencyQuery = new CurrencyQuery();
        currencyQuery.setCurrency(currency);
        currencyQuery.setStartDate(startDate);
        currencyQuery.setEndDate(endDate);
        currencyQuery.setCalculatedRate(average);
        currencyQuery.setRequestDateTime(LocalDateTime.now().toString());

        currencyQueryRepository.save(currencyQuery);

        return average;
    }
}