// a dummy database of students
// every student has name, gender, roll
def students = [
        10: Tuple.tuple('mehul', 'm', 10),
        5: Tuple.tuple('jane', 'f', 5),
        23: Tuple.tuple('rahul', 'm', 23),
        25: Tuple.tuple('rock', 'm', 25)
]

def scanner = new Scanner(System.in) // java.util and many other packages are auto imported in groovy
println "Please enter the roll number to search: "
def roll = scanner.nextInt()

def student = students[roll]
println student ?: "Not found"


