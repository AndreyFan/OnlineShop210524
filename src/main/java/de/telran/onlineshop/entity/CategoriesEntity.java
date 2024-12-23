package de.telran.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Categories")  // указываем соответсвующее имя в БД
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CategoriesEntity {
    @Id
    @Column(name= "CategoryID")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "Name")
    private String name;


    @OneToMany(mappedBy = "category")
    private Set<ProductsEntity> products = new HashSet<>();

    public CategoriesEntity(Long categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }
}

