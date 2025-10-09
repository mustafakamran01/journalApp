package com.edigest.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String userName;
    /*
        @Indexed(unique = true) -> By adding this annotation, the userName should be unique
        @NonNull -> By adding this annotation, the given field should not be null,
                    and if it is null, it will give null pointer exception
     */

    @NonNull
    private String password;

    @DBRef
    private List<JournalEntry> journalEntries = new ArrayList<>();
    /*
        With this annotation, we are creating reference of Journal entry table and user table
        It is basically working as a foreign key.
     */
}
