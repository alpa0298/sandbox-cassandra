package edu.sandbox.cassandra.library.services;

import edu.sandbox.cassandra.library.core.operations.CrudOperations;
import edu.sandbox.cassandra.library.domain.Comment;

import java.util.List;

public interface CommentsService extends CrudOperations<Comment> {

    List<Comment> findCommentsByBookId(String id);
}
