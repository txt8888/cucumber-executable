package org.phan.util;

import io.restassured.path.json.JsonPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/**
 * Created by tcp on 09/19/2019.
 */
public class ResourceFile {
    public static Map getJsonPathMapFromFile(String filename) {
        File file = getResourceFile(filename);
        return new JsonPath(file).getMap("");
    }

    public static String getJsonStringFromFile(String filename) {
        File   file = getResourceFile(filename);
        byte[] data = new byte[(int) file.length()];
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.read(data);
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return new String(data);
    }

    public static File getResourceFile(String filename) {
        return new File(Objects.requireNonNull(ResourceFile.class.getClassLoader().getResource(filename)).getFile());
    }
}
