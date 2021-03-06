package edu.cnm.deepdive.sipandscore.model.pojo;

import androidx.room.Relation;
import edu.cnm.deepdive.sipandscore.model.entity.Bar;
import edu.cnm.deepdive.sipandscore.model.entity.DrinkRating;
import java.util.LinkedList;
import java.util.List;

public class BarWithDrinkRatings extends Bar {

  @Relation(
      entity = DrinkRating.class,
      parentColumn = "bar_id",
      entityColumn = "bar_id"
  )
  private List<DrinkRatingWithDetails> drinkRatings = new LinkedList<>();

  public List<DrinkRatingWithDetails> getDrinkRatings() {
    return drinkRatings;
  }

  public void setDrinkRatings(
      List<DrinkRatingWithDetails> drinkRatings) {
    this.drinkRatings = drinkRatings;
  }
}
