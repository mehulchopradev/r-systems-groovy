String.metaClass.csvify = {
    delegate.replaceAll ' ', ','
}


def studentStr = 'mehul 10 m 90 india'
// convert this string to a csv string
def n = studentStr.csvify()
println n
