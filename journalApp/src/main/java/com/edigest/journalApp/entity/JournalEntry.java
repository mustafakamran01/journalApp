package com.edigest.journalApp.entity;


import lombok.*;
import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
//import java.util.Date;

@Document(collection = "journal_entries")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
@NoArgsConstructor
/*
    All of the above annotations are covered by @Data.
    This annotation is provided by lombok.
*/
public class JournalEntry {

    @Id
    private ObjectId id;

    @NonNull
    private String title;

    private String content;

    private LocalDateTime date;


}
