package org.mongo_java;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;
import java.util.Set;

public class App {

    public static void main(String[] args) throws UnknownHostException {
        final MongoClient mongoClient = new MongoClient();
        final DB db = mongoClient.getDB( "testdb" );
        //listAllCollections(db);

    }

    @SuppressWarnings("UnusedDeclaration")
    static void listAllCollections(final DB db) {
        final Set<String> colls = db.getCollectionNames();
        for (String s : colls) {
            System.out.println(s);
        }
    }
}
