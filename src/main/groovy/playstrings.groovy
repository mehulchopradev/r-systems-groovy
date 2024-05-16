def msg = 'good morning'
def fullName = "mehul chopra"
def welcome = "Welcome $fullName"
def msg2 = 'good night to all. have a good good night'

def s = '''
    select username, gender
    from student
    where student.roll = 10
'''
println s

// character at a specific index
println msg[0]
println msg[4]
println msg[-1] // negative indexing works!
println msg[-3]

// substring
println fullName[0..4]
println fullName[-6..-1]
println fullName[0..-1]

// print the characters of the string line by line
for (def ch in msg) {
    println ch
}

println fullName.size()
println fullName.capitalize() // like in java, String is immutable
println fullName.toUpperCase()
println msg.startsWith("good")
println msg.endsWith('night')
println msg.contains('ood')
println msg2.count('good')

def age = '37'
println age.isNumber()

def a = '34sdfsdf'
println a.isNumber()

def fi = '            '
println fi.isAllWhitespace()
println fi.isBlank()

def fii = ''
println fii.isAllWhitespace()
println fii.isBlank()

def employee = '           mehul,10,m          '
println employee.strip()


// string equality
def s1 = 'mehul'
def s2 = 'me' + 'hu' + 'l';
def s3 = s1
def s4 = 'mehul'

println s1.is(s2) // compares the addresses of the string
println s1 == s2 // compares the contents of the string
println s1.is(s3) // compares the addresses
println s1.is(s4)
println s1 === s2 // address check
println s1 === s4 // address check


