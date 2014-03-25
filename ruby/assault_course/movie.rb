require "date"

class Movie

  attr_reader :title, :rating

  def initialize(title, rating)
    @title = title
    @rating = rating
  end

  def rent_for(customer)
    raise CustomerUnderageException.new if is_under_age?(customer)
    customer.add_rental(self)
  end

  private
    def is_under_age?(customer)
      begin
        # calulate customer's age in years and months

        # parse customer date of birth
        date_of_birth = Date.strptime(customer.date_of_birth, "%Y-%m-%d")

        # get current date
        today = Date.today

        # calculate age difference in years and months
        age_year = today.year - date_of_birth.year
        age_month = today.month - date_of_birth.month

        # decrement age in years if month difference is negative
        age_year -= 1 if age_month < 0
        age = age_year
        
        # determine if customer is under legal age for rental
        case @rating
        when Rating::PG13
          return age < 13
        when Rating::R
          return age < 17
        when Rating::NC17
          return age < 18
        else
          return false
        end

      rescue Exception => e
        puts e.message
        puts e.backtrace.inspect
        return false
      end
    end
end
