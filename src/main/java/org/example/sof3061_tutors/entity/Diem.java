package org.example.sof3061_tutors.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Diem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String maDiem;

    @ManyToOne
    private SinhVien sinhVien;

    private String monHoc;

    @Min(value = 0, message = "diemSo must be >= 0")
    private double diemSo;

}
