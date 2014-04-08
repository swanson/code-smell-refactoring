class Customer
  attr_reader :address

  def initialize(address)
    @address = address
  end

  def is_overseas?
    @address.is_outside_america?
  end
end
