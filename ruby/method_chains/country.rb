class Country
  attr_reader :name

  def initialize(name)
    @name = name
  end

  def is_outside_america?
    @name != "USA"
  end
end
