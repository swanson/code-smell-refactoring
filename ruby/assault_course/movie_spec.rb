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
      customer = Customer.new("Some Kid", "123 Main St", "2008-01-01")
      movie = Movie.new("Braveheart", Rating::R)
      assert_raises CustomerUnderageException do
        movie.rent_for(customer)
      end
    end

    it 'denies rental of NC-17 movies to people under 18' do
      customer = Customer.new("Sneaky Teen", "123 Main St", "1997-01-01")
      movie = Movie.new("XXX", Rating::NC17)
      assert_raises CustomerUnderageException do
        movie.rent_for(customer)
      end
    end

    it 'allows legal movie renting' do
      customer = Customer.new("Grown Adult", "123 Main St", "1980-01-01")
      movie = Movie.new("Spider-Man", Rating::PG13)
      movie.rent_for(customer)

      customer.rentals.must_include movie
    end

    it 'allows anyone to rent G-rated movies' do
      customer = Customer.new("A Baby", "123 Main St", "2014-01-01")
      movie = Movie.new("The Lion King", Rating::G)
      movie.rent_for(customer)

      customer.rentals.must_include movie
    end
  end
end
