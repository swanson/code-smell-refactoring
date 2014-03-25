require "minitest"
require "minitest/autorun"
require "minitest/pride"

require "./invoice"
require "./address"
require "./country"
require "./customer"
require "./invoice_item"

describe Invoice do
  describe 'Shipping fee' do
    it 'should be added if address is outside US' do
      address = Address.new(Country.new("England"))
      customer = Customer.new(address)

      invoice = Invoice.new(customer)
      invoice.add_item InvoiceItem.new("Product X", 1, 100)

      invoice.total_price.must_equal 100 + Invoice::OVERSEAS_SHIPPING_RATE
    end
  end
end
