class EntityId[T]

trait EntityState {
  def parentEntity(entities: Entities): Option[Int] = None.flatMap(entities.get)
}
