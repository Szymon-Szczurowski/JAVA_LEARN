package com.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryFileReader {


    private String file;
    
    public DictionaryFileReader(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }
    public String setFile() {
        return file;
    }

    public String getRawFileData() throws IOException {

        String expected_value=new String();
        String file = getFile();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Stream<String> lines = Files.lines(Path.of(file));
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();
        reader.close();
        return data;

    }

    public List<String> getDictionaryValues() throws IOException {
//        File file = new File();
//        List < String > list = Files.lines(Paths.get(file.getAbsolutePath()), StandardCharsets.ISO_8859_1).collect(Collectors.toList());
//
//        List < Object > objs = new ArrayList< >();
//
//        try {
//            for (String s: list)
//                objs.add(Class.forName(s).newInstance());
//        } catch(Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        List < String > listFeed = new ArrayList < >();
//
//        for (Object l: objs) {
//            if (l instanceof String)
//                listFeed.add((String) l);
//        }
        String data = getRawFileData();

        return data;
    }
}


//    public boolean getRawFileData() {
//        try {
//            String plikDane;
//            Scanner skaner = new Scanner(plikDane);
//            while (skaner.hasNextLine()) {
//                odczyt = odczyt + skaner.nextLine() + "\n";
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Brak Pliku do odczytania!");
//        }
//        return odczyt;
//    }
//
//}
//

