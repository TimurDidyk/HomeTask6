package com.example.demo;

import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;

@Entity
@Table(name = "Книга")
@NamedQueries({
        @NamedQuery(query = "Назва книги", name = Book.Find_By_Name),
        @NamedQuery(query = "Автор книги", name = Book.Find_By_Author)
})

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {

    public static final String Find_By_Name="Book.Find_By_Name";
    public  static final String Find_By_Author="Book.Find_By_Author";


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Назва")
    private String name;

    @Column(name = "Автор")
    private String author;

    Book(String name, String author){
        this.name=name;
        this.author=author;
    }

    public String getName(){
        return this.name;
    }
    }
    public String getAuthor(){
        return this.author;
    }
    public String toString(){
        return this.name+"  "+ this.author+"\n";
    }

}

