package org.example.sof3061_tutors.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.sof3061_tutors.entity.Diem;
import org.example.sof3061_tutors.exception.ResourceNotFoundException;
import org.example.sof3061_tutors.repository.DiemRepository;
import org.example.sof3061_tutors.service.DiemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiemServiceImpl implements DiemService {

    private final DiemRepository diemRepository;

    @Override
    public List<Diem> getDiems() {
        return diemRepository.findAll();
    }

    @Override
    public Diem getDiem(long id) {

        //return diemRepository.findById(id).get();
        return diemRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Diem not found with id = " + id));
    }
}
