package loteqgorm

class DemoController {
    AuthorService authorService
    def index() {
        authorService.retrieveCompleteAuthors()

        render 'Success'
    }
}
