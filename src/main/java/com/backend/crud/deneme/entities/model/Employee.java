package com.backend.crud.deneme.entities.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@Entity
@Table(name = "employee")


@NoArgsConstructor          // Referansı olmayan yapılar
@AllArgsConstructor         // Referansı olan yapılar
                            // Serializable implementasyonu olmadan çalışmadı.
@Setter                     // silebilmem için konumlandırdım

public class Employee implements Serializable {

    @Id
    @SequenceGenerator(name = "Personal_Info", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "Personal_Info", strategy = GenerationType.IDENTITY)
    @Column(nullable = true)
    private long id;
    public String name;
    public String surname;
    public String city;
    public String phone;
    @Column(precision = 2)      //virgülden sonra kaç olsun //**** olmadı göremedim ****
    private double tax;
    @Column(precision = 2)
    private double amount;


}
