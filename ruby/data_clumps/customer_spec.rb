require "minitest"
require "minitest/autorun"
require "minitest/pride"

require "./customer"

describe Customer do
  before do
    @customer = Customer.new
    @customer.house = "43"
    @customer.street = "Rankin Road"
    @customer.city = "London"
    @customer.post_code = "SW23 9YY"
    @customer.country = "United Kingdom"
  end

  describe '.address_summary' do
    it 'includes house, street, city, postal code and country' do
      @customer.address_summary.must_equal \
        "43, Rankin Road, London, SW23 9YY, United Kingdom"
    end
  end
end
