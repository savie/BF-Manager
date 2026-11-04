package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܰ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U5 */
/* JADX INFO: loaded from: classes5.dex */
public class C14476 extends C0307 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public float f45556;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f45557;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f45558;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f45559;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f45560;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f45561;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f45562;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final Paint f45563;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f45564;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f45565;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f45566;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f45567;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f45568;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f45569;

    public C14476(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f45563 = paint;
        this.f45568 = new Rect();
        this.f45564 = 255;
        this.f45559 = false;
        int i = this.f1642;
        this.f45562 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f45561 = (int) ((3.0f * f) + 0.5f);
        this.f45560 = (int) ((6.0f * f) + 0.5f);
        int i2 = (int) (64.0f * f);
        this.f45565 = (int) ((16.0f * f) + 0.5f);
        this.f45567 = (int) ((1.0f * f) + 0.5f);
        this.f45569 = (int) ((f * 32.0f) + 0.5f);
        this.f45557 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int iM1894 = m1894();
        super.m1891(iM1894 >= i2 ? iM1894 : i2);
        setWillNotDraw(false);
        this.f1641.setFocusable(true);
        this.f1641.setOnClickListener(new ViewOnClickListenerC24174(this));
        this.f1644.setFocusable(true);
        this.f1644.setOnClickListener(new ViewOnClickListenerC4036(this));
        if (getBackground() == null) {
            this.f45559 = true;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f45560;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.f45559 = drawable == null;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.f45559 = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        this.f45559 = i == 0;
    }

    @Override // l.C0307
    /* JADX INFO: renamed from: ۙ */
    public final int mo1889() {
        return Math.max(super.mo1889(), this.f45569);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f45566) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f45558 = x;
            this.f45556 = y;
            this.f45566 = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f1649;
            int left = textView.getLeft();
            int i = this.f45565;
            if (x < left - i) {
                C15179 c15179 = this.f1647;
                c15179.m36527(c15179.f49522 - 1);
                return true;
            }
            if (x > textView.getRight() + i) {
                C15179 c151710 = this.f1647;
                c151710.m36527(c151710.f49522 + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x - this.f45558);
            float f = this.f45557;
            if (fAbs > f || Math.abs(y - this.f45556) > f) {
                this.f45566 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f1649;
        int left = textView.getLeft();
        int i = this.f45565;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.f45561;
        int i4 = this.f45564 << 24;
        int i5 = this.f45562;
        Paint paint = this.f45563;
        paint.setColor(i4 | (i5 & 16777215));
        float f = right;
        float f2 = height;
        canvas.drawRect(i2, i3, f, f2, paint);
        if (this.f45559) {
            paint.setColor((-16777216) | (i5 & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f45567, getWidth() - getPaddingRight(), f2, paint);
        }
    }

    @Override // l.C0307
    /* JADX INFO: renamed from: ۙ */
    public final void mo1890(float f, boolean z, int i) {
        int height = getHeight();
        TextView textView = this.f1649;
        int left = textView.getLeft();
        int i2 = this.f45565;
        int right = textView.getRight() + i2;
        int i3 = height - this.f45561;
        Rect rect = this.f45568;
        rect.set(left - i2, i3, right, height);
        super.mo1890(f, z, i);
        this.f45564 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
        invalidate(rect);
    }
}
