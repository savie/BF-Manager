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

/* JADX INFO: renamed from: l.ۗ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U5 */
/* JADX INFO: loaded from: classes2.dex */
public class C2926 extends C11622 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f10995;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f10996;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public float f10997;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f10998;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f10999;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f11000;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f11001;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f11002;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f11003;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final Paint f11004;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final Rect f11005;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f11006;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f11007;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f11008;

    public C2926(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f11004 = paint;
        this.f11005 = new Rect();
        this.f11003 = 255;
        this.f11001 = false;
        int i = this.f39045;
        this.f11007 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f10995 = (int) ((3.0f * f) + 0.5f);
        this.f10999 = (int) ((6.0f * f) + 0.5f);
        int i2 = (int) (64.0f * f);
        this.f11006 = (int) ((16.0f * f) + 0.5f);
        this.f10996 = (int) ((1.0f * f) + 0.5f);
        this.f11008 = (int) ((f * 32.0f) + 0.5f);
        this.f11000 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int iM28966 = m28966();
        super.m28963(iM28966 >= i2 ? iM28966 : i2);
        setWillNotDraw(false);
        this.f39043.setFocusable(true);
        this.f39043.setOnClickListener(new ViewOnClickListenerC1515(this));
        this.f39044.setFocusable(true);
        this.f39044.setOnClickListener(new ViewOnClickListenerC9278(this));
        if (getBackground() == null) {
            this.f11001 = true;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f10999;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.f11001 = drawable == null;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.f11001 = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        this.f11001 = i == 0;
    }

    @Override // l.C11622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo8749() {
        return Math.max(super.mo8749(), this.f11008);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f10998) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f11002 = x;
            this.f10997 = y;
            this.f10998 = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f39046;
            int left = textView.getLeft();
            int i = this.f11006;
            if (x < left - i) {
                C19383 c19383 = this.f39041;
                c19383.m44413(c19383.f62481 - 1);
                return true;
            }
            if (x > textView.getRight() + i) {
                C19383 c19384 = this.f39041;
                c19384.m44413(c19384.f62481 + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x - this.f11002);
            float f = this.f11000;
            if (fAbs > f || Math.abs(y - this.f10997) > f) {
                this.f10998 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f39046;
        int left = textView.getLeft();
        int i = this.f11006;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.f10995;
        int i4 = this.f11003 << 24;
        int i5 = this.f11007;
        Paint paint = this.f11004;
        paint.setColor(i4 | (i5 & 16777215));
        float f = right;
        float f2 = height;
        canvas.drawRect(i2, i3, f, f2, paint);
        if (this.f11001) {
            paint.setColor((-16777216) | (i5 & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f10996, getWidth() - getPaddingRight(), f2, paint);
        }
    }

    @Override // l.C11622
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8750(float f, boolean z, int i) {
        int height = getHeight();
        TextView textView = this.f39046;
        int left = textView.getLeft();
        int i2 = this.f11006;
        int right = textView.getRight() + i2;
        int i3 = height - this.f10995;
        Rect rect = this.f11005;
        rect.set(left - i2, i3, right, height);
        super.mo8750(f, z, i);
        this.f11003 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
        invalidate(rect);
    }
}
