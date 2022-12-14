package edu.sandbox.cassandra.library.shell.responsemappers.impl;

import edu.sandbox.cassandra.library.shell.responsemappers.ToStringResponseMapper;
import org.springframework.stereotype.Service;
import edu.sandbox.cassandra.library.domain.Book;
import edu.sandbox.cassandra.library.domain.Comment;

import static java.lang.String.format;

@Service
public class CommentToStringResponseMapper implements ToStringResponseMapper<Comment> {

    @Override
    public String map(Comment comment) {
        Book book = comment.getBook();
        return format("id: %s | text: %s | book: {id: %s | title: %s}",
                comment.getId(), comment.getText(), book.getId(), book.getTitle());
    }
}
