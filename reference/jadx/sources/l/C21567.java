package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.᩶᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes.dex */
public class C21567 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24551 f68885;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f68886;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final Point f68887;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f68888;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final Rect f68889;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public Point f68890;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Rect f68891;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f68892;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int f68893;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4413 f68894;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Rect f68895;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Paint f68896;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float[] f68897;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f68898;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f68899;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final int f68900;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f68901;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int f68902;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f68903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f68904;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f68905;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C25360 f68906;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f68907;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final int f68908;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final Paint f68909;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24551 f68910;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68911;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final Paint f68912;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f68913;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6651 f68914;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f68915;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int f68916;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C14853 f68917;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int f68918;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public Path f68919;

    public C21567(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21567(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68912 = new Paint();
        Paint paint = new Paint();
        this.f68913 = paint;
        Paint paint2 = new Paint();
        this.f68896 = paint2;
        Paint paint3 = new Paint();
        this.f68909 = paint3;
        this.f68917 = new C14853();
        this.f68894 = new C4413();
        this.f68914 = new C6651();
        this.f68904 = 255;
        this.f68888 = 360.0f;
        this.f68907 = 0.0f;
        this.f68905 = 0.0f;
        this.f68901 = true;
        this.f68911 = -9539986;
        this.f68889 = new Rect();
        this.f68891 = new Rect();
        this.f68895 = new Rect();
        this.f68887 = new Point();
        this.f68897 = new float[3];
        this.f68890 = null;
        this.f68886 = context.getResources().getDisplayMetrics().density;
        this.f68903 = m49044(180.0f);
        int iM49044 = m49044(25.0f);
        this.f68902 = iM49044;
        int iM49045 = m49044(12.0f);
        this.f68892 = iM49045;
        int iM49046 = m49044(4.0f);
        this.f68898 = iM49046;
        int iM49047 = m49044(4.0f);
        this.f68918 = iM49047;
        int iM49048 = m49044(2.0f);
        this.f68893 = iM49048;
        this.f68908 = (iM49045 / 2) + iM49044;
        this.f68900 = m49044(2.0f);
        this.f68916 = m49044(24.0f);
        this.f68899 = m49044(1.0f);
        this.f68915 = Math.max(iM49046, Math.max(iM49047 / 2, iM49048));
        int i2 = (iM49044 / 5) + 1;
        this.f68910 = new C24551(i2);
        this.f68885 = new C24551(i2);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(m49044(1.0f));
        paint.setAntiAlias(true);
        paint2.setColor(-4342339);
        paint2.setStyle(style);
        paint2.setStrokeWidth(m49044(2.0f));
        paint2.setAntiAlias(true);
        paint3.setShadowLayer(m49044(1.0f), 0.0f, 0.0f, -7829368);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f68904);
        bundle.putFloat("hue", this.f68888);
        bundle.putFloat("sat", this.f68907);
        bundle.putFloat("val", this.f68905);
        bundle.putBoolean("show_alpha", this.f68901);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f68904 = bundle.getInt("alpha");
            this.f68888 = bundle.getFloat("hue");
            this.f68907 = bundle.getFloat("sat");
            this.f68905 = bundle.getFloat("val");
            this.f68901 = bundle.getBoolean("show_alpha");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.f68911;
        Paint paint = this.f68912;
        paint.setColor(i);
        Rect rect = this.f68889;
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, paint);
        float f = this.f68888;
        C14853 c14853 = this.f68917;
        c14853.m35781(rect, f);
        c14853.m35780(canvas);
        float f2 = this.f68907;
        float f3 = this.f68905;
        float fHeight = rect.height();
        int iWidth = (int) ((f2 * rect.width()) + rect.left);
        Point point = this.f68887;
        point.x = iWidth;
        point.y = (int) (((1.0f - f3) * fHeight) + rect.top);
        Paint paint2 = this.f68913;
        paint2.setColor(-12303292);
        float f4 = point.x;
        float f5 = point.y;
        int iM49044 = m49044(1.0f);
        int i2 = this.f68898;
        canvas.drawCircle(f4, f5, i2 - iM49044, paint2);
        paint2.setColor(-2236963);
        canvas.drawCircle(point.x, point.y, i2, paint2);
        C4413 c4413 = this.f68894;
        Rect rect2 = this.f68891;
        c4413.m14032(rect2);
        c4413.m14031(canvas);
        int iWidth2 = (int) (((this.f68888 * rect2.width()) / 360.0f) + rect2.left);
        point.x = iWidth2;
        int i3 = rect2.top;
        point.y = i3;
        int i4 = this.f68893;
        float f6 = rect2.bottom + i4;
        float f7 = iWidth2;
        float f8 = this.f68918 / 2.0f;
        Paint paint3 = this.f68896;
        canvas.drawRoundRect(f7 - f8, i3 - i4, f7 + f8, f6, 2.0f, 2.0f, paint3);
        if (this.f68901) {
            this.f68910.draw(canvas);
            int iM49046 = m49046();
            C6651 c6651 = this.f68914;
            Rect rect3 = this.f68895;
            c6651.m18589(iM49046, rect3);
            c6651.m18590(canvas);
            int iWidth3 = (int) (((this.f68904 * rect3.width()) / 255.0f) + rect3.left);
            point.x = iWidth3;
            int i5 = rect3.top;
            point.y = i5;
            float f9 = iWidth3;
            canvas.drawRoundRect(f9 - f8, i5 - i4, f8 + f9, rect3.bottom + i4, 2.0f, 2.0f, paint3);
        }
        Path path = this.f68919;
        if (path != null) {
            Paint paint4 = this.f68909;
            paint4.setColor(0);
            canvas.drawPath(path, paint4);
            canvas.save();
            canvas.clipPath(path);
            this.f68885.draw(canvas);
            canvas.restore();
            paint.setColor(m49046());
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM49045;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f68890 = null;
            } else if (action == 2) {
                zM49045 = m49045(motionEvent);
            }
            zM49045 = false;
        } else {
            if (!isFocused()) {
                requestFocus();
            }
            this.f68890 = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM49045 = m49045(motionEvent);
        }
        if (zM49045) {
            C25360 c25360 = this.f68906;
            if (c25360 != null) {
                DialogInterfaceOnClickListenerC6316.m18020((DialogInterfaceOnClickListenerC6316) c25360.f81882, Color.HSVToColor(this.f68904, new float[]{this.f68888, this.f68907, this.f68905}));
            }
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49045(MotionEvent motionEvent) {
        float f;
        Point point = this.f68890;
        int i = 0;
        if (point != null) {
            int i2 = point.x;
            int i3 = point.y;
            Rect rect = this.f68889;
            int i4 = rect.bottom;
            int i5 = this.f68892 / 2;
            float f2 = 0.0f;
            if (i3 < i4 + i5) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float fWidth = rect.width();
                float fHeight = rect.height();
                float f3 = rect.left;
                if (x < f3) {
                    f = 0.0f;
                } else {
                    f = x > ((float) rect.right) ? fWidth : x - f3;
                }
                float f4 = rect.top;
                if (y >= f4) {
                    f2 = y > ((float) rect.bottom) ? fHeight : y - f4;
                }
                float[] fArr = {(1.0f / fWidth) * f, 1.0f - ((1.0f / fHeight) * f2)};
                this.f68907 = fArr[0];
                this.f68905 = fArr[1];
                return true;
            }
            if (i2 > this.f68908 * 2) {
                Rect rect2 = this.f68891;
                if (i3 < i5 + rect2.bottom) {
                    float x2 = motionEvent.getX();
                    float fWidth2 = rect2.width();
                    float f5 = rect2.left;
                    if (x2 >= f5) {
                        f2 = x2 > ((float) rect2.right) ? fWidth2 : x2 - f5;
                    }
                    this.f68888 = (f2 * 360.0f) / fWidth2;
                    return true;
                }
                if (this.f68901) {
                    int x3 = (int) motionEvent.getX();
                    Rect rect3 = this.f68895;
                    int iWidth = rect3.width();
                    int i6 = rect3.left;
                    if (x3 >= i6) {
                        i = x3 > rect3.right ? iWidth : x3 - i6;
                    }
                    this.f68904 = (i * 255) / iWidth;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.f68901;
        int i3 = this.f68892;
        int i4 = this.f68903;
        if (z) {
            int paddingTop2 = getPaddingTop() + 1 + i4 + 1 + i3;
            int i5 = this.f68902;
            paddingBottom = C24579.m54897(paddingTop2, i5, i3, i5);
            paddingTop = getPaddingBottom();
        } else {
            paddingTop = ((this.f68916 * 2) + ((((getPaddingTop() + 1) + i4) + 1) + i3)) - this.f68899;
            paddingBottom = getPaddingBottom();
        }
        setMeasuredDimension(size, paddingTop + paddingBottom);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        boolean z2 = this.f68901;
        int i6 = paddingTop + 1;
        int i7 = this.f68903 + i6;
        Rect rect = this.f68889;
        rect.set(paddingLeft + 1, i6, width - 1, i7);
        int i8 = this.f68916;
        int i9 = this.f68908;
        int i10 = z2 ? i9 : i8;
        int i11 = z2 ? this.f68900 : this.f68899;
        Path path = new Path();
        this.f68919 = path;
        int i12 = rect.left;
        int i13 = rect.bottom + 1;
        int i14 = this.f68892;
        int i15 = i13 + i14;
        int i16 = i10 * 2;
        int i17 = i15 + i16;
        path.addCircle(i12 + i10, i15 + i10, i10 - i11, Path.Direction.CCW);
        this.f68885.setBounds(i12 + i11, i15 + i11, (i12 + i16) - i11, i17 - i11);
        Rect rect2 = this.f68891;
        int i18 = this.f68902;
        if (z2) {
            int iM31436 = C12669.m31436(i9, 2, paddingLeft, i14);
            int i19 = rect.bottom + 1 + i14;
            i5 = width;
            rect2.set(iM31436, i19, i5, i19 + i18);
        } else {
            i5 = width;
            int i20 = (int) (i18 * 1.2f);
            int i21 = ((i15 + i17) / 2) - (i20 / 2);
            rect2.set(C12669.m31436(i8, 2, paddingLeft, i14), i21, i5, i20 + i21);
        }
        if (z2) {
            int iM31437 = C12669.m31436(i9, 2, paddingLeft, i14);
            int i22 = rect2.bottom + i14;
            Rect rect3 = this.f68895;
            rect3.set(iM31437, i22, i5, i18 + i22);
            this.f68910.setBounds(rect3);
        }
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f68915);
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f68915);
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f68915);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f68915);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49048(C25360 c25360) {
        this.f68906 = c25360;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49046() {
        float f = this.f68888;
        float[] fArr = this.f68897;
        fArr[0] = f;
        fArr[1] = this.f68907;
        fArr[2] = this.f68905;
        return Color.HSVToColor(this.f68904, fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49047(int i) {
        float[] fArr = this.f68897;
        C8420.m22613(i, fArr);
        this.f68888 = fArr[0];
        this.f68907 = fArr[1];
        this.f68905 = fArr[2];
        if (this.f68901) {
            this.f68904 = Color.alpha(i);
        } else {
            this.f68904 = 255;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49049() {
        if (this.f68901) {
            this.f68901 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m49044(float f) {
        return (int) ((f * this.f68886) + 0.5f);
    }
}
