// a dummy database of students
// every student has name, gender, roll
def students = [
        Tuple.tuple('mehul', 'm', 10),
        Tuple.tuple('jane', 'f', 5),
        Tuple.tuple('rahul', 'm', 23),
        Tuple.tuple('rock', 'm', 25)
]

def scanner = new Scanner(System.in) // java.util and many other packages are auto imported in groovy
println "Please enter the roll number to search: "
def roll = scanner.nextInt()


def student = students.find {it.v3 == roll}
println student ?: "Not found"


