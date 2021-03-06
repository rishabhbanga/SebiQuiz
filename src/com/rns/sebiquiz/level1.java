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

public class level1 extends Activity {
	int sc;
	public static String filename = "ScoreData";
	SharedPreferences data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level1);

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
		editor.putString("score1", "PREVIOUS SCORE: " + sc);
		editor.commit();
		
		Thread timer = new Thread() {
			public void run() {
				try {

					sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent(level1.this, QuizMenu.class);
					startActivity(i);
				}
			}
		};
		timer.start();
		
	}
	
	public void q8() {
		final TextView score = (TextView) findViewById(R.id.score);
		TextView que = (TextView) findViewById(R.id.que);
		RadioGroup option = (RadioGroup) findViewById(R.id.option);
		final RadioButton a1 = (RadioButton) findViewById(R.id.a);
		final RadioButton a2 = (RadioButton) findViewById(R.id.b);
		final RadioButton a3 = (RadioButton) findViewById(R.id.c);
		final RadioButton a4 = (RadioButton) findViewById(R.id.d);
		
		score.setText("SCORE: " + sc);
		que.setText("Q8. When the firm is issuing shares for the very first time, it is called ?");
		a1.setText("IPO");
		a2.setText("BPO");
		a3.setText("Both");
		a4.setText("None");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level1.this,
							"CORRECT: \nWhen the firm is issuing shares for the very first time, it is called IPO",
							Toast.LENGTH_LONG).show();
					sc++;
					a1.setChecked(false);
					score.setText("SCORE: " + sc);
					ty();
					break;
				case R.id.b:
					Toast.makeText(
							level1.this,
							"CORRECT: \nWhen the firm is issuing shares for the very first time, it is called IPO",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					ty();
					break;
				case R.id.c:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nWhen the firm is issuing shares for the very first time, it is called IPO",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					ty();
					break;
				case R.id.d:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nWhen the firm is issuing shares for the very first time, it is called IPO",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					ty();
					break;
				}
			}
		});
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
		que.setText("Q7. As we know that RBI has two departments Issue Department and Banking Department. Which among them is responsible for maintaining a Minimum reserve system against printing of currency notes?");
		a1.setText("Issue Department");
		a2.setText("Banking Department");
		a3.setText("Both of Them");
		a4.setText("None");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level1.this, "CORRECT: \n Issue Department",
							Toast.LENGTH_LONG).show();
					sc++;
					a1.setChecked(false);
					score.setText("SCORE: " + sc);
					q8();break;
				case R.id.b:
					Toast.makeText(level1.this, "INCORRECT: \n Issue Department",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q8();
					break;
				case R.id.c:
					Toast.makeText(level1.this, "INCORRECT: \n Issue Department",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q8();
					break;
				case R.id.d:
					Toast.makeText(level1.this, "INCORRECT: \n Issue Department",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q8();
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
		que.setText("Q6. Which among the following is world's largest foreign exchange market?");
		a1.setText("London");
		a2.setText("Zurich");
		a3.setText("New York");
		a4.setText("Tokyo");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level1.this,
							"CORRECT: \nLondon followed by New York, Tokyo, Zurich and Frankfurt",
							Toast.LENGTH_LONG).show();
					sc++;
					a1.setChecked(false);
					score.setText("SCORE: " + sc);
					q7();
					break;
				case R.id.b:
					Toast.makeText(
							level1.this,
							"CORRECT: \nLondon followed by New York, Tokyo, Zurich and Frankfurt",
							Toast.LENGTH_LONG).show();

					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q7();
					break;
				case R.id.c:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nLondon followed by New York, Tokyo, Zurich and Frankfurt",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q7();
					break;
				case R.id.d:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nLondon followed by New York, Tokyo, Zurich and Frankfurt",
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
		que.setText("Q5. Which is the oldest exchange in Asia?");
		a1.setText("Cochin Stock Exchange");
		a2.setText("Delhi Stock Exchange");
		a3.setText("Bombay Stock Exchange");
		a4.setText("Bangalore Stock Exchange");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level1.this, "CORRECT: \nBombay Stock Exchange is the oldest exchange in Asia tracing it's history to 1885",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q6();
					break;
				case R.id.b:
					Toast.makeText(level1.this, "INCORRECT: \nBombay Stock Exchange is the oldest exchange in Asia tracing it's history to 1885",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q6();
					break;
				case R.id.c:
					Toast.makeText(level1.this, "CORRECT: \nBombay Stock Exchange is the oldest exchange in Asia tracing it's history to 1885",
							Toast.LENGTH_LONG).show();
					sc++;
					a3.setChecked(false);
					score.setText("SCORE: " + sc);
					q6();
					break;
				case R.id.d:
					Toast.makeText(level1.this, "INCORRECT: \nBombay Stock Exchange is the oldest exchange in Asia tracing it's history to 1885",
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
		que.setText("Q4.What does NYSE stands for?");
		a1.setText("New Yolk Stock Exchange");
		a2.setText("New York Stock Exchange");
		a3.setText("New Year Stock Exchange");
		a4.setText("New Yolk Steep Exchange");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level1.this, "INCORRECT: \nNYSE stands for New York Stock Exchange",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q5();
					break;
				case R.id.b:
					Toast.makeText(level1.this, "CORRECT: \nNYSE stands for New York Stock Exchange",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q5();
					break;
				case R.id.c:
					Toast.makeText(level1.this, "INCORRECT: \nNYSE stands for New York Stock Exchange",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q5();
					break;
				case R.id.d:
					Toast.makeText(level1.this, "INCORRECT: \nNYSE stands for New York Stock Exchange",
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
		que.setText("Q3. NASDAQ stands for");
		a1.setText("New Association of Securities Dealers Automated Quotation");
		a2.setText("National Assembly of Securities Dealers Automated Quotation");
		a3.setText("National Association of Securities Dealers Automated Quotation");
		a4.setText("National Association of Sensitive Dealers Automated Quotation");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q4();
					break;
				case R.id.b:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
							Toast.LENGTH_LONG).show();

					
					a2.setChecked(false);
					
					q4();
					break;
				case R.id.c:
					Toast.makeText(
							level1.this,
							"CORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					sc++;
					score.setText("SCORE: " + sc);
					q4();
					break;
				case R.id.d:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nNASDAQ stands for National Association of Securities Dealers Automated Quotation",
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
		que.setText("Q2. What is the full form of SEBI? ");
		a1.setText("Security and Exchanging Board of India");
		a2.setText("Securities and Exchange Board of India");
		a3.setText("Sensitive and Exchange Board of India");
		a4.setText("Sensitive and Exchange Board of Indonesia");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level1.this, "INCORRECT: \nSEBI stands for Securities and Exchange Board of India",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q3();
					break;
				case R.id.b:
					Toast.makeText(level1.this, "CORRECT: \nSEBI stands for Securities and Exchange Board of India",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q3();				break;
				case R.id.c:
					Toast.makeText(level1.this, "INCORRECT: \nSEBI stands for Securities and Exchange Board of India",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q3();
					break;
				case R.id.d:
					Toast.makeText(level1.this, "INCORRECT: \nSEBI stands for Securities and Exchange Board of India",
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
		que.setText("Q1. What does SENSEX stands for?");
		a1.setText("Sensitive index");
		a2.setText("Sense index");
		a3.setText("Sensible index");
		a4.setText("Senseless index");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level1.this,
							"CORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();
					sc++;
					a1.setChecked(false);
					score.setText("SCORE: " + sc);
					q2();
					break;
				case R.id.b:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();

					a2.setChecked(false);
					q2();
					break;
				case R.id.c:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q2();
					break;
				case R.id.d:
					Toast.makeText(
							level1.this,
							"INCORRECT: \nSENSEX stands for SENSitive indEX",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q2();
					break;
				
				}
			}
		});
	}

}