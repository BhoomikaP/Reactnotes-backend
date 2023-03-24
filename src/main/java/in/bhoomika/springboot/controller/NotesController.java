package in.bhoomika.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bhoomika.springboot.entity.Notes;
import in.bhoomika.springboot.repository.NotesRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class NotesController {
	@Autowired
	NotesRepository nRepo;
	@GetMapping("/notes")
	public ResponseEntity<List<Notes>> readNotes(){
		return new ResponseEntity<List<Notes>>(nRepo.findAll(),HttpStatus.OK);
	}
}
