package _19_generics_set_map._212_como_treeset_compara_elementos.application;

import _19_generics_set_map._212_como_treeset_compara_elementos.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for(Product p: set) {
            System.out.println(p);
        }
    }
}
