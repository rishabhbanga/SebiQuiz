package com.rns.sebiquiz;



import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class level2 extends Activity {
	int sc;
	public static String filename = "ScoreData";
	SharedPreferences data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level2);

		q1();

	}

	public void ty(){
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		
		
		score.setVisibility(View.INVISIBLE);
		option.setVisibility(View.INVISIBLE);
		que.setText("SCORE: " +sc);
		data = getSharedPreferences(filename, 0);
		SharedPreferences.Editor editor = data.edit();
		editor.putString("score2", "PREVIOUS SCORE: " + sc);
		editor.commit();
		
		Thread timer = new Thread() {
			public void run() {
				try {

					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent(level2.this, QuizMenu.class);
					startActivity(i);
				}
			}
		};
		timer.start();
		
	}
	
		public void q7() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q7. Commercial Paper (CP) is an unsecured money market instrument issued in the form of a _____");
		a1.setText("Demand Draft");
		a2.setText("Promissory Note");
		a3.setText("Bill of Exchange");
		a4.setText("Lines of Credit");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level2.this, "INCORRECT: \nCommercial Paper (CP) is an unsecured money market instrument issued in the form of a Promissory Note",
							Toast.LENGTH_LONG).show();
					ty();
					break;
				case R.id.b:
					Toast.makeText(level2.this, "CORRECT: \nCommercial Paper (CP) is an unsecured money market instrument issued in the form of a Promissory Note",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					ty();
					break;
				case R.id.c:
					Toast.makeText(level2.this, "INCORRECT: \nCommercial Paper (CP) is an unsecured money market instrument issued in the form of a Promissory Note",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					ty();
					break;
				case R.id.d:
					Toast.makeText(level2.this, "INCORRECT: \nCommercial Paper (CP) is an unsecured money market instrument issued in the form of a Promissory Note",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					ty();
					break;
				}
			}
		});
	}
	
	
	public void q6() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q6. Which among the following coined the term - Second generation Reforms ? ");
		a1.setText("World Bank");
		a2.setText("IMF");
		a3.setText("RBI");
		a4.setText("WHO");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nInternational Monetary Fund(IMF) coined the term Second generation reforms.",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q7();
					break;
				case R.id.b:
					Toast.makeText(
							level2.this,
							"CORRECT: \nInternational Monetary Fund(IMF) coined the term Second generation reforms.",
							Toast.LENGTH_LONG).show();

					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q7();
					break;
				case R.id.c:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nInternational Monetary Fund(IMF) coined the term Second generation reforms.",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q7();
					break;
				case R.id.d:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nInternational Monetary Fund(IMF) coined the term Second generation reforms.",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q7();
					break;
				}
			}
		});
	}
	
	public void q5() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q5. Interest Rate Risk comes under ___________");
		a1.setText("Credit Risk");
		a2.setText("Market Risk");
		a3.setText("Operational Risk");
		a4.setText("All the above");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
				
					a1.setChecked(false);
					Toast.makeText(level2.this, "INCORRECT: \nInterest Rate Risk comes under Market Risk",
							Toast.LENGTH_LONG).show();
					q6();
					break;
				case R.id.b:
					Toast.makeText(level2.this, "CORRECT: \nInterest Rate Risk comes under Market Risk",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q6();
					break;
				case R.id.c:
					Toast.makeText(level2.this, "INCORRECT: \nInterest Rate Risk comes under Market Risk",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q6();
					break;
				case R.id.d:
					Toast.makeText(level2.this, "INCORRECT: \nInterest Rate Risk comes under Market Risk",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q6();
					break;
				
				}
			}
		});
	}
	
	public void q4() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q4. Debt financing that can magnify the risk and reward for an investment are called ________");
		a1.setText("Reward Risk");
		a2.setText("Derivative");
		a3.setText("Leverage");
		a4.setText("Investment Strategy");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					
					a1.setChecked(false);
					Toast.makeText(level2.this, "INCORRECT: \n Debt financing that can magnify the risk and reward for an investment are called Leverage",
							Toast.LENGTH_LONG).show();
					q5();
					break;
				case R.id.b:
					Toast.makeText(level2.this, "INCORRECT: \n Debt financing that can magnify the risk and reward for an investment are called Leverage",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q5();
					break;
				case R.id.c:
					Toast.makeText(level2.this, "CORRECT: \n Debt financing that can magnify the risk and reward for an investment are called Leverage",
							Toast.LENGTH_LONG).show();
					sc++;
					a3.setChecked(false);
					score.setText("SCORE: " + sc);
					q5();
					break;
				case R.id.d:
					Toast.makeText(level2.this, "INCORRECT: \n Debt financing that can magnify the risk and reward for an investment are called Leverage",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q5();
					break;
				}
			}
		});
	}
	public void q3() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q3. Which in the below list is Not Tier I Capital?");
		a1.setText("Paid up capital");
		a2.setText("Statutory reserves");
		a3.setText("Revaluation reserves");
		a4.setText("Retained earnings");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nRevaluation Reserve is Tier II Capital",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q4();
					break;
				case R.id.b:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nRevaluation Reserve is Tier II Capital",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					q4();
					break;
				case R.id.c:
					Toast.makeText(
							level2.this,
							"CORRECT: \nRevaluation Reserve is Tier II Capital",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					sc++;
					score.setText("SCORE: " + sc);
					q4();
					break;
				case R.id.d:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nRevaluation Reserve is Tier II Capital",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q4();
					break;
				}
			}
		});
	}


	
	
	public void q2() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q2. Which one of these is an over-the-counter securities market ");
		a1.setText("NASDAQ");
		a2.setText("NYSE");
		a3.setText("Toronto Stock Market");
		a4.setText("None of these");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level2.this, "INCORRECT: \nNYSE is an over-the-counter securities market",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q3();
					break;
				case R.id.b:
					Toast.makeText(level2.this, "CORRECT: \nNYSE is an over-the-counter securities market",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q3();
					break;
				case R.id.c:
					Toast.makeText(level2.this, "INCORRECT: \nNYSE is an over-the-counter securities market",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q3();
					break;
				case R.id.d:
					Toast.makeText(level2.this, "INCORRECT: \nNYSE is an over-the-counter securities market",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q3();
					break;
				}
			}
		});
	}

	public void q1() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q1. An exchange where sale and purchase transactions of securities are conducted on the base of demand and supply is called?");
		a1.setText("Securities Market");
		a2.setText("Capital Market");
		a3.setText("Secondary Market");
		a4.setText("All of the above");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level2.this,
							"CORRECT: \nAn exchange where sale and purchase transactions of securities are conducted on the base of demand and supply is called Sensitive Market",
							Toast.LENGTH_LONG).show();
					sc++;
					a1.setChecked(false);
					score.setText("SCORE: " + sc);
					q2();
					break;
				case R.id.b:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nAn exchange where sale and purchase transactions of securities are conducted on the base of demand and supply is called Sensitive Market",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					q2();
					break;
				case R.id.c:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nAn exchange where sale and purchase transactions of securities are conducted on the base of demand and supply is called Sensitive Market",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q2();
					break;
				case R.id.d:
					Toast.makeText(
							level2.this,
							"INCORRECT: \nAn exchange where sale and purchase transactions of securities are conducted on the base of demand and supply is called Sensitive Market",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q2();
					break;
				
				}
			}
		});
	}

}