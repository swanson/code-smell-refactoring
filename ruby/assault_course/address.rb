class Address

  attr_reader :house
  attr_reader :street
  attr_reader :city
  attr_reader :zipcode

  def initialize(house, street, city, zipcode)
    @house = house
    @street = street
    @city = city
    @zipcode = zipcode
  end
end
