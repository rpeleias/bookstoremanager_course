package com.rodrigopeleias.bookstoremanager.publishers.mapper;

import com.rodrigopeleias.bookstoremanager.publishers.dto.PublisherDTO;
import com.rodrigopeleias.bookstoremanager.publishers.entity.Publisher;

public class PublisherMapper {

    public static Publisher toModel(PublisherDTO publisherDTO) {
        if (publisherDTO == null) {
            return null;
        }
        Publisher publisher = new Publisher();
        publisher.setId(publisherDTO.getId());
        publisher.setName(publisherDTO.getName());
        publisher.setCode(publisherDTO.getCode());
        publisher.setFoundationDate(publisherDTO.getFoundationDate());
        return publisher;
    }

    public static PublisherDTO toDTO(Publisher publisher) {
        if (publisher == null) {
            return null;
        }
        PublisherDTO publisherDTO = new PublisherDTO();
        publisherDTO.setId(publisher.getId());
        publisherDTO.setName(publisher.getName());
        publisherDTO.setCode(publisher.getCode());
        publisherDTO.setFoundationDate(publisher.getFoundationDate());
        return publisherDTO;
    }
}