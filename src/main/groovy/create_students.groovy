import com.abc.salary.SalaryCalculator
import com.r.colllege.domain.Professor
import com.r.colllege.domain.Student

println Student.count // 0

// if the Map keys are proper strings, we can drop the quotes around it
// def s1 = new Student(name: 'mehul', contactNos: ['9867896896', '987689696'], gender: 'm', roll: 10)
def s1 = Student.createInstance name: 'mehul', contactNos: ['9867896896', '987689696'], gender: 'm', roll: 10

/* s1.name = 'mehul'
s1.roll = 10
s1.gender = 'm'
s1.contactNos = ['9867896896', '987689696'] */

println Student.count // 1

def s2 = new Student(name: 'jane', roll: 23, gender: 'f')
s2 << '786867858' << '98798769' // Internally s2.leftShift('786867858')
s2.gender = 'x' // internally s2.setGender('x')
// s2.setGender('x')
println s2.gender // M | F // internally s2.getGender()
s2.roll = 12 // Internally s2.setRoll(-1)

// s2.addContact('786867858')
// s2.addContact('98798769')

// s1.addContact('889687687')
/* def s2 = new Student()
s2.name = 'jane'
s2.roll = 23
s2.gender = 'f' */

/* println s1.name
println s1.gender
println s1.contactNos

println s2.name
println s2.gender */

// s1.displayDetails()
s2.displayDetails()

// s1.printContactNos()
// s2.printContactNos()


// println Student.count // 2

def p1 = new Professor(
        name: 'mehul',
        gender: 'm',
        subjects: ['Physics','Chemistry'],
        contactNos: ['97868768765'],
        perDayCost: 5000,
        noOfDaysInMonth: 16
)
p1 << '87867868'
// println p1.contactNos
p1.displayDetails()

println p1.calculate()

// println SalaryCalculator.calculate(p1)







