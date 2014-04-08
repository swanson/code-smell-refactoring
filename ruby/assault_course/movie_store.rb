class MovieStore

  attr_reader :name

  def initialize(name)
    @movies = {}
    @name = name
  end

  def has_movie?(title)
    @movies.has_key? title
  end

  def add_movie(movie)
    @movies[movie.title] = movie
  end
end
