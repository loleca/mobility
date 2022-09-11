package Application;

import Catalogue.Catalogue;


public class Main {
    public static void main(String[] args) {

        Catalogue catalogue= new Catalogue();
        catalogue.readCarsFromFile("C:\\Users\\vikch\\Desktop\\mobility.txt");


        catalogue.printCatalogue();
        System.out.println("");

        catalogue.sortByBrand();
        catalogue.printCatalogue();

        catalogue.writeCatalogueToFile("C:\\Users\\vikch\\Desktop\\mobilityOUTPUT.txt");

    }

}