require "date"

class Account
  attr_reader :balance, :transactions, :last_transaction_date

  def initialize()
    @balance = 0
    @transactions = []
  end

  def credit(amount)
    record_transaction(amount)
  end

  def debit(amount)
    record_transaction(-amount)
  end

  def last_transaction
    @transactions.last
  end

  private
    def record_transaction(amount)
      @balance += amount
      @transactions << Transaction.new(true, amount)
      @last_transaction_date = Date.today
    end

end
