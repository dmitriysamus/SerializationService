import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationService {

    public String serializeProductAsJSON(Product product) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(product);
    }

    public Product deserializeProductFromJSON(String str) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(str, Product.class);
    }
}