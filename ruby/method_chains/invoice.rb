class Invoice
  OVERSEAS_SHIPPING_RATE = 10.0

  attr_reader :customer, :items

  def initialize(customer)
    @customer = customer
    @items = []
  end

  def add_item(invoice_item)
    @items << invoice_item
  end

  def total_price
    total = 0

    @items.each do |item|
      total += item.subtotal
    end

    if @customer.is_overseas?
      total += OVERSEAS_SHIPPING_RATE
    end

    total
  end
end
