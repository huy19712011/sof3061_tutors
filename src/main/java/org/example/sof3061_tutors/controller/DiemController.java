package org.example.sof3061_tutors.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.sof3061_tutors.dto.DiemDto;
import org.example.sof3061_tutors.entity.Diem;
import org.example.sof3061_tutors.service.DiemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diems")
@RequiredArgsConstructor
public class DiemController {

    private final DiemService diemService;

    //@GetMapping
    //public ResponseEntity<List<Diem>> getDiems() {
    //
    //    List<Diem> diems = diemService.getDiems();
    //
    //    //return new ResponseEntity<>(diems, HttpStatus.OK);
    //    return ResponseEntity.ok(diems);
    //
    //}

    @GetMapping
    public ResponseEntity<List<DiemDto>> getDiems() {

        List<DiemDto> diems = diemService.getDiems();

        //return new ResponseEntity<>(diems, HttpStatus.OK);
        return ResponseEntity.ok(diems);

    }

    @GetMapping("{id}")
    public ResponseEntity<Diem> getDiem(@PathVariable("id") long id) {

        Diem diem = diemService.getDiem(id);

        return ResponseEntity.ok(diem);
    }

    @PutMapping("{id}")
    public ResponseEntity<Diem> updateDiem(@Valid @RequestBody Diem diem, @PathVariable("id") long id) {

        Diem updatedDiem = diemService.updateDiem(diem, id);

        return ResponseEntity.ok(updatedDiem);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDiem(@PathVariable("id") long id) {

        diemService.deleteDiem(id);

        return ResponseEntity.ok("Deleted diem with id =" +id);
    }
}
