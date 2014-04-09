require "minitest"
require "minitest/autorun"
require "minitest/pride"

require "./account"
require "./transaction"

describe Account do
  before do
    @account = Account.new
  end

  describe 'Debiting an account' do
    it 'should deduct amount from balance' do
      @account.credit(100)
      @account.debit(50)

      @account.balance.must_equal 50
    end

    it 'should record the transactions' do
      @account.credit(100)
      last_transaction = @account.last_transaction
      last_transaction.amount.must_equal 100
      last_transaction.is_debit.must_equal false

      @account.debit(50)

      last_transaction = @account.last_transaction
      last_transaction.amount.must_equal -50
      last_transaction.is_debit.must_equal true
    end

    it 'should update last debit date' do
      @account.credit(100)
      @account.debit(50)

      @account.last_transaction_date.must_equal Date.today
    end
  end

  describe "Crediting an account" do
    it 'should add amount to balance' do
      @account.credit(50)

      @account.balance.must_equal 50
    end

    it 'should record the transaction' do
      @account.credit(50)

      last_transaction = @account.last_transaction
      last_transaction.amount.must_equal 50
    end

    it 'should update last debit date' do
      @account.credit(50)

      @account.last_transaction_date.must_equal Date.today
    end
  end
end
