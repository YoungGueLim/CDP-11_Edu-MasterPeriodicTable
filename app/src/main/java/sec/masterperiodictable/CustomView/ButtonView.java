package sec.masterperiodictable.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import sec.masterperiodictable.R;


public class ButtonView extends View {

    String name;

    // body
    Paint mBodyPaint;
    int mBodyColor;

    int mTextSize;

    public void setAllColor(int color) {
        mBodyColor = color;
        mTextColor = color;

        mBodyPaint.setColor(mBodyColor);
        mTextPaint.setColor(mTextColor);

        invalidate();
    }

    Rect r = new Rect();

    Paint paint = new Paint();

    // text
    int mTextColor;
    Paint mTextPaint;

    public ButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.ButtonView,
                0, 0);

        try {
            name = a.getString(R.styleable.ButtonView_buttonName);
        } finally {
            a.recycle();
        }

        init();
    }

    private void init() {
        mTextSize = 50;

        mBodyColor = Color.WHITE;
        mTextColor = Color.WHITE;

        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(mTextColor);
        mTextPaint.setTextSize(mTextSize);
        mTextPaint.setTextAlign(Paint.Align.CENTER);

        mBodyPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mBodyPaint.setColor(mBodyColor);
        mBodyPaint.setStyle(Paint.Style.STROKE);
        mBodyPaint.setStrokeWidth(17);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(0, 0, width, height, mBodyPaint);

        paint.getTextBounds(name, 0, name.length(), r);

        canvas.drawText(name,
                width / 2,
                height / 2 + Math.abs(r.height()),
                mTextPaint);
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
