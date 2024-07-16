package com.rodrigopeleias.bookstoremanager.author.mapper;

import com.rodrigopeleias.bookstoremanager.author.dto.AuthorDTO;
import com.rodrigopeleias.bookstoremanager.author.entity.Author;

public class AuthorMapper {

    public static Author toModel(AuthorDTO authorDTO) {
        if (authorDTO == null) {
            return null;
        }
        Author author = new Author();
        author.setId(authorDTO.getId());
        author.setName(authorDTO.getName());
        author.setAge(authorDTO.getAge());
        return author;
    }

    public static AuthorDTO toDTO(Author author) {
        if (author == null) {
            return null;
        }
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        authorDTO.setAge(author.getAge());
        return authorDTO;
    }
}