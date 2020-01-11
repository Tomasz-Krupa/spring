package org.example;

public class DefaultCartService implements CartService {

    private ProductRepository productRepository;
    private PriceService priceService;
    private int size;


    public DefaultCartService(ProductRepository productRepository, PriceService priceService) {
        this.priceService = priceService;
        System.out.println("Constructor Def.Prod.Rep. :" + productRepository);
        this.productRepository = productRepository;
    }

    public DefaultCartService() {
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

