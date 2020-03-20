package com.valbeny.quizz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizzTest implements Parcelable {
	public String question;
	public String goodAnswer;
	public ArrayList<String> answers;
	//public int doc;

	public QuizzTest(String question, String goodAnswer, ArrayList<String> answers) {
	//public QuizzTest(String question, String goodAnswer, ArrayList<String> answers, int doc) {
		this.question = question;
		this.goodAnswer = goodAnswer;
		this.answers = answers;
	//	this.doc = doc;
	}

	protected QuizzTest(Parcel in) {
		question = in.readString();
		goodAnswer = in.readString();
		answers = in.createStringArrayList();
	//	doc = in.readInt();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(question);
		dest.writeString(goodAnswer);
		dest.writeStringList(answers);
	//	dest.writeInt(doc);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<QuizzTest> CREATOR = new Creator<QuizzTest>() {
		@Override
		public QuizzTest createFromParcel(Parcel in) {
			return new QuizzTest(in);
		}

		@Override
		public QuizzTest[] newArray(int size) {
			return new QuizzTest[size];
		}
	};
}
