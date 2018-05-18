package me.rhyzox.mongo;

import java.util.function.Consumer;

import org.bson.Document;
import org.bukkit.plugin.java.JavaPlugin;

import me.rhyzox.mongoapi.MongoAPI;

public class Mongo extends JavaPlugin {
		
	@Override
	public void onEnable() {
		/*
		//MongoSync
		MongoAPI.getMongoManagerSync().connect("Username", "Password", "Host", "27017", "database", "collection");
		if(MongoAPI.getMongoManagerSync().get("name", "Jonas") == null) {
			MongoAPI.getMongoManagerSync().insert(new Document("name", "Jonas").append("coins", "200"));
		} else {
			System.out.println("Coins: " + MongoAPI.getMongoManagerSync().get("name", "Jonas").getString("coins"));
		}
		MongoAPI.getMongoManagerSync().update("coins", "100", "300");
		*/
		
		/*
		//MongoAsync
		MongoAPI.getMongoManagerAsync().connect("Username", "Password", "Host", "27017", "database", "collection");

		MongoAPI.getMongoManagerAsync().get("name", "Jonas", new Consumer<Object>() {
			@Override
			public void accept(Object obj) {
				Document doc = (Document) obj;
				if(doc == null) {
					MongoAPI.getMongoManagerAsync().insert(new Document("name", "Rhyzox").append("coins", "300"));
				} else {
					System.out.println(doc.get("coins"));
				}
			}
		});
		MongoAPI.getMongoManagerAsync().update("name", "Jonas", "Rhyzox");
		*/
		
	}
}
