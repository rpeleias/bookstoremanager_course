package com.rodrigopeleias.bookstoremanager.books.mapper;

import com.rodrigopeleias.bookstoremanager.author.entity.Author;
import com.rodrigopeleias.bookstoremanager.books.dto.BookRequestDTO;
import com.rodrigopeleias.bookstoremanager.books.dto.BookResponseDTO;
import com.rodrigopeleias.bookstoremanager.books.entity.Book;
import com.rodrigopeleias.bookstoremanager.publishers.entity.Publisher;

public class BookMapper {

    public static Book toModel(BookRequestDTO bookRequestDTO) {
        if (bookRequestDTO == null) {
            return null;
        }

        Book book = new Book();
        book.setId(bookRequestDTO.getId());
        book.setName(bookRequestDTO.getName());
        book.setIsbn(bookRequestDTO.getIsbn());
        book.setPublisher(getPublisherFromDTO(bookRequestDTO.getPublisherId()));
        book.setAuthor(getAuthorFromDTO(bookRequestDTO.getAuthorId()));
        book.setPages(bookRequestDTO.getPages());
        book.setChapters(bookRequestDTO.getChapters());
        return book;
    }

    private static Author getAuthorFromDTO(Long authorId) {
        Author author = new Author();
        author.setId(authorId);
        return author;
    }

    private static Publisher getPublisherFromDTO(Long publisherId) {
        Publisher publisher = new Publisher();
        publisher.setId(publisherId);
        return publisher;
    }

    public static Book toModel(BookResponseDTO bookResponseDTO) {
        if (bookResponseDTO == null) {
            return null;
        }
        Book book = new Book();
        book.setId(bookResponseDTO.getId());
        book.setName(bookResponseDTO.getName());
        book.setIsbn(bookResponseDTO.getIsbn());
        book.setPublisher(getPublisherFromDTO(bookResponseDTO.getPublisher().getId()));
        book.setAuthor(getAuthorFromDTO(bookResponseDTO.getAuthor().getId()));
        book.setPages(bookResponseDTO.getPages());
        book.setChapters(bookResponseDTO.getChapters());
        return book;
    }

    public static BookResponseDTO toDTO(Book book) {
        if (book == null) {
            return null;
        }
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        bookResponseDTO.setId(book.getId());
        bookResponseDTO.setName(book.getName());
        bookResponseDTO.setIsbn(book.getIsbn());
//        bookResponseDTO.setPublisher(book.getPublisher().getId());
//        bookResponseDTO.setAuthor(book.getAuthor());
        bookResponseDTO.setPages(book.getPages());
        bookResponseDTO.setChapters(book.getChapters());
        return bookResponseDTO;
    }
}