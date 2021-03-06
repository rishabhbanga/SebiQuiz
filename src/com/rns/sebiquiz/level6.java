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

public class level6 extends Activity {
	int sc;
	public static String filename = "ScoreData";
	SharedPreferences data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level6);

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
		editor.putString("score6", "PREVIOUS SCORE: " + sc);
		editor.commit();
		
		Thread timer = new Thread() {
			public void run() {
				try {

					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent(level6.this, QuizMenu.class);
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
		que.setText("Q7. Which among the following committees recommended the merger of Regional Rural Banks with their respective Sponsor Banks?");
		a1.setText("Khusro Committee");
		a2.setText("Narsimhamam Committee");
		a3.setText("C Rangrajan Committee");
		a4.setText("Malhotra Committee");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level6.this, "CORRECT: \nKhusro Committee recommended the merger of Regional Rural Banks with their respective Sponsor Banks ",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					ty();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "INCORRECT: \nKhusro Committee recommended the merger of Regional Rural Banks with their respective Sponsor Banks ",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					ty();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \nKhusro Committee recommended the merger of Regional Rural Banks with their respective Sponsor Banks ",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					ty();
					break;
				case R.id.d:
					Toast.makeText(level6.this, "INCORRECT: \nKhusro Committee recommended the merger of Regional Rural Banks with their respective Sponsor Banks ",
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
		que.setText("Q6.What is the number of State Finance Corporations in India ?");
		a1.setText("22");
		a2.setText("18");
		a3.setText("13");
		a4.setText("21");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nNumber of State Finance Corporations in India are 18",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);

					q7();
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"CORRECT: \nNumber of State Finance Corporations in India are 18",
							Toast.LENGTH_LONG).show();

					sc++;
					a2.setChecked(false);
					score.setText("SCORE: " + sc);
					q7();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nNumber of State Finance Corporations in India are 18",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q7();
					break;
				case R.id.d:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nNumber of State Finance Corporations in India are 18",
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
		que.setText("Q5. Which among the following committee suggested to establish Insurance Regulatory Authority in India ?");
		a1.setText("Dandekar Committee");
		a2.setText("Malhotra Committee");
		a3.setText("Rangrajan Committee");
		a4.setText("Khusro Committee");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level6.this, "INCORRECT: \nMalhotra Committee suggested to establish Insurance Regulatory Authority in India",
							Toast.LENGTH_LONG).show();
					q6();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "CORRECT: \nMalhotra Committee suggested to establish Insurance Regulatory Authority in India",
							Toast.LENGTH_LONG).show();
					sc++;
					score.setText("SCORE: " + sc);
					a2.setChecked(false);
					q6();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \nMalhotra Committee suggested to establish Insurance Regulatory Authority in India",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q6();
					break;
				case R.id.d:
					Toast.makeText(level6.this, "INCORRECT: \nMalhotra Committee suggested to establish Insurance Regulatory Authority in India",
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
		que.setText("Q4. Which among the following was set up by RBI in 1988 jointly with public sector banks and all India Financial Institutions to develop the money market & provide liquidity to money market instruments as sequel to Vaghul Working Group recommendations? ");
		a1.setText("Discount And Finance House of India Ltd (DFHI) ");
		a2.setText("Central Depository Services (India) Limited (CDSL) ");
		a3.setText("Financial Intelligence Unit India (FIU-IND)");
		a4.setText("None of these");
		
		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					sc++;
					a1.setChecked(false);
					Toast.makeText(level6.this, "CORRECT: \nDFHI was set up by RBI in 1988 ",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q5();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "INCORRECT: \nDFHI was set up by RBI in 1988 ",
							Toast.LENGTH_LONG).show();
					a2.setChecked(false);
					q5();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \nDFHI was set up by RBI in 1988 ",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q5();
					break;
				case R.id.d:
					Toast.makeText(level6.this, "INCORRECT: \nDFHI was set up by RBI in 1988 ",
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
		que.setText("Q3. Recently we came to know that Treasury Bills which are short term (upto 1 year) borrowing instruments of the Government of India are also being issued frequently under the Market Stabilization Scheme (MSS). They are available for minimum amount of ___");
		a1.setText("\u20B9 25, 000");
		a2.setText("\u20B9 40, 000");
		a3.setText("\u20B9 50, 000");
		a4.setText("\u20B9 70, 000");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"CORRECT: \n\u20B9 25,000 and in multiples of \u20B9 25,000 thereafter. Available in both Primary and Secondary market",
							Toast.LENGTH_LONG).show();
					sc++;
					score.setText("SCORE: " + sc);
					a1.setChecked(false);

					q4();
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n\u20B9 25,000 and in multiples of \u20B9 25,000 thereafter. Available in both Primary and Secondary market",
							Toast.LENGTH_LONG).show();

					
					a2.setChecked(false);
					
					q4();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n\u20B9 25,000 and in multiples of \u20B9 25,000 thereafter. Available in both Primary and Secondary market",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q4();
					break;
				case R.id.d:
					Toast.makeText(
							level6.this,
							"INCORRECT: \n\u20B9 25,000 and in multiples of \u20B9 25,000 thereafter. Available in both Primary and Secondary market",
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
		que.setText("Q2. In 2006, Reserve bank of India had set up a panel under Shri S C Gupta to recommend the legislations related to regulation of which of the following? ");
		a1.setText("Capital markets ");
		a2.setText("Money lending ");
		a3.setText("Financial Inclusion");
		a4.setText("None of the above");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					a1.setChecked(false);
					Toast.makeText(level6.this, "INCORRECT: \nMoney Lending Panel recommended to appoint Accredited loan Provider ALP",
							Toast.LENGTH_LONG).show();
					score.setText("SCORE: " + sc);
					q3();
					break;
				case R.id.b:
					Toast.makeText(level6.this, "CORRECT: \nMoney Lending Panel recommended to appoint Accredited loan Provider ALP",
							Toast.LENGTH_LONG).show();
					sc++;
					a2.setChecked(false);
					q3();
					break;
				case R.id.c:
					Toast.makeText(level6.this, "INCORRECT: \nMoney Lending Panel recommended to appoint Accredited loan Provider ALP",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q3();
					break;
				case R.id.d:
					Toast.makeText(level6.this, "INCORRECT: \nMoney Lending Panel recommended to appoint Accredited loan Provider ALP",
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
		que.setText("Q1. In 2003, UTI was divided into two parts, UTI Mutual Fund (UTI MF) and a specified undertaking of UTI or UTI-I. Which among them has been kept under the control of the government ?");
		a1.setText("UTI MF");
		a2.setText("UTI I");
		a3.setText("Both of them");
		a4.setText("None of them");

		option.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.a:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nUTI I has been kept under the control of the government",
							Toast.LENGTH_LONG).show();
					a1.setChecked(false);
					q2();
					break;
				case R.id.b:
					Toast.makeText(
							level6.this,
							"CORRECT: \nUTI I has been kept under the control of the government",
							Toast.LENGTH_LONG).show();
					sc++;
					score.setText("SCORE: " + sc);	
					a2.setChecked(false);
					q2();
					break;
				case R.id.c:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nUTI I has been kept under the control of the government",
							Toast.LENGTH_LONG).show();
					a3.setChecked(false);
					q2();
					break;
				case R.id.d:
					Toast.makeText(
							level6.this,
							"INCORRECT: \nUTI I has been kept under the control of the government",
							Toast.LENGTH_LONG).show();
					a4.setChecked(false);
					q2();
					break;
				
				}
			}
		});
	}

}