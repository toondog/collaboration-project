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
			public void onClick(View v) {
	//Toast.makeText(QuizActivity.this,R.string.correct_toast,
	Toast.LENGTH_SHORT).show();
	
				checkAnswer(true);
				
			}
			});
			
			mFalseButton = (Button)findViewById(R.id.false_button);
			mFalseButton.setOnClickListener(new View.OnClickListener() {
			
				@Override
