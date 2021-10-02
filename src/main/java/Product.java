import java.util.List;

/**
 * Класс Product характеризует объект - продовольственные продукт
 * Поля:
 * - id
 * - название
 * - описание
 * - срок годности
 * - производитель
 * - List<String> штрихкоды
 */
public class Product {
    private int id;
    private String name;
    private String description;
    private String expirationDate;
    private String manufacturer;
    private List<String> barcodes;

    public Product () {
    }

    public Product(int id, String name, String description, String expirationDate, String manufacturer, List<String> barcodes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.expirationDate = expirationDate;
        this.manufacturer = manufacturer;
        this.barcodes = barcodes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<String> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", barcodes=" + barcodes +
                '}';
    }
}
