package com.iissoftware.springbootmongodb.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "photo")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Photo {

    @Id
    private String id;
    private String title;
    private Binary photo;
	public Photo() {
		super();
	}
	public Photo(String id, String title, Binary photo) {
		super();
		this.id = id;
		this.title = title;
		this.photo = photo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Binary getPhoto() {
		return photo;
	}
	public void setPhoto(Binary photo) {
		this.photo = photo;
	}
    
}
