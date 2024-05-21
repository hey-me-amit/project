package com.app.playlist;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.app.playlist.dao.PlaylistRepository;
import com.app.playlist.dto.Playlist;
import com.app.playlist.dto.Song;
import com.app.playlist.exception.PlaylistException;
import com.app.playlist.service.PlaylistServiceImpl;
@ExtendWith(MockitoExtension.class)
@DataJpaTest
class PlaylistTest1 {

	@InjectMocks 
	private PlaylistServiceImpl playlistService;
	@Mock 
	private PlaylistRepository playlistRepository;
	@Mock 
	private Playlist playlist;
	
	

		
	@Test 
	void createPlaylist()throws PlaylistException,SQLException {
		Playlist playlist = PlaylistTest1.playlistUtil();
		Mockito.when(playlistRepository.save(any())).thenReturn(playlist);
		playlistService.createPlaylist(playlist);
		Assertions.assertNotNull(playlist);
		
	}
	@Test
	public void getPlaylistByIdTest() throws PlaylistException,SQLException {
		Playlist playlist = PlaylistTest1.playlistUtil();
		Mockito.when(playlistRepository.findById(any())).thenReturn(Optional.of(playlist));
		playlistService.getPlaylistById(playlist.getPlayListId());
		assertNotNull(playlist);
	
	}
//	@Test
//	public void updatePlaylistTest() throws PlaylistException,SQLException {
//		assertNotNull(this.playlistService.createPlaylist(playlist));
//		
//	}
//	@Test
//	public void getAllPlaylistsTest() throws PlaylistException,SQLException{
//		assertNotNull(this.playlistService.createPlaylist(playlist));
//		assertNotNull(this.playlistService.getAllPlaylists());
//	}
	public static Playlist playlistUtil() {
		Playlist playlist = new Playlist();
		playlist.setCreatedAt(12);
		playlist.setCreatedById(12);
		playlist.setCreatedByName("abc");
		playlist.setDescription("abc");
		playlist.setPlayListId(12);
		playlist.setSongCount(12);
		playlist.setSongs(song());
		return playlist;
	}
	public static List<Song> song() {
		List<Song> songs = new ArrayList<>();
		Song song  = new Song();
	    song.setSongid(12);
	    song.setTitle("song");
	    song.setAlbumId(12);
	    song.setAlbumName("album");
	    song.setCreatedAt(12);
	    song.setDescription("abc");
	    song.setLength(2.3f);
	    song.setArtistName("Album");
	    song.setSongid(12);
	    songs.add(song);
		return songs;
	}


}

