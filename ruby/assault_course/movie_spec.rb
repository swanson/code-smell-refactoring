require "minitest"
require "minitest/autorun"
require "minitest/pride"

require "./movie"
require "./customer"
require "./movie"
require "./rating"
require "./customer_underage_exception"

describe Movie do
  describe 'Rental Ages' do
    it 'denies rental of R-rated movies to kids' do
      customer = Customer.new(nil, nil, "2008-01-01")
      movie = Movie.new(nil, Rating::R)
      assert_raises CustomerUnderageException do
        movie.rent_for(customer)
      end
    end

    it 'allows legal movie renting' do
      customer = Customer.new(nil, nil, "1980-01-01")
      movie = Movie.new(nil, Rating::PG13)
      movie.rent_for(customer)

      customer.rentals.must_include movie
    end
  end
end
