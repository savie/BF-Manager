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

/* JADX INFO: renamed from: l.ۧۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes3.dex */
public class C10758 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12169 f36669;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final int f36670;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Paint f36671;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f36672;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f36673;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Point f36674;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Rect f36675;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Paint f36676;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f36677;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int f36678;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final int f36679;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f36680;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f36681;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17107 f36682;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f36683;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f36684;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f36685;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Rect f36686;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int f36687;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int f36688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f36689;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int f36690;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f36691;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f36692;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12169 f36693;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f36694;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f36695;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C5818 f36696;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f36697;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16402 f36698;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Point f36699;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f36700;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C16069 f36701;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public Path f36702;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float[] f36703;

    public C10758(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10758(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36676 = new Paint();
        Paint paint = new Paint();
        this.f36697 = paint;
        Paint paint2 = new Paint();
        this.f36671 = paint2;
        Paint paint3 = new Paint();
        this.f36700 = paint3;
        this.f36696 = new C5818();
        this.f36682 = new C17107();
        this.f36698 = new C16402();
        this.f36691 = 255;
        this.f36689 = 360.0f;
        this.f36695 = 0.0f;
        this.f36692 = 0.0f;
        this.f36681 = true;
        this.f36694 = -9539986;
        this.f36680 = new Rect();
        this.f36675 = new Rect();
        this.f36686 = new Rect();
        this.f36674 = new Point();
        this.f36703 = new float[3];
        this.f36699 = null;
        this.f36684 = context.getResources().getDisplayMetrics().density;
        this.f36673 = m27060(180.0f);
        int iM27060 = m27060(25.0f);
        this.f36670 = iM27060;
        int iM27061 = m27060(12.0f);
        this.f36687 = iM27061;
        int iM27062 = m27060(4.0f);
        this.f36677 = iM27062;
        int iM27063 = m27060(4.0f);
        this.f36679 = iM27063;
        int iM27064 = m27060(2.0f);
        this.f36683 = iM27064;
        this.f36690 = (iM27061 / 2) + iM27060;
        this.f36678 = m27060(2.0f);
        this.f36672 = m27060(24.0f);
        this.f36685 = m27060(1.0f);
        this.f36688 = Math.max(iM27062, Math.max(iM27063 / 2, iM27064));
        int i2 = (iM27060 / 5) + 1;
        this.f36669 = new C12169(i2);
        this.f36693 = new C12169(i2);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(m27060(1.0f));
        paint.setAntiAlias(true);
        paint2.setColor(-4342339);
        paint2.setStyle(style);
        paint2.setStrokeWidth(m27060(2.0f));
        paint2.setAntiAlias(true);
        paint3.setShadowLayer(m27060(1.0f), 0.0f, 0.0f, -7829368);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f36691);
        bundle.putFloat("hue", this.f36689);
        bundle.putFloat("sat", this.f36695);
        bundle.putFloat("val", this.f36692);
        bundle.putBoolean("show_alpha", this.f36681);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f36691 = bundle.getInt("alpha");
            this.f36689 = bundle.getFloat("hue");
            this.f36695 = bundle.getFloat("sat");
            this.f36692 = bundle.getFloat("val");
            this.f36681 = bundle.getBoolean("show_alpha");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.f36694;
        Paint paint = this.f36676;
        paint.setColor(i);
        Rect rect = this.f36680;
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, paint);
        float f = this.f36689;
        C5818 c5818 = this.f36696;
        c5818.m16000(rect, f);
        c5818.m15999(canvas);
        float f2 = this.f36695;
        float f3 = this.f36692;
        float fHeight = rect.height();
        int iWidth = (int) ((f2 * rect.width()) + rect.left);
        Point point = this.f36674;
        point.x = iWidth;
        point.y = (int) (((1.0f - f3) * fHeight) + rect.top);
        Paint paint2 = this.f36697;
        paint2.setColor(-12303292);
        float f4 = point.x;
        float f5 = point.y;
        int iM27060 = m27060(1.0f);
        int i2 = this.f36677;
        canvas.drawCircle(f4, f5, i2 - iM27060, paint2);
        paint2.setColor(-2236963);
        canvas.drawCircle(point.x, point.y, i2, paint2);
        C17107 c17107 = this.f36682;
        Rect rect2 = this.f36675;
        c17107.m39927(rect2);
        c17107.m39926(canvas);
        int iWidth2 = (int) (((this.f36689 * rect2.width()) / 360.0f) + rect2.left);
        point.x = iWidth2;
        int i3 = rect2.top;
        point.y = i3;
        int i4 = this.f36683;
        float f6 = rect2.bottom + i4;
        float f7 = iWidth2;
        float f8 = this.f36679 / 2.0f;
        Paint paint3 = this.f36671;
        canvas.drawRoundRect(f7 - f8, i3 - i4, f7 + f8, f6, 2.0f, 2.0f, paint3);
        if (this.f36681) {
            this.f36669.draw(canvas);
            int iM27062 = m27062();
            C16402 c16402 = this.f36698;
            Rect rect3 = this.f36686;
            c16402.m38606(iM27062, rect3);
            c16402.m38607(canvas);
            int iWidth3 = (int) (((this.f36691 * rect3.width()) / 255.0f) + rect3.left);
            point.x = iWidth3;
            int i5 = rect3.top;
            point.y = i5;
            float f9 = iWidth3;
            canvas.drawRoundRect(f9 - f8, i5 - i4, f8 + f9, rect3.bottom + i4, 2.0f, 2.0f, paint3);
        }
        Path path = this.f36702;
        if (path != null) {
            Paint paint4 = this.f36700;
            paint4.setColor(0);
            canvas.drawPath(path, paint4);
            canvas.save();
            canvas.clipPath(path);
            this.f36693.draw(canvas);
            canvas.restore();
            paint.setColor(m27062());
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM27061;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f36699 = null;
            } else if (action == 2) {
                zM27061 = m27061(motionEvent);
            }
            zM27061 = false;
        } else {
            if (!isFocused()) {
                requestFocus();
            }
            this.f36699 = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM27061 = m27061(motionEvent);
        }
        if (zM27061) {
            C16069 c16069 = this.f36701;
            if (c16069 != null) {
                DialogInterfaceOnClickListenerC18046.m42034((DialogInterfaceOnClickListenerC18046) c16069.f51969, Color.HSVToColor(this.f36691, new float[]{this.f36689, this.f36695, this.f36692}));
            }
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27061(MotionEvent motionEvent) {
        float f;
        Point point = this.f36699;
        int i = 0;
        if (point != null) {
            int i2 = point.x;
            int i3 = point.y;
            Rect rect = this.f36680;
            int i4 = rect.bottom;
            int i5 = this.f36687 / 2;
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
                this.f36695 = fArr[0];
                this.f36692 = fArr[1];
                return true;
            }
            if (i2 > this.f36690 * 2) {
                Rect rect2 = this.f36675;
                if (i3 < i5 + rect2.bottom) {
                    float x2 = motionEvent.getX();
                    float fWidth2 = rect2.width();
                    float f5 = rect2.left;
                    if (x2 >= f5) {
                        f2 = x2 > ((float) rect2.right) ? fWidth2 : x2 - f5;
                    }
                    this.f36689 = (f2 * 360.0f) / fWidth2;
                    return true;
                }
                if (this.f36681) {
                    int x3 = (int) motionEvent.getX();
                    Rect rect3 = this.f36686;
                    int iWidth = rect3.width();
                    int i6 = rect3.left;
                    if (x3 >= i6) {
                        i = x3 > rect3.right ? iWidth : x3 - i6;
                    }
                    this.f36691 = (i * 255) / iWidth;
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
        boolean z = this.f36681;
        int i3 = this.f36687;
        int i4 = this.f36673;
        if (z) {
            int paddingTop2 = getPaddingTop() + 1 + i4 + 1 + i3;
            int i5 = this.f36670;
            paddingBottom = C8015.m21118(paddingTop2, i5, i3, i5);
            paddingTop = getPaddingBottom();
        } else {
            paddingTop = ((this.f36672 * 2) + ((((getPaddingTop() + 1) + i4) + 1) + i3)) - this.f36685;
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
        boolean z2 = this.f36681;
        int i6 = paddingTop + 1;
        int i7 = this.f36673 + i6;
        Rect rect = this.f36680;
        rect.set(paddingLeft + 1, i6, width - 1, i7);
        int i8 = this.f36672;
        int i9 = this.f36690;
        int i10 = z2 ? i9 : i8;
        int i11 = z2 ? this.f36678 : this.f36685;
        Path path = new Path();
        this.f36702 = path;
        int i12 = rect.left;
        int i13 = rect.bottom + 1;
        int i14 = this.f36687;
        int i15 = i13 + i14;
        int i16 = i10 * 2;
        int i17 = i15 + i16;
        path.addCircle(i12 + i10, i15 + i10, i10 - i11, Path.Direction.CCW);
        this.f36693.setBounds(i12 + i11, i15 + i11, (i12 + i16) - i11, i17 - i11);
        Rect rect2 = this.f36675;
        int i18 = this.f36670;
        if (z2) {
            int iM5620 = C1694.m5620(i9, 2, paddingLeft, i14);
            int i19 = rect.bottom + 1 + i14;
            i5 = width;
            rect2.set(iM5620, i19, i5, i19 + i18);
        } else {
            i5 = width;
            int i20 = (int) (i18 * 1.2f);
            int i21 = ((i15 + i17) / 2) - (i20 / 2);
            rect2.set(C1694.m5620(i8, 2, paddingLeft, i14), i21, i5, i20 + i21);
        }
        if (z2) {
            int iM5621 = C1694.m5620(i9, 2, paddingLeft, i14);
            int i22 = rect2.bottom + i14;
            Rect rect3 = this.f36686;
            rect3.set(iM5621, i22, i5, i18 + i22);
            this.f36669.setBounds(rect3);
        }
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f36688);
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f36688);
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f36688);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f36688);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27064(C16069 c16069) {
        this.f36701 = c16069;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27062() {
        float f = this.f36689;
        float[] fArr = this.f36703;
        fArr[0] = f;
        fArr[1] = this.f36695;
        fArr[2] = this.f36692;
        return Color.HSVToColor(this.f36691, fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27063(int i) {
        float[] fArr = this.f36703;
        C3057.m9161(i, fArr);
        this.f36689 = fArr[0];
        this.f36695 = fArr[1];
        this.f36692 = fArr[2];
        if (this.f36681) {
            this.f36691 = Color.alpha(i);
        } else {
            this.f36691 = 255;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27065() {
        if (this.f36681) {
            this.f36681 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m27060(float f) {
        return (int) ((f * this.f36684) + 0.5f);
    }
}
