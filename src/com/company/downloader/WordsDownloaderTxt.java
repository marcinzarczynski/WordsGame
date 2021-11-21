package com.company.downloader;

import java.io.*;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordsDownloaderTxt implements Downloader {


    @Override
    public Map<String, String> download(String path) throws IOException {
        return getWordsFromFile(path);
    }

    private Map<String, String> getWordsFromFile(String filePath) throws IOException {

        Map<String, String> map = new HashMap<String, String>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");

            String key = parts[0].trim();
            String value = parts[1].trim();

            if (!key.equals("") && !value.equals(""))
                map.put(key, value);
        }
        return map;
    }
}
