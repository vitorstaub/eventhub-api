package br.com.eventos.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestDTO(String title, String description, Date date, String city, String uf, String eventUrl, MultipartFile image) {
}
