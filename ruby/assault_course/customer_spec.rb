require "minitest"
require "minitest/autorun"
require "minitest/pride"

require "./customer"
require "./address"

describe Customer do
  describe '.summary' do
    it 'includes full name and address' do
      address = Address.new("15", "Main St", "Broad Ripple", "46220")
      customer = Customer.new("Miles ZS", address, "1980-01-01")

      customer.summary.must_equal "Miles ZS, 15 Main St, Broad Ripple, 46220"
    end
  end
end
