package com.chaiLab11.songr;

import com.chaiLab11.songr.Song;
import com.chaiLab11.songr.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String getAllSongs(Model m) {
        Iterable<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "Song";
    }

    @GetMapping("/songs/new")
    public String getAddSongForm() {
        return "SongForm";
    }

    @PostMapping("/songs")
    public RedirectView addSong(@RequestParam String title, @RequestParam  int trackNumber, @RequestParam int length,@RequestParam Album album) {
        Song song = new Song(title,trackNumber,length,album);
        songRepository.save(song);
        return new RedirectView("/songs");
    }

}