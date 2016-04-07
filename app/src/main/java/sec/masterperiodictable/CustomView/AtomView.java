package sec.masterperiodictable.CustomView;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import sec.masterperiodictable.R;

/**
 * Created by sec on 2015-11-06.
 */
public class AtomView extends View {

    // attribute
    int mNumber;
    String mName;
    String mSymbol = "H";
    String ion = "";

    // text
    int mTextColor;
    Paint mTextPaint;

    Paint ionPaint;
    int ionColor;

    public String getIon() {
        return ion;
    }

    public void setIon(String ion) {
        this.ion = ion;
    }

    public int getIonColor() {
        return ionColor;
    }

    public void setIonColor(int ionColor) {
        this.ionColor = ionColor;
    }

    public Paint getIonPaint() {
        return ionPaint;
    }

    public void setIonPaint(Paint ionPaint) {
        this.ionPaint = ionPaint;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getSymbol() {
        return mSymbol;
    }

    public void setSymbol(String mSymbol) {
        this.mSymbol = mSymbol;
    }

    public Paint getTextPaint() {
        return mTextPaint;
    }

    public void setTextPaint(Paint mTextPaint) {
        this.mTextPaint = mTextPaint;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public void setTextColor(int mTextColor) {
        this.mTextColor = mTextColor;
    }

    public void setAllColor(int color) {
        mTextColor = color;
        mSubTextColor = color;
        mBodyColor = color;
        ionColor = color;

        mTextPaint.setColor(mTextColor);
        mSubTextPaint.setColor(mSubTextColor);
        mBodyPaint.setColor(mBodyColor);
        ionPaint.setColor(ionColor);
    }

    public int getTextSize() {
        return mTextSize;
    }

    public void setTextSize(int mTextSize) {
        this.mTextSize = mTextSize;
    }

    public Paint getmBodyPaint() {
        return mBodyPaint;
    }

    public void setBodyPaint(Paint mBodyPaint) {
        this.mBodyPaint = mBodyPaint;
    }

    public int getBodyColor() {
        return mBodyColor;
    }

    public void setBodyColor(int mBodyColor) {
        this.mBodyColor = mBodyColor;
        mBodyPaint.setColor(mBodyColor);
    }

    int mTextSize;

    // body
    Paint mBodyPaint;
    int mBodyColor;

    Paint mSubTextPaint;
    int mSubTextColor;

    public AtomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AtomView,
                0, 0);

        try {
            mNumber = a.getInteger(R.styleable.AtomView_atomNumber, 0);
            mName = a.getString(R.styleable.AtomView_atomName);
            mSymbol = a.getString(R.styleable.AtomView_atomSymbol);
        } finally {
            a.recycle();
        }

        init();
    }

    private void init() {
        mTextSize = 50;

        mBodyColor = Color.WHITE;
        mTextColor = Color.WHITE;
        mSubTextColor = Color.WHITE;
        ionColor = Color.WHITE;

        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(mTextColor);
        mTextPaint.setTextSize(mTextSize);
        mTextPaint.setTextAlign(Paint.Align.CENTER);

        mBodyPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mBodyPaint.setColor(mBodyColor);
        mBodyPaint.setStyle(Paint.Style.STROKE);
        mBodyPaint.setStrokeWidth(17);

        mSubTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mSubTextPaint.setColor(mSubTextColor);
        mSubTextPaint.setTextSize(mTextSize / 2);
        mSubTextPaint.setTextAlign(Paint.Align.CENTER);

        ionPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        ionPaint.setColor(ionColor);
        ionPaint.setTextSize(mTextSize / 5 * 3);
        ionPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(0, 0, width, height, mBodyPaint);

        canvas.drawText(mSymbol,
                width / 2,
                height / 2,
                mTextPaint);

        canvas.drawText(mName,
                width / 2,
                3 * height / 4,
                mSubTextPaint);

        canvas.drawText(mNumber + "",
                width / 4,
                height / 4,
                mSubTextPaint);

        if (mSymbol.length() == 1 || ion.length() == 1) {
            canvas.drawText(ion + "",
                    width / 9 * 6,
                    height / 7 * 2,
                    ionPaint);
        } else {
            canvas.drawText(ion + "",
                    width / 4 * 3,
                    height / 7 * 2,
                    ionPaint);
        }
    }

    int width;
    int height;

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        width = w;
        height = h;
    }
}
