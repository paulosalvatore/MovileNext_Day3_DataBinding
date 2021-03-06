package br.com.paulosalvatore.movilenext_day3_databinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.paulosalvatore.movilenext_day3_databinding.databinding.ActivityGameInfoBinding
import br.com.paulosalvatore.movilenext_day3_databinding.utils.contentView
import kotlinx.android.synthetic.main.activity_game_info.*

class GameInfoActivity : AppCompatActivity() {

	val binding: ActivityGameInfoBinding by contentView(R.layout.activity_game_info)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_game_info)

		val game = Game(
			"Donkey Kong",
			1981,
			"https://vignette.wikia.nocookie.net/liberproeliis/images/2/2d/DKMP8.png/revision/latest?cb=20161011111445&path-prefix=pt-br",
			5.0
		)
		binding.game = game

		tvRating.setOnClickListener {
			game.rating++
		}
	}
}
