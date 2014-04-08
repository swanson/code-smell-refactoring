class Customer
  attr_accessor :first_name
  attr_accessor :last_name
  attr_accessor :title
  attr_accessor :address

  def address_summary
    @address.house + ", " + @address.street + ", " + @address.city + 
      ", " + @address.post_code + ", " + @address.country
  end
end

class Address
  attr_accessor :house
  attr_accessor :street
  attr_accessor :city
  attr_accessor :post_code
  attr_accessor :country
end
