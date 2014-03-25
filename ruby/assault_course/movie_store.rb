class MovieStore

  def initialize
    @movies = {}
  end

  def has_movie?(title)
    @movies.has_key? title
  end

  def add_movie(movie)
    @movies[movie.title] = movie
  end
end
