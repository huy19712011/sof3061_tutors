package org.example.sof3061_tutors.service;

import org.example.sof3061_tutors.entity.Diem;

import java.util.List;

public interface DiemService {

    List<Diem> getDiems();

    Diem getDiem(long id);
}
