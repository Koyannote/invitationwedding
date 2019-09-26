package com.example.invitation.repository;

import com.example.invitation.model.Invitation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvitationRepository extends MongoRepository<Invitation,String> {




}
