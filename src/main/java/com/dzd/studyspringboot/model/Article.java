package com.dzd.studyspringboot.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document(collection="article")//集合名
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article  implements Serializable {

    private static final long serialVersionUID = -8985545025018238754L;

    @Id
    private String id;

    @Indexed
    private String author;
    private String title;
    @Field("msgContent")
    private String content;

    @CreatedDate
    private Date createTime;
    private List<Reader> reader;


}