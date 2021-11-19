package com.company.downloader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class WordsDownloaderTxt implements Downloader {


    @Override
    public Map<String, String> Download(String path) {
        return getWordsFromFile(path);
    }

    private Map<String, String> getWordsFromFile(String filePath) {

        Map<String, String> map = new HashMap<String, String>();

        try {
            File file = new File(filePath);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = null;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");

                String key = parts[0].trim();
                String value = parts[1].trim();

                if (!key.equals("") && !value.equals(""))
                    map.put(key, value);

            }
        }
        catch(Exception e){
                e.printStackTrace();
            }
      return map;


    }
}
