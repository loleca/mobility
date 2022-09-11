package Catalogue;

import Models.Car;
import Models.ElectricCar;
import Models.GasCar;
import Models.HybridCar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Catalogue {

    private ArrayList<Car> list = new ArrayList<>();


    public void sortByBrand(){

        Comparator<Car> byBrand = (Car car1, Car car2) -> car1.getBrand().compareTo(car2.getBrand());
        list.sort(byBrand);
    }



    public void readCarsFromFile(String pathToFile){

        ArrayList<String> fromFile = readFileByRows(pathToFile);
        for (String s: fromFile){
            list.add(convertStringToCar(s));
        }
    }

    public void writeCatalogueToFile(String pathToFile){

        try(BufferedWriter bw=Files.newBufferedWriter(Paths.get(pathToFile))) {

            for (Car car: list) {
                bw.write(car.toString());
                bw.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void printCatalogue(){
        for (Car car:list) {
            System.out.println(car);
        }
    }

    public ArrayList<String> readFileByRows(String pathToFile){

        ArrayList<String> fromFile= new ArrayList<>();

        try(BufferedReader br= Files.newBufferedReader(Paths.get(pathToFile))){

            fromFile= (ArrayList<String>) br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return fromFile;
    }
private Car convertStringToCar(String carString){

        String[] carList = carString.split(", ");
        String brand, model;
        int price, powerEngine, capacity;
        float engineDis;

        String[] beginning = carList[0].split(" ");
        String keyWord = beginning[0];
        brand=beginning[1];
        model=carList[1];
        String priceAsString=carList[carList.length-1].replace(" euro","");
        price=Integer.parseInt(priceAsString);



        switch (keyWord){
            case "ELECTRIC_CAR": powerEngine= Integer.parseInt(carList[2].replace("KW",""));
                                 capacity=Integer.parseInt(carList[3].replace("Ah",""));
                                 return new ElectricCar(brand,model,powerEngine,price,capacity);

            case "GAS_CAR":      engineDis=Float.parseFloat(carList[2].replace("L",""));
                                 powerEngine=Integer.parseInt(carList[3].replace("KW",""));
                                 return new GasCar(brand,model,powerEngine,price,engineDis);

            case "HYBRID_CAR":   engineDis=Float.parseFloat(carList[2].replace("L",""));
                                 powerEngine=Integer.parseInt(carList[3].replace("KW",""));
                                 capacity=Integer.parseInt(carList[4].replace("Ah",""));
                                 return new HybridCar(brand,model,powerEngine,price,capacity,engineDis);
        }
return null;
}
}