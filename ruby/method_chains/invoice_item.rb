class InvoiceItem

  attr_reader :name, :quantity, :price

  def initialize(name, quantity, price)
    @name = name
    @quantity = quantity
    @price = price
  end

  def subtotal
    quantity * price
  end
end
