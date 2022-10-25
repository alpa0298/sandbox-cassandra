package edu.sandbox.cassandra.library.shell;

import edu.sandbox.cassandra.library.domain.Author;
import edu.sandbox.cassandra.library.repository.TestRepository;
import edu.sandbox.cassandra.library.services.AuthorsService;
import edu.sandbox.cassandra.library.shell.argumentmappers.AuthorArgumentMapper;
import edu.sandbox.cassandra.library.shell.responsemappers.ToStringResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import static java.lang.String.format;

/*
    Example commands:
        a
        a_id 1
        c_a new-author
        u_a -i 1 -n changed_name
        d_a_id 5
 */
@ShellComponent
@RequiredArgsConstructor
public class AuthorsShellController {

    private final AuthorsService authorsService;
    private final TestRepository testRepository;
    private final AuthorArgumentMapper authorArgumentMapper;
    private final ToStringResponseMapper<Author> authorToStringResponseMapper;

    @ShellMethod(value = "Runs test method", key = {"test"})
    public void test() {
        testRepository.test();
    }

    @ShellMethod(value = "Finds all authors", key = {"authors", "a"})
    public String findAll() {
        return authorToStringResponseMapper.map(authorsService.findAll());
    }

    @ShellMethod(value = "Finds author by id", key = {"author_by_id", "a_id"})
    public String findById(@ShellOption("-i") String id) {
        return authorsService.findById(id)
                .map(authorToStringResponseMapper::map)
                .orElse(format("Can't find author by id %s", id));
    }

    @ShellMethod(value = "Creates author", key = {"create_author", "c_a"})
    public String create(@ShellOption("-n") String name) {
        edu.sandbox.cassandra.library.domain.Author author = authorArgumentMapper.map(name);
        return authorToStringResponseMapper.map(authorsService.save(author));
    }

    @ShellMethod(value = "Updates author", key = {"update_author", "u_a"})
    public String update(@ShellOption("-i") String id, @ShellOption("-n") String name) {
        edu.sandbox.cassandra.library.domain.Author author = authorArgumentMapper.map(id, name);
        return authorToStringResponseMapper.map(authorsService.save(author));
    }

    @ShellMethod(value = "Deletes author by id", key = {"delete_author_by_id", "d_a_id"})
    public void deleteById(@ShellOption("-i") String id) {
        authorsService.deleteById(id);
    }
}