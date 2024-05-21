//package com.app.playlist;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.app.playlist.dao.PlaylistRepository;
//import com.app.playlist.dto.Playlist;
//import com.app.playlist.dto.Song;
//import com.app.playlist.exception.PlaylistException;
//import com.app.playlist.service.PlaylistServiceImpl;
//@SpringBootTest
//public class PlaylistTest {
//	
//	@Autowired 
//	private PlaylistServiceImpl playlistService;
//	
//
//		
//	@Test
//	public void getPlaylistByIdTest() throws PlaylistException,SQLException {
//		//Playlist playlist = playlistService.getPlaylistById(12);
//		assertThrows(PlaylistException.class,
//				()->playlistService.getPlaylistById(12));
//	
//	}
//	@Test
//	public void getPlaylistByIdTesti_negative() throws PlaylistException,SQLException {
//		
//		
//				playlistService.getPlaylistById(15);
//	
//	}
////@Test
////	public void updatePlaylistByIdTest() throws PlaylistException,SQLException {
////		Playlist playlist = playlistService.updatePlaylist(12);
////		assertThrows(PlaylistException.class,
////				()->playlistService.updatePlaylist(playlist));
////	
////	}
//	@Test
//	public void updatePlaylistByIdTesti_negative() throws PlaylistException,SQLException {
//		Playlist playlist = playlistService.getPlaylistById(13);
//		assertNotNull(
//				playlistService.updatePlaylist(playlist));
//	
//	}
//	@Test
//	public void deletePlaylistByIdTest() throws PlaylistException,SQLException {
//		//Playlist playlist = playlistService.getPlaylistById(12);
//		assertThrows(PlaylistException.class,
//				()->playlistService.deletePlaylistById(12));
//	
//	}
//	@Test
//	public void deletePlaylistByIdTesti_negative() throws PlaylistException,SQLException {
//		playlistService.deletePlaylistById(22);
//	
//	}
//
//	
////	@Test
////	public void getAllPlaylistsTest() throws PlaylistException,SQLException{
////		
////		assertNotNull(this.playlistService.getAllPlaylists());
////	}
//	
//
//
//}
