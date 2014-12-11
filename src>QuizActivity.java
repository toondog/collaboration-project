//Suren portion activity quiz.xml

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
		android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:gravity="center"
		android:orientation="vertical">
		
		<TextView
			android:id="@+id/question_text_view"
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:padding="24dp"
			android:text="@string/question_text"/>
			
		<LinearLayout
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:orientation="horizontal">
			
		<Button
			android:id="@+id/true_button"
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="@string/true_button" />
			
		<Button
			android:id="@+id/false_button"
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="@string/false_button" />
			
		</LinearLayout
		<LinearLayout
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:orientation="horizontal">
				
				<Button
			android:id="@+id/previous_button"
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="@string/previous_button" />
			
		<Button
			android:id="@+id/next_button"
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			android:text="@string/next_button" />
		</LinearLayout

	</LinearLayout
//MikoHov prtion strings.xml

<?xml version="1.0" encoding="utf-8"?>

<resources>


	<string name="app_name">GeoQuizLab1Solution</string>
	
	<string name="question_text">The St. Louis Arch is next to the Mississippi River.</String>
	
	<string name="true_button">True</string>
	
	<string name="false_button">False</string>
	
	<string name="next_button">Next</string>
	
	<string name="previous_button">Previous</string>
	
	<string name="menu_settings">Settings</string>
	
	<string name="correct_toast">Correct!</string>
	
	<string name="incorrect_toast">Incorrect!</string>
	
	<string name="question_chatdump">The Desloge chat dump was once the largest mountain.</string>
	
	<string name="question_mines">Scuba diving is not allowed in the Bonne Terre mines</string>
	
	<string name="question_quakes">There has never been an earthquake in Missouri</string>
	
	<string name="question_wine">Ste Genevieve has a growing wine industry</string>
	
	<string name="question_mtlion">There are no mountain liions in Missouri.</string>
	
</resources>


//will portion QuizActivity.java
package com.example.geoquizlab1solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {
	
	private Button mTrueButton;
	private Button mFalseButton;
	private Button mNextButton;
	private Button mPreviosButton;
	private TextView mQuestionTextView;
	
	private TrueFalse[] mQuestionBank = new TrueFalse[]{
			new TrueFalse(R.string.question_chatdump, true),
			new TrueFalse(R.string.question_mines, false),
			new TrueFalse(R.string.question_mtlion, false),
			new TrueFalse(R.string.question_quakes, false),
			new TrueFalse(R.string.question_wine, true)
			};
			
	private int mCurrentIndex=0;

	private void updateQuestion(){
	int question = mQuestionBank[mCurrentIndex].getQuestion();
	mQuestionTextView.setText(question);
	
		
	}
	
	private void checkAnswer(booolean userPressedTrue) {
	boolean answerIs True = mQuestionBank[[mCurrentIndex].IsTrueQuestion();
		int messageId = 0;

	if (userPressedTrue == answerIsTrue) {
	messageResId = R.string.correct_toast;
	}
	else{
		messageResId = R.string.incorrect_toast;
		}
	Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
		protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		
		mTrueButton = (Button) =findViewById(R.Id.true_button);
		mTrueButton.setOnClickListener(new View.OnClickListener() {
		
		@Override	
	//MikoHov page		
			public void onClick(View v) {
	//Toast.makeText(QuizActivity.this,R.string.correct_toast,
	Toast.LENGTH_SHORT).show();
	
				checkAnswer(true);
				
				}
			});
			
			mFalseButton = (Button)findViewById(R.id.false_button);
			mFalseButton.setOnClickListener(new View.OnClickListener() {
			
				@Override
public void onClick(view v) {

//Toast.makeText(QuizActivity.this, R.string.incorrect_toast, 
Toast.LENGTH_SHORT) .show();
							checkAnswer(false)
							}
			});
			
			mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
			updateQuestion();
			
			
			mNextButton = (Button)findViewById(R.id.next_button);
			mNextButton.setOnClickListener(new View.OnCliickListener() {
			
			
			@Override
			
			public void onClick(View v) {
				mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
				updateQuestion();
				
			}
			});
			
		mPreviousButton = (Button)findViewById(R.id.previous_button);
			mPreviousButton.setOnClickListener(new View.OnCliickListener() {
			
			@Override
			
			public void onClick(View v) {
				
				if(mCurrentIndex != 0
		{
			mCurrentIndex = (mCurrentIndex - 1) % mQuestionBank.length;
				
				updateQuestion();
			}
			});
			
		}
		
		@Override
		
		public boolean on CreateOptionsMenu(Menu menu) {
			//Inflate the menu; this adds items to the action bar if it is present.
			
		getMenuInflater().inflate(R.menu.activity_quiz, menu);
		return true;
		
			//suren portion, TrueFalse Java
		public void onClick(view v) {

//Toast.makeText(QuizActivity.this, R.string.incorrect_toast, 
Toast.LENGTH_SHORT) .show();
							chechAnswer(false)
							}
			});
			
			mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
			updateQuestion();
			
			
			mNextButton = (Button)findViewById(R.id.next_button);
			mNextButton.setOnClickListener(new View.OnCliickListener() {
			
			
			@Override
			
			public void onClick(View v) {
				mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
				updateQuestion();
				
			}
			});
			
		mPreviousButton = (Button)findViewById(R.id.previous_button);
			mPreviousButton.setOnClickListener(new View.OnCliickListener() {
			
			@Override
			
			public void onClick(View v) {
				
				if(mCurrentIndex != 0
		
		}
		}
	
		//will gen>R.java page 1
		
		package com.example.geoquizlabsolution;

public final class R {
		public static final class attr {

		}
		public static final class drawable {
			public static final int ic_launcher=0x7f020000;
		}
		public static final class id{
			public static final int false_button=0x7f070002;
			public static final int menu_settings=0x7f070005;
			public static final int next_button=0x7f070004;
			public static final int previous_button=0x7f070003;
			public static final int question_text_view=0x7f070001;
			public static final int true_button=0x7f070001;

		}
		public static final class layout {
			public static final int activity_quiz=0x7f030000;

		}

		public static final class menu {

			public static final int activity_quiz=0x7f060000;

		}

		public static final class string {
			public static final int app_name=0x7f040000;
			public static final int correct_toast=0x7f040007;
			public static final int false_button=0x7f040003;
			public static final int incorrect_toast=0x7f040008;
		}
}
