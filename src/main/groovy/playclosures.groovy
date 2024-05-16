// define function/closure (code) inside another function
def abc(i) {
    def j = 10
    def fn = {k -> (k ** i) + j} // a closure can access the enclosing function variables
    fn(10)
}

println abc(2)

// a function returning another function / code/ closure
def pqr(i) {
    def j = 10
    def fn = {k -> k + j - i}
    return fn
}
def f = pqr(10)
println f(2)

// a function / code / closure is passed as a parameter to another function
def mno(code) {
    def i = 10
    def j = 20
    code(i, j)
}

def cl = {a, b -> a + b - 5}
println mno(cl)