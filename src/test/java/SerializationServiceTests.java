import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SerializationServiceTests {
    Product product;
    List<String> barcodes;
    SerializationService serializationService;
    String jsn;

    @BeforeEach
    void init() {
        barcodes = new ArrayList<>();
        barcodes.add("111WWW");
        barcodes.add("000OOO");
        product = new Product(1, "test", "testT", "2021-01-01", "tester", barcodes);
        serializationService = new SerializationService();

        jsn  = "{\"id\":1,\"name\":\"test\",\"description\":\"testT\",\"expirationDate" +
                "\":\"2021-01-01\",\"manufacturer\":\"tester\",\"barcodes\":[\"111WWW\"," +
                "\"000OOO\"]}";
    }

    @AfterEach
    void clean() {
        product = null;
        barcodes = null;
        serializationService = null;
        jsn = null;
    }

    /**
     * Проверяет метод serializeProductAsJSON().
     */
    @Test
    void serializeProductAsJSON_test() throws Exception {
        Assert.assertEquals(jsn, serializationService.serializeProductAsJSON(product));
    }

    /**
     * Проверяет метод deserializeProductFromJSON().
     */
    @Test
    void deserializeProductFromJSON_test() throws Exception {
        Assert.assertEquals(product.getId(), serializationService.deserializeProductFromJSON(jsn).getId());
        Assert.assertEquals(product.getName(), serializationService.deserializeProductFromJSON(jsn).getName());
        Assert.assertEquals(product.getDescription(), serializationService.deserializeProductFromJSON(jsn).getDescription());
        Assert.assertEquals(product.getExpirationDate(), serializationService.deserializeProductFromJSON(jsn).getExpirationDate());
        Assert.assertEquals(product.getManufacturer(), serializationService.deserializeProductFromJSON(jsn).getManufacturer());
        Assert.assertEquals(product.getBarcodes(), serializationService.deserializeProductFromJSON(jsn).getBarcodes());
    }

}
