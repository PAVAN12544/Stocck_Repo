package com.zensar.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.zensar.entity.StockEntity;
import com.zensar.service.StocckService;

@WebMvcTest(StocckController.class)
public class StocckControllerTest {



@MockBean
StocckService stockService;
@Test
public void testGetAllStocks() {
 List<StockEntity> stocks=new ArrayList<StockEntity>();
 stocks.add(new StockEntity("Apple",22));
stocks.add(new StockEntity("IBM",25));
 stocks.add(new StockEntity("Zensar",29));
 when(stockService.getAllStockEntities()).thenReturn(stocks);
 List<StockEntity> result=stockService.getAllStockEntities();
 assertEquals(stocks, result);
 }
}
