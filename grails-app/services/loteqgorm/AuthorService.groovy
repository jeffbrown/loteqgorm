package loteqgorm

import grails.gorm.services.Query
import grails.gorm.services.Service

@Service(Book)
abstract class AuthorService {

    @Query("""
            select a.*, count(a.id)
            from ${Book b} join ${b.author} a
            group by a.numberOfKnownBooks, a.id
            having count(*) = a.numberOfKnownBooks
""")
    abstract List<Author> retrieveCompleteAuthors()
}