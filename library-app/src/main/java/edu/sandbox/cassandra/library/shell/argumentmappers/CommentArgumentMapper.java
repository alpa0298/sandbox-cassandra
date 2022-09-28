package edu.sandbox.cassandra.library.shell.argumentmappers;

import edu.sandbox.cassandra.library.domain.Comment;

public interface CommentArgumentMapper {

    Comment map(String bookId, String text);

    Comment map(String id, String bookId, String text);
}
