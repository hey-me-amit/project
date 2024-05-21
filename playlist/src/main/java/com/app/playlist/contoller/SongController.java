package com.app.playlist.contoller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.playlist.dao.SongRepository;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.SongException;
import com.app.playlist.service.SongService;


/************************************************************************************
 *         @author            Manas Agarwal
 *         Description        It is a controller class which is responsible for processing incoming REST API
 *                            request. Also returns the response to the client/server making the request 
 *                            by mapping the request URL to a controller method. 
 *                        
 *         Version            1.0
 *         Created Date       8-Aug-2022
 ************************************************************************************/

@RestController
public class SongController {
	@Autowired
	private SongService songService;
	//private SongRepository songRepository;
	
	@GetMapping("song/{id}")
	public Song getSongById(@PathVariable("id") Integer id) throws SongException {
		return this.songService.getSongById(id);
	}
		
	@PostMapping("song")
	public Song addSong(@Valid @RequestBody Song song) throws SongException{
		return this.songService.addSong(song);
	}
	@GetMapping("songs")
	public List<Song> getAllSongs() throws SongException{
	
		return this.songService.getAllSongs();
	}
	@DeleteMapping("song/{id}")
	public void DeleteSongById(@PathVariable("id") Integer id) throws SongException {
	this.songService.deleteSongById(id);
	}
	@PutMapping("updateSong")
	public Song updateSong(@Valid @RequestBody Song song) throws SongException {
		return this.songService.updateSong(song);
	}
	
	
	}





