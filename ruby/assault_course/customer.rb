class Customer
  attr_reader :date_of_birth
  attr_reader :rentals

  def initialize(name, address, date_of_birth)
    @name = name
    @address = address
    @date_of_birth = date_of_birth
    @rentals = []
  end

  def add_rental(movie)
    @rentals << movie
  end

  def summary
    "#{@name}, #{@address.house} #{@address.street}, #{@address.city}, #{@address.zipcode}"
  end

end
