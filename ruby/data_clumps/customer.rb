class Customer

  attr_accessor :first_name
  attr_accessor :last_name
  attr_accessor :title
  attr_accessor :house
  attr_accessor :street
  attr_accessor :city
  attr_accessor :post_code
  attr_accessor :country

  def address_summary
    @house + ", " + @street + ", " + @city + ", " + @post_code + ", " + @country
  end

end
