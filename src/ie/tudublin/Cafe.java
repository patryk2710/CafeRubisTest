/* Patryk Rojowiec
C18437596
*/
package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Cafe extends PApplet {

    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<Product> bill = new ArrayList<Product>();

    public void loadData() {
        Table table = loadTable("cafe.csv", "header");
        for(TableRow row:table.rows()) {
            Product p = new Product(row);
            products.add(p);
        }
    }

    public void printProducts() {
        for(Product p:products) {
            System.out.println(p);
        }
    }

    public void settings() {
        size(800,600);
    }

    public void setup() {
        loadData();
        printProducts();
    }

}
