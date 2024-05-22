// Metaprogramming
List.metaClass.odds = {
    // current list object -- delegate
    delegate.findAll {it % 2}
}


def l = [4, 5, 2, 1, 6, 8, 9, 5, 7]

// a new list of odd elements from the above list
println l.odds()
