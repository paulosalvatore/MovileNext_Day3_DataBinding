package br.com.paulosalvatore.movilenext_day3_databinding

import android.databinding.*
import br.com.paulosalvatore.movilenext_day3_databinding.utils.bindable

class Game(
	name: String,
	val launchYear: Int,
	val imageUrl: String,
	rating: Double
) : BaseObservable() {
	val isClassic = launchYear < 2000

	@get:Bindable
	var name by bindable(name, BR.name)

	@get:Bindable
	var rating by bindable(rating, BR.rating)
}

/*
// Exemplo com Observables
class Game(
	name: String,
	launchYear: Int,
	imageUrl: String,
	rating: Double
) : BaseObservable() {
	val isClassic = launchYear < 2000

	val name = ObservableField(name)
	val launchYear = ObservableInt(launchYear)
	val imageUrl = ObservableField(imageUrl)
	val rating = ObservableDouble(rating)
}*/
