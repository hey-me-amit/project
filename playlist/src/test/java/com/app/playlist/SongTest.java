package com.app.playlist;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.playlist.dao.SongRepository;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.SongException;
import com.app.playlist.service.SongService;


class SongTest{
	
	@Autowired
	private SongService songService;
	
	@Autowired
	SongRepository songRepository;
	
	Song song=new Song(1,2022,"Song1","Tseries",(float)2.5,"Arijit",10,"Album1");
	@Test
	 void addSong() throws SongException, SQLException {
		
		
		assertNotNull(this.songService.addSong(song));
		assertThrows(SongException.class,()->this.songService.addSong(null));		
		
	}
		
	@Test
	public void getSongByIdTest() throws SongException, SQLException {
		assertNotNull(this.songService.addSong(song));
//		assertNotNull(this.songService.getSongById(song.getId()));
		assertThrows(SongException.class,()->this.songService.getSongById(0));
	}
	
	@Test
	public void updateSongTest() throws SongException, SQLException {
		assertNotNull(this.songService.addSong(song));
		//song.setSongTitle("New Song");
		
	}
	
	@Test
	public void deleteSongTest() throws SongException, SQLException {
		assertNotNull(this.songService.addSong(song));
//		assertEquals("Successful",this.songService.deleteSongById(song.getId()));
		assertThrows(SongException.class,()->this.songService.deleteSongById(0));
		
		
	}
	
	@Test
	public void getAllSongsTest() throws SongException, SQLException {
		assertNotNull(this.songService.addSong(song));
		assertNotNull(this.songService.getAllSongs());
	}
	}
	
		
	


