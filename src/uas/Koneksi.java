/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author firda
 * 
 */
public class Koneksi {
    public static MongoDatabase sambungDB() {
        try {
            MongoClient client = MongoClients.create();
            MongoDatabase database = client.getDatabase("penginapan");
            System.out.println("Koneksi Sukses!");
            return database;
        } catch (Exception e) {
            System.out.println("Koneksi Gagal!"+ e.getMessage());
        }
        return null;
    }
}
