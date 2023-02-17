import org.example.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    void shouldCalculateAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAll = 180;
        int actualAll = service.sumSales(sales);

        Assertions.assertEquals(expectedAll, actualAll);
    }

    @Test
    void shouldAveragePerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageMonth(sales);

        Assertions.assertEquals(actualAverage, expectedAverage);
    }

    @Test
    public void shouldMaxSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSalesPerMonth(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    void shouldMinSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    void shouldlowerAverage(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLowerAverage = 5;
        int actualLowerAverage = service.belowAverage(sales);

        Assertions.assertEquals(expectedLowerAverage,actualLowerAverage);
    }

    @Test
    void shoulOverAverage(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedOverAverage = 5;
        int actualOverAverage = service.OverAverage(sales);

        Assertions.assertEquals(expectedOverAverage,actualOverAverage);

    }
}
