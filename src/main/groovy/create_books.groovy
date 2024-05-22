import com.r.colllege.domain.Author
import com.r.colllege.domain.Book
import com.r.colllege.domain.Contact

/* def b1 = new Book(
        title: 'Book 1',
        price: 1000,
        pages: 560,
        authors: [
                new Author(
                        name: 'mehul',
                        gender: 'm',
                        ratings: 4,
                        contact: new Contact(email: 'mehulc@hey.com', mobile: '9789879', faxNo: '34535345')
                ),
                new Author(
                        name: 'jane',
                        gender: 'f',
                        ratings: 5,
                        contact: new Contact(email: 'jane@hey.com', mobile: '887989', faxNo: '1232312')
                )
        ]
) */

// ObjectGraphBuilder
def ogb = new ObjectGraphBuilder(classNameResolver: 'com.r.colllege.domain')

def obj = ogb.book(title: 'Book 1', price: 1000, pages: 560, aliasNames: ['the book', 'my book']) {
    author(name: 'mehul', gender: 'm', ratings: 4) {
        contact email: 'mehulc@hey.com', mobile: '9798798', faxNo: '43534534'
    }
    author(name: 'jane', gender: 'f', ratings: 5) {
        contact email: 'jane@hey.com', mobile: '87869', faxNo: '34234234'
    }
    contact(email: 'ashitosh@gmail.com', mobile: '9868689')
    contact(email: 'prachi@gmail.com', mobile: '98687687')
}


println obj
