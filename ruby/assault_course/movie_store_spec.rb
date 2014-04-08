require "minitest"
require "minitest/autorun"
require "minitest/pride"

require "./movie_store"
require "./movie"
require "./rating"

describe MovieStore do
  before do
    @store = MovieStore.new("Blockbuster")
  end

  it 'allows rental of available movies' do
    movie = Movie.new("Jaws", Rating::PG13)
    @store.add_movie(movie)

    @store.has_movie?("Jaws").must_equal true
  end

  it 'doesnt rent movies it doesnt have' do
    @store.has_movie?("The Goonies").must_equal false
  end
end
