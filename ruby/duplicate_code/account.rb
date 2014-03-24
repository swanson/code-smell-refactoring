require "date"

class Account
  attr_reader :balance, :transactions, :last_transaction_date

  def initialize()
    @balance = 0
    @transactions = []
  end

  def credit(amount)
    @balance += amount
    @transactions << Transaction.new(true, amount)
    @last_transaction_date = Date.today
  end

  def debit(amount)
    @balance -= amount
    @transactions << Transaction.new(true, -amount)
    @last_transaction_date = Date.today
  end

  def last_transaction
    @transactions.last
  end
end
