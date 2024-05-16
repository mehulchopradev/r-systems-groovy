def n = 56

// while loop
/* def i = 0
while (i <= n) {
    if (i % 2) {
        println i
    }
    i++
} */

// for loop
/* for (def i = 0; i <=n; i++) {
    if (i % 2) { println i}
} */

// groovy for loop
/*
for (def v in <<sequence of elements>>) {
    // I1
    // I2
}
 */

// 0..n
println "The odd numbers till $n are: " // GStringImpl
for (def v in 0..n) {
    /* if (v == 7) {
        continue // - works!!
    } */
    if (v % 2) { println v }
    /* if (v == 21) {
        break // -- works!
    } */
}