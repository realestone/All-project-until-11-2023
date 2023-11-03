package shop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class ShopWorkerTest {
    private ShopWorker shopWorker = new ShopWorker();

    @Test
    public void testIfCorrectProductIsRetrievedFromList() {
        //given
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product[] products = {milk, bread, cookies};

        //when
        Product retrievedProduct = shopWorker.getProductFromList(products, 1);

        //then
        assertEquals("Bread", retrievedProduct.name);
        assertEquals(15, retrievedProduct.price);

    }

    @Test
    public void testIfNullIsReturnedIfIndexIsIncorrect() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product[] products = {milk, bread, cookies};

        Product retrievedProduct = shopWorker.getProductFromList(products, 3);

        assertNull(retrievedProduct);
    }

    @Test
    public void testIfProductIsAddedToEmptySpot() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product[] products = {milk, bread, null};

        shopWorker.addProduct(products, new Product("Water", 1));

        assertEquals("Water", products[2].name);

    }

    @Test
    public void testIfProductNotRemovedWhenIndexIncorrect() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product[] products = {milk, bread, cookies};

        shopWorker.removeProductFromList(products, 4);

        assertNotNull(products[0]);
        assertNotNull(products[1]);
        assertNotNull(products[2]);
    }

    @Test

    public void testIfProductsByGivenLetterFounder() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product water = new Product("Water", 8);
        Product[] products = {milk, bread, cookies, water};

        Product[] productsByLetter = shopWorker.getProductsByLetter(products, "A");

        assertNotNull(productsByLetter[1]);
        assertNotNull(productsByLetter[3]);


    }

    @Test
    public void testIfProductArrayIsEmptyWhenNo() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product water = new Product("Water", 8);

        Product[] products = {milk, bread, cookies, water};
        Product[] productsByPrice = shopWorker.getProductsByPrice(products, 10);

        assertEquals(1, Arrays.stream(productsByPrice).filter(Objects::nonNull).count());
    }

    @Test
    public void testIfNewProductWasAddedInsteadOfNullValue() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        //Product water = new Product("Water", 8);
        Product[] products = {milk, bread, cookies, null};

        shopWorker.addProduct(products, new Product("Chocolate", 20));

        assertEquals("Chocolate", products[0].name);
    }

    @Test
    public void testIfNewProductWasAddedToZeroPosition() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product water = new Product("Water", 8);
        Product[] products = {milk, bread, cookies, water};

        shopWorker.addProduct(products, new Product("Chocolate", 20));

        assertEquals("Chocolate", products[0].name);
    }
@Test
    public void testIfMostExpensiveProductIsReturn() {

        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product water = new Product("Water", 8);
        Product[] products = {milk, bread, cookies, water};

        Product mostExpensive = shopWorker.getMostExpensiveProduct(products);


        assertEquals(15, mostExpensive.price);

    }

@Test
    public void testIfArrayWasExpanded() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
        Product water = new Product("Water", 8);
        Product[] products = {milk, bread, cookies, water};

        Product[] expandedArray = shopWorker.addProductAndExpand(products, new Product("Beer", 20));
        Arrays.toString(expandedArray);
        assertEquals(8, expandedArray.length);
        assertNull(expandedArray[7]);
    }
    @Test
    public void testIfArrayWasNotExpanded() {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 15);
        Product cookies = new Product("Cookies", 8);
       // Product water = new Product("Water", 8);
        Product[] products = {milk, bread, cookies, null};

        Product[] expandedArray = shopWorker.addProductAndExpand(products, new Product("Beer", 20));

        assertEquals("Beer", expandedArray[3].name);
    }
    @Test
    public void testIfMethodReturnCorrectAmountOfEdibleProducts() {
        Product milk = new Product("Milk", 10, false);
        Product bread = new Product("Bread", 15, true);
        Product cookies = new Product("Cookies", 8, true);
        // Product water = new Product("Water", 8);
        Product[] products = {milk, bread, cookies};

        int counter = shopWorker.countEdibleProducts(products);

        assertEquals(2, counter);
    }

    @Test
    public void testIfMethodReturnTotalPrice() {
        Product milk = new Product("Milk", 10, false);
        Product bread = new Product("Bread", 15, true);
        Product cookies = new Product("Cookies", 8, true);
        Product[] products = {milk, bread, cookies};

        int totalPrice = shopWorker.getTotalProductPrice(products);

        assertEquals(0, totalPrice);
    }

}



