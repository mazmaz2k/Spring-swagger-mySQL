package com.example.omri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.omri.model.Note;



@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}