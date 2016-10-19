package org.stripesbook.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * Usually in a different package than your ActionBean code
 */
public class BusinessLogicClass {
    
    public List<String> getProducts(){
        List<String> products = new ArrayList<String>();
        
        //products = productsDataAccessObject.selectAllProducts();
        
        products.add("Forks");
        products.add("Knifes");
        products.add("Spoons");
        products.add("Plates");
        products.add("Napkins");
        products.add("Roof Shingles");
        return products;
    }
}
