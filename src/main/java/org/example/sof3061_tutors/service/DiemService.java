package org.example.sof3061_tutors.service;

import org.example.sof3061_tutors.dto.DiemDto;
import org.example.sof3061_tutors.entity.Diem;

import java.util.List;

public interface DiemService {

    //List<Diem> getDiems();
    List<DiemDto> getDiems();

    Diem getDiem(long id);

    Diem updateDiem(Diem diem, long id);

    void deleteDiem(long id);
}
