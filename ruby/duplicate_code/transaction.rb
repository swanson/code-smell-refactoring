class Transaction
  attr_reader :is_debit, :amount

  def initialize(is_debit, amount)
    @is_debit = is_debit
    @amount = amount
  end
end
