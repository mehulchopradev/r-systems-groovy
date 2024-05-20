import com.r.banking.domain.Account

def a = new Account(accType: 'Savings', accNumber: 1234, balance: 10000)
println a + 5000
println a - 4000