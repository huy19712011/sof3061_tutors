package org.example.sof3061_tutors.controller;

import lombok.RequiredArgsConstructor;
import org.example.sof3061_tutors.entity.Diem;
import org.example.sof3061_tutors.service.DiemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/diems")
@RequiredArgsConstructor
public class DiemController {

    private final DiemService diemService;

    @GetMapping
    public ResponseEntity<List<Diem>> getDiems() {

        List<Diem> diems = diemService.getDiems();

        //return new ResponseEntity<>(diems, HttpStatus.OK);
        return ResponseEntity.ok(diems);

    }

    @GetMapping("{id}")
    public ResponseEntity<Diem> getDiem(@PathVariable("id") long id) {

        Diem diem = diemService.getDiem(id);

        return ResponseEntity.ok(diem);
    }
}
