package by.aipos.aipos_lab2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Table(name = "RentCompanies")
@NoArgsConstructor
@Entity
public class RentCompany {

    @Id
    private int id;

    @Column(name = "name")
    private String name;
}
