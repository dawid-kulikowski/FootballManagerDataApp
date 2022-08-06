package application;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        List<List<String>> records = new ArrayList<List<String>>();

        CSVReader csvReader = new CSVReader(new FileReader("/Users/dawidkulikowski/Desktop/JAVA/variables.csv"));


                String[] values = null;
        while ((values = csvReader.readNext()) != null) {
            records.add(Arrays.asList(values));
        }
        for(int i = 0; i < records.size(); i++) {
            System.out.println(records.get(i));
        }
//        records.stream()
//                .filter->)
        //        CsvToBean<Player> build = new CsvToBeanBuilder<Player>(csvReader)
//                .withSeparator(',')
//                .withType(Player.class)
//                .build()
    }

}
