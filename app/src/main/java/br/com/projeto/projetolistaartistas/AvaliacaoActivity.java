package br.com.projeto.projetolistaartistas;

/**
 * Created by luizmariopimenta
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class AvaliacaoActivity {
    public class AvaliacaoActivity extends Activity {

        private RatingBar ratingBar;
        private TextView txtRatingValue;
        private Button btnSubmit;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.rating_bar);

            addListenerOnRatingBar();
            addListenerOnButton();

        }

        public void addListenerOnRatingBar() {

            ratingBar = (RatingBar) findViewById(R.id.ratingBar);

            ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
                public void onRatingChanged(RatingBar ratingBar, float rating,
                                            boolean fromUser) {



                }
            });
        }

        public void addListenerOnButton() {

            ratingBar = (RatingBar) findViewById(R.id.ratingBar);
            btnSubmit = (Button) findViewById(R.id.btnSubmit);

            //if click on me, then display the current rating value.
            btnSubmit.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {


                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("result",String.valueOf(ratingBar.getRating()));
                    setResult(Activity.RESULT_OK,returnIntent);
                    finish();

                }

            });

        }
    }

