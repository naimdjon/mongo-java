package org.mongo_java;

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

public class MongoTest {

    public static void main(String[] args) throws UnknownHostException {
        final MongoClient mongoClient = new MongoClient();
        final DB db = mongoClient.getDB( "test" );
        DBCollection users = db.getCollection("test");
        printAllDocuments(users);
//        BasicDBObject query = new BasicDBObject();
//        query.put("name",  java.util.regex.Pattern.compile("Hard Working", java.util.regex.Pattern.CASE_INSENSITIVE));
//        DBCursor dbObjects = users.find(query);
//        //listAllCollections(db);
//        printCursor(dbObjects);
    }

    public static void printAllDocuments(DBCollection collection)
    {
        List<DBObject> list = collection.find().toArray();
        System.out.println(list);
    }

    private static void printCursor(DBCursor dbObjects) {
        while (dbObjects.hasNext()) {
            DBObject next = dbObjects.next();
            System.out.println(next);
        }
    }


    @SuppressWarnings("UnusedDeclaration")
    static void listAllCollections(final DB db) {
        final Set<String> colls = db.getCollectionNames();
        for (String s : colls) {
            System.out.println(s);
        }
    }
}
