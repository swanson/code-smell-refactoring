require "minitest"
require "minitest/autorun"
require "minitest/pride"

require "./customer"

describe Customer do
  before do
    address = Address.new
    address.house = "43"
    address.street = "Rankin Road"
    address.city = "London"
    address.post_code = "SW23 9YY"
    address.country = "United Kingdom"

    @customer = Customer.new
    @customer.address = address
  end

  describe '.address_summary' do
    it 'includes house, street, city, postal code and country' do
      @customer.address_summary.must_equal \
        "43, Rankin Road, London, SW23 9YY, United Kingdom"
    end
  end
end
