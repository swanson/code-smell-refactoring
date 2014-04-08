class Address
  attr_reader :country

  def initialize(country)
    @country = country
  end

  def is_outside_america?
    @country.is_outside_america?
  end
end
